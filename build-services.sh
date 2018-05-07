#!/bin/bash
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
   
      echo "[INFO] Performing Maven Clean: "
      MAVEN_RESULTS=`mvn -B clean`
   
      if [[ $MAVEN_RESULTS =~ (BUILD[[:space:]]SUCCESS) ]]; then
         echo "[INFO] --Successfully Cleaned: " $i 
      fi
   
      if [[ $MAVEN_RESULTS =~ (BUILD[[:space:]]FAILURE) ]]; then
         echo "[INFO] --Failed to Clean: " $i
         exit 1
      fi

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
      #echo "[INFO] Entering Into Directory:" `pwd`
    done
}

echo "Starting the Build Procedure"
buildAllServices
echo "End of Script"
