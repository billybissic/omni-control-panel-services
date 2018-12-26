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


## Purpose : Builds all maven projects in specified Directory

buildAllServices()
{
   PARENT_DIRECTORY=`pwd`
   DIRECTORY_PREFIX="com.omni.systems."
   DIRECTORIES=( `ls -d ${DIRECTORY_PREFIX}*` )
   echo "[INFO] Parent Directory:" $PARENT_DIRECTORY
   echo "[INFO] Directory Prefix:" $DIRECTORY_PREFIX

   #Directories To Process
   for i in "${DIRECTORIES[@]}"
   do
      echo "[INFO] Entering Into Directory: " $i
      cd ${i}

      echo "[INFO] Performing Maven Build: "

      MAVEN_BUILD_RESULTS=`mvn -B package`

      if [[ $MAVEN_BUILD_RESULTS =~ (BUILD[[:space:]]SUCCESS) ]]; then
         echo "[INFO] --Successfully Built: " $i
      fi

      if [[ $MAVEN_BUILD_RESULTS =~ (BUILD[[:space:]]FAILURE) ]]; then
         echo "[INFO] --Failed To Build: " $i
         exit 1
      fi

      cd ..
    done
}

echo "[INFO] Starting the Build Procedure"
buildAllServices
echo "[INFO] End of Build Procedure"
