#!/bin/bash
###########
#
# MIT License
#
# Copyright (c) 2018 Billy Bissic
#
# Permission is hereby granted, free of charge, to any person obtaining a copy
# of this software and associated documentation files (the "Software"), to deal
# in the Software without restriction, including without limitation the rights
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
# copies of the Software, and to permit persons to whom the Software is
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in all
# copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
# SOFTWARE.
#
############

## Purpose : To perform the maven packaging for each project.
ME="package-build.sh"
showHelp() {
    echo " "
    echo "HELP"
    echo "---------------------------------------------------------------------"
    echo "Available Commands: "
    echo "---------------------------------------------------------------------"
    echo " Basic use ./${ME} -f PackageName.1.1 -r 33"
    echo "-h : Shows this help document."
    echo "-v : Optional, Allows verbose output during script runtime."
    echo "-f : Required, Sets output package file name."
    echo "-r : Required, Sets build revision number used in naming the package."
    echo "-s : Optional, Sets the script run to silent, no possible output except errors"
    echo "     overrides verbose when used together."
    echo "----------------------------------------------------------------------"
}

# A POSIX variable
OPTIND=1   # Reset in case getopts has been used previously in the shell.

# Initialize our own variables:
BITBUCKET_BUILD_NUMBER=""
BUILD_NAME=""
VERBOSE=0
SILENT=0

while getopts ":h:v:f:r:s:" opt; do
  case "${opt}" in
  h|\?)
       showHelp
       exit 0
       ;;
  v)   VERBOSE=1
       ;;
  f)   BUILD_NAME=${OPTARG}
       ;;
  r)   BITBUCKET_BUILD_NUMBER=${OPTARG}
       ;;
  s)   SILENT=1
       ;;
  esac
done

shift $((OPTIND-1))

[ "${1:-}" = "--" ] && shift

echo "verbose=${VERBOSE}, BUILD_NAME='${BUILD_NAME}' build_number='${BITBUCKET_BUILD_NUMBER}', Leftovers: $@"

packageAllServices()
{
   PARENT_DIRECTORY=`pwd`
   DIRECTORY_PREFIX="com.omni.systems."
   PACKAGE_NAME="${BUILD_NAME}.${BITBUCKET_BUILD_NUMBER}.tar.gz"
   PACKAGE_DIRECTORY="${PARENT_DIRECTORY}/${BUILD_NAME}.${BITBUCKET_BUILD_NUMBER}"
   DIRECTORIES=( `ls -d ${DIRECTORY_PREFIX}*` )
   echo "[INFO] Parent Directory:" $PARENT_DIRECTORY
   echo "[INFO] Directory Prefix:" $DIRECTORY_PREFIX

   #Clean Package Directory If Exists

   if [ -f $PACKAGE_DIRECTORY ]
   then
      rm -rf $PACKAGE_DIRECTORY
      if [ $? -eq 1 ]
      then
        echo "[ERROR] ${ME} Failed to remove existing directory: ${PACKAGE_DIRECTORY}"
        echo "[INFO] Exiting..."
        exit 1
      else
        echo "[INFO] Removed directory: ${PACKAGE_DIRECTORY}"
      fi

      mkdir $PACKAGE_DIRECTORY
      if [ $? -eq 1 ]
      then
        echo "[ERROR] ${ME} Failed to make ${PACKAGE_DIRECTORY}; cannot proceed"
        echo "[INFO] Exiting..."
        exit 1
      fi
   fi

   if [ ! -f $PACKAGE_DIRECTORY ]
   then
      mkdir $PACKAGE_DIRECTORY
   fi

   echo "[INFO] Beginning build validations and file packaging..."

   #Directories To Process
   for i in "${DIRECTORIES[@]}"
   do

      TARGET_DIR="${PARENT_DIRECTORY}/${i}/target/"
      echo "[INFO] Entering Into Directory: ${TARGET_DIR}"

      cd $TARGET_DIR

      #echo " "

      #echo `pwd`

      if [ $? -eq 1 ]
      then
        echo "[ERROR] ${ME} Target directory missing; cannot proceed"
        echo "[INFO] Exiting..."
        exit 1
      fi

      TARGET_FILE=( `ls *.war`)

      TARGET="${TARGET_DIR}/${TARGET_FILE}"

      echo "[INFO] Copying WAR file: ${TARGET}"
      cp $TARGET $PACKAGE_DIRECTORY

      if [ $? -eq 1 ]
      then
        echo "[ERROR] ${ME} Error copying WAR file."
        exit 1
      fi

      cd ..
      pwd
    done

    cd $PARENT_DIRECTORY

    cp scripts/backup-services.sh $PACKAGE_DIRECTORY
    cp scripts/install-services.sh $PACKAGE_DIRECTORY

    tar -zcvf $PACKAGE_NAME $PACKAGE_DIRECTORY
}

if [ -z ${BITBUCKET_BUILD_NUMBER:+x} ]
then
   echo " "
   echo "[ERROR] ${ME} Build revision number is required."
   showHelp
   echo " "
   echo "[INFO] Exiting..."
   exit 1
fi

if [ -z ${BUILD_NAME:+x} ]
then
   echo " "
   echo "[ERROR] ${ME} Package name is required."
   showHelp
   echo " "
   echo "[INFO] Exiting..."
   exit 1
fi

echo "[INFO] Packaging services..."
packageAllServices
echo "[INFO] Done."
