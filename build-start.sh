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


## Purpose : Dynamically develops the super script from the scripts in the scripts directory.
##              Then executes said script
ME="build-start.sh"
showHelp() {
    echo " "
    echo "HELP"
    echo "---------------------------------------------------------------------"
    echo "Available Commands: "
    echo "---------------------------------------------------------------------"
    echo " Basic use ./${ME} -f [PackageName.build.#.#] -r [##]"
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

echo "verbose=${VERBOSE}, build_name="${BUILD_NAME}" build_number='${BITBUCKET_BUILD_NUMBER}', Leftovers: $@"

startBuild() {

PARENT_DIR=`pwd`
SCRIPT_DIR="scripts/"

## Required Scripts
PRE_BUILD_SCRIPT="clean-services.sh"
BUILD_SCRIPT="build-services.sh"
POST_BUILD_SCRIPT="package-build.sh"
STAGING_SCRIPT="stage-package.sh"
BACKUP_SCRIPT="${SCRIPT_DIR}backup-services.sh"
INSTALL_SCRIPT="${SCRIPT_DIR}install-services.sh"
ROLLBACK_SCRIPT="${SCRIPT_DIR}rollback-services.sh"

# Validate that required scripts exist
echo "[INFO] Beginning script validations..."

if [ ! -f "$PRE_BUILD_SCRIPT" ]
then

    echo "[ERROR] ${ME}: Not able to locate " $PRE_BUILD_SCRIPT
    exit 1
else
    echo "[INFO] Located Pre Build Script: " $PRE_BUILD_SCRIPT
fi

if [ ! -f "$BUILD_SCRIPT" ]
then
   echo "[ERROR] ${ME}: Not able to locate " $BUILD_SCRIPT
   exit 1
else
    echo "[INFO] Located Build Scrit: " $BUILD_SCRIPT
fi

if [ ! -f "$POST_BUILD_SCRIPT" ]
then
    echo "[ERROR] ${ME}: Not able to locate " $POST_BUILD_SCRIPT
    exit 1
else
    echo "[INFO] Located Post Build Script: " $POST_BUILD_SCRIPT
fi

if [ ! -f "$STAGING_SCRIPT" ]
then
    echo "[ERROR] ${ME}: Not able to locate " $STAGING_SCRIPT
    exit 1
else
    echo "[INFO] Located Staging Script: " $STAGING_SCRIPT
fi

if [ ! -f "$BACKUP_SCRIPT" ]
then
  echo "[ERROR] ${ME}: Not able to locate ${BACKUP_SCRIPT}"
  exit 1
else
  echo "[INFO] Located Backup Script: " $BACKUP_SCRIPT
fi

if [ ! -f "$INSTALL_SCRIPT" ]
then
    echo "[ERROR] ${ME} Not able to locate ${INSTALL_SCRIPT}"
    exit 1
else
    echo "[INFO] Located Install Script: " $INSTALL_SCRIPT
fi

if [ ! -f "$ROLLBACK_SCRIPT" ]
then
  echo "[ERROR] ${ME} Not able to locate ${ROLLBACK_SCRIPT}"
  exit 1
else
  echo "[INFO] Located Rollback Script" $ROLLBACK_SCRIPT
fi

echo "[INFO] Done..."
echo "[INFO] Starting maven clean script..."

. "$PRE_BUILD_SCRIPT"

if [ $? -eq 1 ]
then
    echo "[ERROR] ${PRE_BUILD_SCRIPT}: Failed..."
    echo "[INFO Halting..."
    exit 1
fi

echo "Starting build process..."

. "$BUILD_SCRIPT"

if [ $? -eq 1 ]
then
    echo "[ERROR] ${BUILD_SCRIPT} Failed..."
    echo "[INFO] Halting..."
    exit 1
fi

echo "[INFO] Done..."

echo "[INFO] Starting packaging process..."

. "$POST_BUILD_SCRIPT" -f "${BUILD_NAME}" -r "$BITBUCKET_BUILD_NUMBER"

if [ $? -eq 1 ]
then
    echo "[ERROR] ${POST_BUILD_SCRIPT}: Failed..."
    echo "[INFO] Halting..."
    exit 1
fi
}

if [ -z ${BITBUCKET_BUILD_NUMBER:+x} ]
then
   echo " "
   echo "[ERROR] ${ME}: Build revision number is required."
   showHelp
   echo " "
   echo "[INFO] Exiting..."
   exit 1
fi

if [ -z ${BUILD_NAME:+x} ]
then
   echo " "
   echo "[ERROR] ${ME}: Package name is required."
   showHelp
   echo " "
   echo "[INFO] Exiting..."
   exit 1
fi

echo "Starting build process..."
startBuild
echo "Done."
