#!/bin/bash
buildAllServices()
{
   PARENT_DIRECTORY=`pwd` 
   DIRECTORY_PREFIX="com.omni.systems."
   DIRECTORIES=( `ls -d ${DIRECTORY_PREFIX}*` )
   echo "Parent_Directory =" $PARENT_DIRECTORY
   echo "Directory_Prefix =" $DIRECTORY_PREFIX

   #echo "Directories To Process: "
   for i in "${DIRECTORIES[@]}"
   do
      echo "Entering Into Directory: " $i
      cd ${i}
   
      echo "Performing Maven Clean: "
      MAVEN_RESULTS=`mvn -B clean`
   
      if [[ $MAVEN_RESULTS =~ (BUILD[[:space:]]SUCCESS) ]]; then
         echo "Successfully Cleaned: " $i 
      fi
   
      if [[ $MAVEN_RESULTS =~ (BUILD[[:space:]]FAILURE) ]]; then
         echo "Failed to Clean: " $i
      fi

      echo "Performing Maven Build: "
   
      MAVEN_BUILD_RESULTS=`mvn -B package`
 
      if [[ $MAVEN_BUILD_RESULTS =~ (BUILD[[:space:]]SUCCESS) ]]; then
         echo "Successfully Built: " $i
      fi
   
      if [[ $MAVEN_BUILD_RESULTS =~ (BUILD[[:space:]]FAILURE) ]]; then
         echo "Failed To Build: " $i
      return 1
      fi

      cd ..
      #echo "Entering Into Directory:" `pwd`
    done
}

echo "Starting the Build Procedure"
buildAllServices
echo "End of Script"
