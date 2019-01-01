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
ME="install-package.sh"
showHelp() {
    echo " "
    echo "HELP"
    echo "---------------------------------------------------------------------"
    echo "Available Commands: "
    echo "---------------------------------------------------------------------"
    echo " Basic use ./${ME} -i -f [PACKAGENAME.BUILD.#.#] -r [RELEASE_NUMBER] -d [INSTALL_PATH] -l [PACKAGE_STAGE_PATH]"
    echo "-h : Shows this help document."
    echo "-v : Optional, Allows verbose output during script runtime."
    echo "MODES: -i, -b, -p, one of the three are required. See below for details."
    echo "-i : Sets the installer to install mode."
    echo "-b : Sets the installer to back up applications in production."
    echo "     This gets called automatically under the install mode."
    echo "-p : Sets the installer to roll back to a previous release."
    echo "-d : Required, Sets the install destination directory."
    echo "-l : Required, Staging location for the installation package."
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
BB_AUTH_STRING=""
BITBUCKET_REPO_OWNER=""
BITBUCKET_REPO_SLUG=""
BUILD_NAME=""
INSTALL_DIRECTORY=""
STAGING_LOCATION=""
VERBOSE=0
INSTALL=0
SILENT=0
BACKUP=0
PREVIOUS=0

while getopts ":h:v:i:b:p:o:f:r:d:l:q:" opt; do
  case "${opt}" in
  h|\?)
       showHelp
       exit 0
       ;;
  v)   VERBOSE=1
       ;;
  i)   INSTALL=1
       ;;
  b)   BACKUP=1
       ;;
  p)   PREVIOUS=1
       ;;
  o)   BITBUCKET_REPO_OWNER=${OPTARG}
       ;;
  f)   BUILD_NAME=${OPTARG}
       ;;
  r)   BITBUCKET_BUILD_NUMBER=${OPTARG}
       ;;
  d)   INSTALL_DIRECTORY=${OPTARG} # directory in which the contents of the package will be installed to.
       ;;
  l)   STAGING_LOCATION=${OPTARG} # can be used to specify staging area for the new package or backup location for the package to rollback to.
       ;;
  s)   BITBUCKET_REPO_SLUG=${OPTARG}
       ;;
  q)   SILENT=1
       ;;
  esac
done

shift $((OPTIND-1))

[ "${1:-}" = "--" ] && shift

echo "verbose=${VERBOSE}, build_name="${BUILD_NAME}" build_number='${BITBUCKET_BUILD_NUMBER}', Leftovers: $@"

install() {
  BUILD_PACKAGE="${BUILD_NAME}.{$BITBUCKET_BUILD_NUMBER}.tar.gz"

  cd "${SERVICES_PACKAGE_DIRECTORY}"

  tar -xvzf "${ARTIFACT_DIRECTORY}"
  cd /u/data/omni/sys/staging/opt/atlassian/pipelines/agent/build/OMNI-Services.build.1.0.107
  cp *.war /opt/tomcat/webapps
  ll -rt /opt/tomcat/webapps
}
