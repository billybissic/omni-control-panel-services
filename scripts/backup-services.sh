FILE_SUFFIX=`date +%Y%m%d%H%M%S`
FILE_PREFIX='OMNI-Services.Backup'
FILE_TYPE="tar.gz"
TOMCAT_ROOT_DIR="/opt/tomcat/"
ROOT_BACKUP_DIR="${TOMCAT_ROOT_DIR}backups"
NEW_BACK_DIR="${FILE_PREFIX}.${FILE_SUFFIX}"

WEBAPP_DIR="${TOMCAT_ROOT_DIR}webapp"

BACKUP_DIR="${FILE_PREFIX}.${FILE_SUFFIX}"
cd $TOMCAT_ROOT_DIR
mkdir $ROOT_BACKUP_DIR
cd $ROOT_BACKUP_DIR
mkdir
cd $WEBAPP_DIR



if [ $? -eq 1 ]
then
  echo "[ERROR] ${ME} Target directory missing; cannot proceed"
  echo "[INFO] Exiting..."
  exit 1
fi
