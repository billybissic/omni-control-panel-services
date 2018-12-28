FILE_SUFFIX=`date +%Y%m%d%H%M%S`
FILE_PREFIX='OMNI-Services.Backup'
FILE_TYPE="tar.gz"
TOMCAT_ROOT_DIR="/opt/tomcat/"
WEBAPP_DIR="${TOMCAT_ROOT_DIR}webapp"

BACKUP_DIR="${FILE_PREFIX}.${FILE_SUFFIX}"
mkdir $BACKUP_DIR
cd

if [ $? -eq 1 ]
then
  echo "[ERROR] ${ME} Target directory missing; cannot proceed"
  echo "[INFO] Exiting..."
  exit 1
fi
