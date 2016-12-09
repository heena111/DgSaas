
package com.dataguise.util;

import java.util.ArrayList;

/* 
* @author Anurag Kirpal
 *
 */
public class ControllerConstants {

	public static String   ORACLE_CONN_TYPE_B = "B";
	public static String ORACLE_CONN_TYPE_BASIC = "Basic";
	public static String ORACLE_CONN_TYPE_TNS = "TNS";
	public static String BLANK_STRING = "";
	public static String CONNECTION_TYPE_ORACLE = "Oracle";
	public static String ORACLE_INSTANCE_ID_METHOD_SID = "SID";
	public static String ORACLE_INSTANCE_ID_METHOD_SERVICE_NAME = "Service Name";
	public static String ERROR_GETTING_DATABASES = "Error while getting Databases in controller";
	public static String ERROR_GETTING_TABLES = "Error while getting tables in controller";
	public static String ERROR_GETTING_COLUMNS = "Error while getting columns in controller";	
	public static String ERROR_GETTING_REFERENCES = "Error while getting references in controller";
	public static String ERROR_GETTING_COLUMNDATA = "Error while getting column data in controller";
	public static String ERROR_CODE = "Error Code:";
	public static String ERROR_TEXT = ":Error text:";
	public static String ERROR_MESSAGE = ":Error message:";
	public static String ERROR_GETTING_SCHEMAS = "Error while getting schemas in controller";
	public static String ERROR_PARAMETERS = "Error Parameters:";
	public static String CLASS = "Class:";
	public static String CLASS_CALLING_METHOD_NAME = ": Calling Method name :";
	public static String CLASS_ENDING_METHOD_NAME = ": Ending Method name :";
	public static String ENTERING_METHOD = "Entering method";
	public static String EXITING_METHOD = "Exiting method";
	public static String DG_INFRASTRUCTURE_NODES_PK = "id";
	public static String DG_INFRASTRUCTURE_NODES = "dg_infrastructure_nodes";
	public static String CONTROLLER_WSDL = "controllerWSDL";
	public static String DISCOVER_AGENT_WSDL = "discoverAgentWSDL";
	public static String  DISCOVER_AGENT_NAME = "DiscoverAgent1";
	public static String  AGENT_TYPE_DDA = "DDA";
	public static String  AGENT_TYPE_FLUME="DGF";
	public static String HTTP= "http://";
	public static String DGCONTROLLER_CONTROLLERCONNECTOR_WSDL = "/dgcontroller/ControllerConnectorPort?wsdl";
	public static String COLON = ":";
	public static String USER_DIR = "user.dir";
	public static String FROM_DGINFRASTRUCTURE_NODES_WHERE_NAME = "from DgInfrastructureNodes where name ='";
	public static String FROM_DGINFRASTRUCTURE_NODES_WHERE_TYPE = "from DgInfrastructureNodes where type ='";
	public static String SINGLE_QUOTE = "'";
	public static String HIBERNATE_FAULT = "Hibernate Fault";
	public static String LICENSE_FILE_PATH = "";
	public static String APPLICATION_CONTEXT_NAME = "applicationContextExample.xml";
	public static String LICENSE_CLIENT_BEAN_NAME = "licenseClient";
	public static String LICENSE_IS_VALID = "License is valid";
	public static String TABLE_FILE_TASK_PATTERNS  = "DgFileTaskPatterns";
	public static String LICENSE_IS_INVALID = "License is invalid";
	public static String ERROR_IN_VALIDATING_LICENSE = "Error in validating license";
	public static String AGENT_SAVED_SUCCESSFULLY = "Agent saved successfully";
	public static String AGENT_ALREADY_EXISTS = "One Agent of this type already exists";
	public static String SESSION_IS_NULL = "Session is null";
	public static String ERROR_IN_CONFIGURING_AGENT = "Error in configuring agent";
	public static String DELETED_AGENT_SUCCESSFULLY = "Agent deleted succesfully";
	public static String ACTION = "action"; 
	public static String SELECTED_LICENSE_FILE = "selectedLicenseFile";
	public static String LICENSE_INSTALLED_SUCCESSFULLY = " is installed succesfully";
	public static String LICENSE_NOT_INSTALLED = " is not installed";
	public static String ERROR_READ_WRITE_LICENSE_FILE = "Error in read/write license file";
	public static String ERROR_IN_INSTALLING_LICENSE_FILE = "Error in installing license file : ";
	public static String RESPONSE_TYPE = "text/html";
	public static String ERROR_IN_FETCHING_FROM_DB = "Error in fetching agents from db";
	public static String OPERATION = "operation";
	public static String DISCOVERER_CONNECTOR_WSDL = "/dgDiscoverAgent/services/dgDiscoverAgent";
	public static String ERROR_IN_SAVE_MASKER_TASK = "Error in saving Masker task";
	public static String ERROR_IN_LOAD_MASKER_TASK = "Error in loading Masker task";
	public static String ERROR_LOAD_SENSITIVE_COLUMNS_ERROR = "Error in loading sensitive columns for DB";
	public static String CREATE_COLUMNAR_STRUCTURE = "create columnar structure";
	public static String ASSIGN_POLICIES_TO_DOMAIN = "assign policies to domain";
	
	public static String ERROR_IN_START_MASKER_TASK = "Error in starting Masker task";
	public static String ERROR_IN_RESUME_MASKER_TASK = "Error in resuming Masker task";
	public static String ERROR_IN_START_SQOOP_TASK = "Error in starting Sqoop task";
	public static String ERROR_IN_GET_MASKER_RESULTS = "Error in get Masker results";
	public static String ERROR_IN_GET_SQOOP_RESULTS = "Error in getting Sqoop results";
	public static String ERROR_IN_GET_MASKER_STATUS = "Error in get Masker status";
	public static String LICENSE_FILE_DELIMITER = ";";
	public static String LICENSE_APP_VAL_DB = "DB";
	public static String LICENSE_NUMRUNS = "Numruns";
	public static String LICENSE_APPNAME = "AppName";
	public static String HADOOP_AGENT_WS = "/HDFSAgent/services/";
	public static String HADOOP_BROWSER_URL = "/HDFSAgent/browser";
	public static String CLOUD_BROWSER_URL = "/status";
	public static String CLOUD_AGENT_WS = "/browser/s3";
	
	public static String EQUAL_TO = "=";
	public static String PLUS = "+";
	public static String ESCAPED_PLUS = "\\+";
	public static String LICENSE_APP_VAL_DGM = "DGM";
	public static String LICENSE_APP_VAL_DGD = "DGD";
	public static String LICENSE_APP_VAL_All = "All";
	public static String LICENSE_APP_VAL_DGDASH = "DGDASH";
	public static String MASKER_CONNECTOR_WSDL = "/dgAgent/CentralMaskingAgentPort/MaskerAgentService/";
	public static String DELETE_FROM = "Delete from ";
	public static String TABLE_NAME_DG_DISCOVER_SAFE = "dg_discover_safe" ; 
	public static String WHERE_TASKID = " where taskid = ";
	public static String DELETED_RECORD_COUNT = "deleted record count is ";
	public static String FROM_DgDiscoverSafeTb = "from DgDiscoverSafe ";
	public static String ERROR_GETTING_INSTALLED_LICENSES = "Error in getting installed licenses";
	public static String CENTRAL_CONTROLLER_BEAN_NAME = "centralController";
	
	public static String INSERT_COMMAND = "insert";
	public static String UPDATE_COMMAND = "update";
	public static String DELETE_COMMAND = "delete";
	public static String LOAD_COMMAND = "load";
	public static String LOG_IN="log-in";
	public static String LOG_OUT = "log-out";
	public static String SESSION_TIMEOUT = "session timeout";
	public static String LOGIN_FAILED= "login failed";
	public static String START_COMMAND ="start";
	public static String CANCEL_COMMAND = "cancel";
	public static String FLUME_PUSH_CONFIG = "flume push config";
	public static String FLUME_PUSH_STRUCT = "flume push structure";
	public static String FTP_PUSH_CONFIG = "ftp push config";
	public static String INSTALL_COMMAND = "install";
	public static String ACTIVATE_COMMAND = "activate";
	public static String DEACTIVATE_COMMAND = "deactivate";
	public static String EXPORT_COMMAND = "export";
	public static String IMPORT_COMMAND = "import";

	public static String SUBSCRIBE = "Subscribe";
	public static String UNSUBSCRIBE = "Unsubscribe";
	
	public static String TESTING_HDFS_CONN="Testing Hdfs Conn";
	public static String GET_CLUSTER_DETAILS="Get Cluster Details";
	public static String SAVE_PDF_RESULTS="Save pdf results";
	public static String SAVE_CSV_RESULTS="Save csv results";
	public static String SAVE_ENTITLEMENT_REPORT="Save Entitlement Report";
	public static String VIEW_MONITORING_REPORT="View Monitoring Report";
	public static String FAILED="failed";
	public static String COMPLETED="completed";
	public static String TEST_DISCOVERY_CONN="Test Discovery Conn";
	public static String TEST_MASKER_CONN="Test Masker Conn";

	
	public static String TABLE_REGEX_PATTERNS = "dg_regex_patterns";
	public static String TABLE_AUDIT_EVENTS ="dg_audit_events";
	public static String TABLE_DISCOVER_NMAP_SETS = "dg_discover_nmap_sets";
	public static String TABLE_DISCOVER_FILE_SETS = "dg_discover_file_sets";
	public static String TABLE_DISCOVER_HADOOP_FILE_SETS = "dg_discover_hadoop_file_sets";
	public static String TABLE_DISCOVER_HADOOP_SEARCH_LOCATIONS = "DgDiscoHadoopSearchLoc";
	public static String TABLE_HADOOP_TASK_PATTERN = "DgHadoopTaskPatterns";
	public static String TABLE_HADOOP_TASK_RESULTS_DB = "dg_hadoop_task_results_db";
	public static String TABLE_HADOOP_SENSITIVE_INFO_DB = "dg_hadoop_sensitive_info_summary_db";	
	public static String TABLE_DG_LOAD_RESULTS_HISTORY ="dg_load_request_history";
	public static String TABLE_DG_MASKING_DB_RESULTS ="dg_masking_db_results";
	public static String TABLE_DG_SQOOP_DB_RESULTS ="dg_sqoop_db_results";
	public static String TABLE_DG_DISCOVER_DB_RESULTS ="dg_discover_db_results";
	public static String TABLES_DG_MASKING_SETS_COLUMNS ="dg_masking_sets,dg_masking_columns";
	public static String TABLES_DG_DISCOVER = "dg_task_definitions, dg_discover_sets, dg_discover_criterias, dg_regex_patterns, dg_servers, dg_discover_dbs, dg_discover_crit_patterns";
	public static String TABLE_DG_SESSION_INFO = "dg_session_info";
	public static String TABLE_DG_DISCOVER_SETS="dg_discover_sets";
	public static String TABLE_DG_MASKER_SETS="dg_masking_sets";
	public static String TABLE_DG_HADOOP_SETS="dg_discover_hadoop_file_sets";
	public static String TABLE_DG_CONNECTIONS = "dg_servers";
	public static String TABLE_DG_RDSCONNECTIONS = "dg_rds_servers";
	public static String TABLE_DG_AZCONNECTIONS = "dg_az_servers";
	public static String TABLE_DG_SQOOPCONNECTIONS = "dg_sqoop_servers";
	public static String TABLE_DG_USERS ="dg_users,dg_user_roles";
	public static String TABLE_DG_ROLES="dg_roles";
	public static String TABLE_DG_TASK_INSTANCES ="dg_task_instances";
	public static String TABLE_DG_TASK_TEMPLATES = "dg_task_templates";
	public static String TABLE_DG_FTP_TASK_TEMPLATE  ="dg_ftp_task_template";
	public static String TABLE_DG_SEARCH_FILE_NETWORK_MAP ="dg_search_file_network_mappings";
	public static String TABLE_DG_HIVE_MASKING_COLUMNS ="DgHiveMaskingColumns";
	public static String TABLE_DG_HIVE_FILTERS ="DgHiveFilters";
	public static String TABLE_DG_HIVE_MASKING_COLUMNS_DETAILS ="DgHiveMaskingColumnDetail";
	public static String TABLE_DG_HIVE_DISCOVER_SETS ="DgDiscoverHiveSets";
	public static String TABLE_FILE_SET_NET_MAP="DgDiscoFileSetsNetworkMap";
	public static String TABLE_DG_EXCLUDE_SCAN_PATH ="DgExcludeScanPathPerTask";
	public static String TABLE_DG_EXCLUDE_EXTENSIONS = "DgExcludeExtensionPerTask";
	public static String TABLE_S3_TASK_RESULTS = "dg_s3_results";
	public static String TABLE_DG_RDSDISCOVER_SETS="dg_rds_discover_sets";
	public static String TABLE_DG_RDSMASKER_SETS="dg_rds_masking_sets";
	public static String TABLE_DG_AZDISCOVER_SETS="dg_az_discover_sets";
	
	public static String AGENTS_FETCHED_SUCCESFULLY = "All agents fetched successfully";
	public static String ERROR_IN_FETCHNG_AGENTS_SUCCESFULLY = "Error in fetching agents ";
	public static String LICENSE_EXTRA_START_TIME = "StartTime";
	public static String LICENSE_EXTRA_NUMDAYS = "NumDays";
	public static String LICENSE_EXTRA_PRODUCTS = "ProductNames";
	public static String LICENSE_EXTRA_NUMCONTROLLERS = "NumControllers";
	public static String LICENSE_EXTRA_NUMDISCOVERAGENTS    = "NumDiscoverAgents";
	public static String LICENSE_EXTRA_NUMMASKERAGENTS = "NumMaskerAgents";
	public static String LICENSE_EXTRA_NUMCONNECTIONS = "NumConnections";
	public static String LICENSE_EXTRA_NUMUSERS = "NumUsers";
	public static String LICENSE_EXTRA_BRANDING= "Branding";
	public static String ERROR_IN_GETTING_PRODUCT_NAMES = "Error in getting product names";
	public static String SINGLE_SPACED_STRING = " ";
	public static String COMMA = ",";
	public static String SEMICOLON = ";";
	public static String DOT_COM_SEPARATOR = "\\.com";
	public static String DIRECTORY_TYPE_APDS = "APDS";
	public static String DIRECTORY_TYPE_ACD = "ACD";
	public static String DIRECTORY_TYPE_OPENLDAP = "Open Ldap";
	public static String ERROR_CONNECTING_TO_DISCOVER_AGENT = "Unable to connect to discover agent";
	public static String ERROR_CONNECTING_TO_MASKER_AGENT = "Unable to connect to masker agent";
	public static String ERROR_CONNECTING_TO_SQOOP_AGENT = "Unable to connect to sqoop agent";
	public static String ERROR_CONNECTING_TO_HADOOP_AGENT = "Unable to connect to hadoop agent";
	public static String ERROR_GETTING_HADOOP_RESULTS = "Unable to get hadoop discovery results";	
	public static String ERROR_CONNECT_HADOOP_MASKER_AGENT = "Unable to connect to hadoop masker agent";
	public static String ERROR_SAVING_MASKER_STATUS_TO_DB = "Unable to save masker status to db";
	public static String ERROR_SAVING_SQOOP_STATUS_TO_DB = "Unable to save sqoop task status to db";
	public static String ERROR_SAVING_DISCOVER_STATUS_TO_DB = "Unable to save discover status to db";
	public static String LICENSE_BLACK_LIST="BO";//Change for BO field in license
	public static String DG_DISCOVER = "DgDiscover";
	public static String DG_MASKER = "DgMasker";
	public static String SET_MASKING_OPTION = "Set Masking Option";
	public static String DBMS_TYPE = "dbms";
	public static String DBMS_TYPE_MYSQL = "mysql";
	public static String DBMS_TYPE_POSTGRESQL = "postgresql";
	public static String ERROR_IN_CONFIGURING_DG_FLUME_AGENT = "Error in configuring DgFlume agent";	
	public static String DG_FLUME_AGENT_SAVED_SUCCESSFULLY = "DgFlume agent saved successfully";
	public static String DG_FLUME_TEMPLATE_FETCHED_SUCCESSFULLY = "DgFlume template fetched successfully";
	public static String ERROR_IN_FETCHING_DG_FLUME_TEMPLATE = "Error in fetching dgflume template";
	public static String DG_FLUME_TEMPLATE_PATTERN_SAVED_SUCCESSFULLY = "DgFlume template pattern saved successfully";
	public static String DG_FLUME_AGENTS_FETCHED_SUCCESSFULLY = "DgFlume agents fetched successfully";
	public static String ERROR_IN_FETCHING_DG_FLUME_AGENTS = "Error in fetching dgflume agents";
	public static String FOREIGN_KEY = "FK";
	public static String ERROR_IN_FETCHNG_AGENTS_STATUS = "Error in fetching agent status ";
	public static String CACHE_CLEARED_FOR_CONNECTION_ID = "Cache cleared for connectionid = ";
	public static String ERROR_IN_LOAD_MASK_TEMPLATE = "Error in loading Mask template";
	public static String ERROR_SAVING_SEQUENCE_FILE = "Error saving sequence file";
	public static String HADOOP_MONITORING_AGENT_SUFFIX="/MonitoringAgent/Services/";
	public static String ERROR_SAVING_AVRO_FILE = "Error saving avro file";
	public static String DISCOVER_FILE_AGENT = "/dgFilesAgent/services/DiscoverFileAgent";
	public static String TABLE_SEARCH_FILE_NETWORK_MAP = "dg_search_file_network_map";
	public static String TABLE_CUSTOM_FUNCTION = "dg_custom_functions";
	public static String DIFF_DISCOVER_RESULTS = "Diff Discover Results";
	public static String TABLE_DG_MASK_TEMPLATES="dg_mask_templates";
	public static String TABLE_DG_DATABASE_ATTRIBUTES="dg_database_attributes";
	public static String TABLE_DG_DATABASE_ATTRIBUTES_MAP = "dg_database_attributes_map";
	public static String UPDATE_DATABASE_ATTRIBUTE_DETAIL = "Update Database Attribute Detail";	
	public static String TABLE_DG_SQOOP_TASK ="dg_sqoop_sets";
	public static String REFERENCE_FOLDER = "COLUMN_DATA_WHITELIST";
	public static String BLACKLIST_FOLDER = "COLUMN_DATA_BLACKLIST";
	public static String REFERENCE_LISTS_COPY_PATH = "REFERENCE_LISTS";
	public static String FILETYPE_REFERENCE = "reference";
	public static String FILETYPE_EXCLUSION = "exclusion";
	public static String TABLE_DG_HDFS_OUTPUT_DIRECTORY = "dg_hdfs_output_directory";
	public static String TABLE_DG_HADOOP_TEXT_STRUCTURE = "dg_hadoop_text_structure";
	
	public static String TABLE_DG_HADOOP_SEQUENCE_STRUCTURE = "dg_hadoop_sequence_structure";
	public static String TABLE_DG_HADOOP_AVRO_STRUCTURE = "dg_hadoop_avro_structure";
	public static String TABLE_DG_HDFS_DOMAIN = "dg_hdfs_domain";
	public static String TABLE_DG_HDFS_CLUSTER= "dg_hdfs_clusters";
	
	public static String TABLE_DG_S3_TASK="dg_s3_task";
	public static String TABLE_DG_S3_TASK_SCAN_LOC = "DgS3TaskScanLoc";
	
	public static String SESSION_PREFERENCE_NAME = "Session TimeOut";
	public static String EXPIRE_DGCL_SESSION = "ExpireDgclSession";
	public static Integer HADOOP_PREFERENCE_ID = 1;
	public static Integer SESSION_PREFERENCE_ID = 2;
	public static Integer CONTROLLER_SERVICE_IP_ID = 3;
	public static Integer EXPIRE_DGCL_SESSION_ID = 4;
	public static Integer AUTODISCOVERY_BATCH_SIZE_ID = 5;
	public static Integer ALERT_TIMER_ID=7;
	public static Integer RESULTLINK_EMAILNOTIF = 6;
	public static Integer DEFAULT_MASKING_OUTPUT_DIR_ID = 11;
	
	
	public static String HADOOP_PREFERENCE_NAME = "Export Hadoop Results";
	
	public static String HIVE_AGENT="/status/ping";
	public static String ERROR_CONNECTING_TO_HIVE_AGENT = "Unable to connect to hive agent";
	public static String TABLE_HIVE_DISCOVER_SETS="DgDiscoverHiveSets";
	public static String TABLE_DG_DISCOVER_HIVE_SETS="dg_discover_hive_sets";
		public static String dg_hive_sensitive_info = "dg_hive_results_info";
	public static String TABLE_HIVE_SENSITIVE_INFO = "dg_hive_sensitive_info";
	public static String HIVE_GET_DATABASES = "metadata/databases";
	public static String HIVE_GET_TABLES = "metadata/tables";
	public static String HIVE_START_TASK="tasks/submit/discovery";
	public static String HIVE_START_MASKER_TASK = "tasks/submit/transformation";
	public static String HIVE_GET_JOB_STATUS="tasks/status";
	public static String HIVE_GET_RESULTS = "tasks/results";
	public static String RSA_PUBLIC_KEY_ITEM = "RSA_PUBLIC_KEY";
	public static String RSA_PRIVATE_KEY_ITEM = "RSA_PRIVATE_KEY";
	public static String TABLE_DG_FLUME_FLOW ="dg_flume_flow";
	public static String TABLE_DG_SOURCE_IP_RANGE ="dg_sourceip_range";
	public static final String REFERENCE_DATA =  "REFERENCE_DATA";
	public static final String DG_SECURE_SESSION_COOKIE = "dgs_secure";
	public static final String DG_ADMIN_SESSION_COOKIE = "dgs_admin";
	public static final String CONTENT_TYPE_APPLICATION_JSON = "application/json";
	public static final String FILE_SEPARATOR	= "/!@#/";
	
	
	public static final String DEFAULT_CHARSET_ENCODING="ISO-8859-1";
	
	
	
	public enum ACLMaskEnum {
		// need to be modified
		USE(32)
		, EXECUTE(16)
		, DELETE(8)
		, CREATE(4)
		, WRITE(2)
		, READ(1)
		, RWCD(111100); // addition READ+WRITE+CREATE+DELETE
		private Integer ACLMaskType;

		private ACLMaskEnum(Integer ACLMaskType) {
			this.ACLMaskType = ACLMaskType;
		}

		public Integer getACLMask() {
			return ACLMaskType;
		}

	}
		
	public enum TaskTypes{
		HDFS,
		S3,
		MAPR,
		HIVE,
		RDBMS,
		All;
		
		
		  public String toString() {
		    switch(this) {
		      case HDFS: return "HDFS";
		      case S3: return "S3";
		      case HIVE: return "HIVE";
		      case RDBMS: return "RDBMS";
		      case All: return "All";
		      default: throw new IllegalArgumentException();
		    }
		  }
		  
		  public  static String getApplicationLogs(String taskType){
		      if(taskType.equalsIgnoreCase("HDFS"))
		         return "hdfsAuditLog";
		       if(taskType.equalsIgnoreCase("S3"))
		         return "dgS3AuditLog";
		       if(taskType.equalsIgnoreCase("RDBMS"))
			         return "dgRDBMSAuditLog";
		       else
		    	   if(taskType.equalsIgnoreCase("HIVE"))
				         return "dgHiveAuditLog"; 
		    	   throw new IllegalArgumentException();
		      
		     
		    
		  }
	}
	
	

	public static String HTTPS = "https://";
	public static String LDAPS = "ldaps://";
	public static String ENABLE_SSL_FOR_TOMCAT = "N";
	public static String ENABLE_SSL_FOR_POSTGRES = "N";
	public static String ENABLE_SSL_FOR_MYSQL = "N";
	public static String ENABLE_SSL_FOR_ADS = "N";
	public static String ENABLE_SSL_FOR_ACTIVE_DIRECTORY = "N";
	public static String KEYSTORE = "C:\\keystore\\keystore.jks";
	public static String TRUSTSTORE = "C:\\keystore\\keystore.jks";
	public static String URL_SEPARATOR = ":";
	
	
	
	
	//Hadoop Agent Webservices URL
	
	public static String HADOOP_START_TASK="startTask";
	public static String HADOOP_GET_JOB_STATUS="getJobStatus";
	public static String HADOOP_GET_RESULTS="getResults";
	public static String HADOOP_GET_AGENT_STATUS="getAgentStatus";
	public static String HADOOP_GET_CLUSTER_DETAILS="getClusterDetails";
	public static String HADOOP_GET_ROOT_DIR_LIST="getRootDirList";
	public static String HADOOP_VERIFY_COLUMNAR_STRUCT="verifyColumnarStructure";
	public static String HADOOP_GET_SAMPLEDATA_TASK_NAME="getSampleData/taskName" ;
	public static String HADOOP_GET_SAMPLEDATA_TASK_INSTANCE_ID="taskInstanceId";
	public static String HADOOP_GET_USER_GROUP_INFO="getUserGroupInfo";
	public static String HADOOP_GET_ENCRYPTION_KEYS="getEncryptionKeys";
	public static String HADOOP_KILL_HADOOP_JOB=	"killHadoopJob";
	public static String HADOOP_IMPORT_FILE_STRUCTURE=	"importFileStructure";
	public static String HADOOP_VERIFY_SEQ_STURCT="verifySeqStructure";
	public static String HADOOP_VERIFY_AVRO_STRUCT=	"verifyAvroStructure";
	public static String HADOOP_VERIFY_FILE_STRUCT="verifyFileStructure";
	public static String HADOOP_GET_FULL_FILE_LIST="getFullFileList";
	public static String HADOOP_RESUME_TASK_LIST="resumeTask";
	public static String HADOOP_EXECUTE_STR_TASK= "executeStructureDiscovery";
	public static String HADOOP_GET_STR_DISCOVERY_STATUS= "getStructureDiscoveryStatus";
	public static String HADOOP_GET_STR_DISCOVERY_RESULTS="getStructureDiscoveryResults";
	public static String HADOOP_PUSH_JOB_COMPLETE_STATUS="jobCompleted";
	public static String CREATE_CLUSTER="/ops/cluster/create";
	public static String DESCRIBE_CLUSTER="/ops/cluster/describe";	
	public static String DESTROY_CLUSTER="/ops/cluster/destroy";
	public static String HADOOP_GET_FIELD_LEVEL_RESULTS="getStructuredResultsForAutoDiscovery";
	public static String AWS_LINK="http://169.254.169.254/latest/meta-data/public-ipv4";
	//masking options

		 public static final int FPM=13;
		 public static final int STATIC=0;
		 public static final int CHARACTER=1;
		 public static final int SHUFFLE=2;
		 public static final int RANDOM=3;
		 public static final int COMPOSE=8;
		 public static final int NPI=19;
		 public static final int INTELLIMASK=7;
		 public static final int REGULAR_EXPRESSION=5;
		 public static final int CUSTOM=14;
		 public static final int EMAIL_POLICY=9;
		 public static final int CUSTOM_LOOKUP=6;
		 public static final int EXPRESSION=4;
		 public static final int COMPOSE_MATH_EXPRESSION=10;
		 public static final int CUSTOM_TRANSFORMATION = 23;
		 
		 //Date formats for String as well as Numeric datatype
		 public static final String DATE_FORMAT1="yyyy-MM-dd";
		 public static final String DATE_FORMAT2="yyyy/MM/dd";
		 public static final String DATE_FORMAT3= "dd-MMM-yyyy";            
		 public static final String DATE_FORMAT4 = "ddMMyyyy";
		 public static final String DATE_FORMAT5 = "MMddyyyy";
		 public static final String DATE_FORMAT6 = "yyyyMMdd";
		 public static final int VALID_STRING_DATE_LENGTH = 10;
		 public static final int VALID_NUMERIC_DATE_LENGTH = 8;
		 
		 
		 //Timestamp formats for String as well as Numeric datatype

		 public static final String TIMESTAMP_FORMAT1="yyyy-MM-dd HH:mm:ss";
		 public static final String TIMESTAMP_FORMAT2="dd-MMM-yyyy HH:mm:ss";
		 public static final String TIMESTAMP_FORMAT3= "yyyy/MM/dd HH:mm:ss"; 
		 public static final String TIMESTAMP_FORMAT4 = "ddMMyyyyHHmmss";
		 public static final String TIMESTAMP_FORMAT5 = "MMddyyyyHHmmss";
		 public static final String TIMESTAMP_FORMAT6 = "yyyyMMddHHmmss";
		 public static final int VALID_STRING_TIMESTAMP_LENGTH = 19;
		 public static final int VALID_NUMERIC_TIMESTAMP_LENGTH = 14;
		 
		 // Length for various masking options and its types
		 
		 public static final int VALID_SSNO_DIGITS_LENGTH = 9;
		 public static final int VALID_STRING_SSNO_OTHERS_LENGTH = 11;
		 public static final int VALID_TELEPHONE_DIGITS_LENGTH = 10;
		 public static final int VALID_TELEPHONE_SPACE_DASH_LENGTH = 12;
		 public static final int VALID_TELEPHONE_STANDARD_LENGTH = 14;
		 
		 //Masker Policy Operations
		 public static final String POLICY_OPERATION_ADD="add";
		 public static final String POLICY_OPERATION_DELETE="delete";
		 public static final String POLICY_KEEP_EXISTING="keepExisting";
		 
		 //Masker check_valid constants
		 public static final String VALID_MASKER_COLUMNS="Valid";
		 public static final String INVALID_MASKER_COLUMNS="Invalid";
		 public static final String NO_MASKING_COLUMNS="No Masking";
		 
		 //Masker Template Constants
		 public static final String APPLY_MASKER_TEMPLATE="add";
		 public static final String CANCEL_MASKER_TEMPLATE="cancel";
		 
		 //DgController.properties keys
		 public static final String SERVICEPORT_KEY="servicePort";
		 public static final String PROTOCOL_KEY="protocol";
		 public static final String SERVICEURL_KEY="serviceURL";
		 
		 //Dependent column Options
		 public static final int DEPENDENT_COLUMN_SHUFFLE = 2;
		 public static final int DEPENDENT_COLUMN_COMPOSE = 8;
		 public static final int DEPENDENT_COLUMN_EMAIL_POLICY = 9;
		 public static final int DEPENDENT_COLUMN_COMPOSE_MATH = 10;
		 
		 //Agent Meta data states
		 public static final String STATE_CANCELLED="Cancelled";
		 public static final String STATE_STARTED="Started";
		 public static final String STATE_RESUMED ="Resumed";
		 public static final String STATE_CANCELLING="Cancelling";
		 
		 //RegexId of Part Names(FirstName or LastName)
		 public static final int PART_NAMES_REGEX_ID = 91;
		 
		 public static final int FILTER_OUTPUT_BATCH_SIZE=1000;
		 
		 public static final ArrayList<String> CONN_MODULES	= new ArrayList<String>(){
			 {
				 add("DBMS");
				 add("RDS");
				 add("AZURE");
				 add("SQOOP");
			 }
		 };
		 
		//RDS task types - Referring Ids from table DgSubmoduleDetail
		 public static final Integer RDS_DISCOVER	= 101;
		 public static final Integer RDS_MASKER		= 102;
		 public static final Integer RDS_FINDIT		= 103;
		// Azure Database - Referring Ids from table DgSubmoduleDetail
		 public static final Integer AZURE_DISCOVER	= 104;
		 
		 // These string are used to display task type for RDS (tasks) on Home screen
		 public static final String		RDS_DISCOVER_DISPLAYNAME	= "RDS Detection";
		 public static final String		RDS_MASKER_DISPLAYNAME		= "RDS Masking";
		 public static final String		RDS_FINDIT_DISPLAYNAME		= "RDS Find DBMS";
		// These string are used to display task type for RDS (tasks) on Home screen
		 public static final String		AZURE_DISCOVER_DISPLAYNAME	= "Azure Detection";

		 //Location
		 public static final String	LOCATION_ON_PREMISES = "On-Premises";
		 public static final String	LOCATION_ON_CLOUD = "Cloud";
}