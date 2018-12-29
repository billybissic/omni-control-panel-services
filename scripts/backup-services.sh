ME="backup-services.sh"
FILE_SUFFIX=`date +%Y%m%d%H%M%S`
FILE_PREFIX='OMNI-Services.Backup'
FILE_TYPE="tar.gz"
TOMCAT_ROOT_DIR="/opt/tomcat/"
ROOT_BACKUP_DIR="${TOMCAT_ROOT_DIR}backups"
WEBAPP_DIR="${TOMCAT_ROOT_DIR}webapps"
BACKUP_DIR="${ROOT_BACKUP_DIR}/${FILE_PREFIX}.${FILE_SUFFIX}"
PACKAGE_NAME="${FILE_PREFIX}.${FILE_SUFFIX}.${FILE_TYPE}"

backupServices() {
   # Make Tomcat Root Directory
   if [ ! -d $ROOT_BACKUP_DIR ]
   then
      mkdir $ROOT_BACKUP_DIR
      if [ $? -eq 1 ]
      then
        echo "[ERROR] ${ME} Not able to create ${ROOT_BACKUP_DIR}; cannot proceed"
        echo "[INFO] Exiting..."
        exit 1
      fi
   fi

   mkdir $BACKUP_DIR
   if [ $? -eq 1 ]
   then
     echo "[ERROR] ${ME} Not able to create ${BACKUP_DIR}; cannot proceed"
     echo "[INFO] Exiting..."
     exit 1
   fi

   cd $WEBAPP_DIR
   if [ $? -eq 1 ]
   then
     echo "[ERROR] ${ME} Target directory missing; cannot proceed"
     echo "[INFO] Exiting..."
     exit 1
   fi

   if [ `ls -1s *.war 2>/dev/null | wc -l ` -gt 0  ]
   then
      echo "[INFO] War files exist, attempting to copy"
      cp *.war $BACKUP_DIR

       if [ $? -eq 1 ]
       then
          echo "[ERROR] ${ME} Not able to copy war files to back up directory; cannot proceed"
          echo "[INFO] Halting script..."
          exit 1
       fi

       cd $BACKUP_DIR
       pwd
       ls -ls

       if [ `ls -1s *.war 2>/dev/null | wc -l ` -gt 0 ]
       then
          cd $ROOT_BACKUP_DIR
          tar -zcvf $PACKAGE_NAME $BACKUP_DIR
          if [ $? -eq 1 ]
          then
             echo "[WARNING] $ME Not able to compress  back up directory"
             echo "[INFO] Continuing with the install..."
          else
             echo "[INFO] Compressed successfully, removing backup directory."
             rm -rf $BACKUP_DIR
          fi
       else
          echo "[ERROR] $ME Not able to locate war files in backup directory"
          echo "[INFO] Exiting.."
          exit 1
       fi
   else
      echo "[WARNING] ${ME} No war files to backup; Assuming this is the first install"
      echo "[INFO] Continuing with install.."
   fi
}

removeServices() {
   cd $WEBAPP_DIR
   if [ `ls -1s *.war 2>/dev/null | wc -l ` -gt 0  ]
   then
      rm *.war
      if [ $? -eq 1 ]
      then
         echo "[ERROR] not able to delete the files from webapps. Investigate"
         echo "Exiting..."
         exit 1
      fi
   else
      echo "[INFO] No files to remove. Installation may begin"
      exit 0
   fi
}
echo "[INFO] Backing up services..."
backupServices
removeServices
echo "[INFO] Done."
