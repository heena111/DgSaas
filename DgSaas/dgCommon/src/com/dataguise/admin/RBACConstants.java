
package com.dataguise.admin;

/* 
* @author Anurag Kirpal
 *
 */
public class RBACConstants {

	public static String DG_ROLES = "dg_roles";
	public static String DG_ACLSID = "dg_acl_sid";
	public static String DG_ACL_ENTRY = "DgAclEntry";
	public static String DG_ACLS = "dg_acls";
	public static String DG_ACL_OBJECT_IDENTITY = "dg_acl_object_identity";	
	public static String ID = "id";

	public static String ERROR_CREATE_UPDATE_ROLE = "Error in creating/updating role";
	public static String ERROR_ALLOCATING_CONNECTIONS_TO_ROLE = "Error in allocating permissions for connections to role";
	public static String ERROR_ALLOCATING_TASK_DEFINITIONS_TO_ROLE = "Error in allocating permissions for task definitions to role";
	public static int DG_ADMIN_OBJECT_ID_IDENTITY = 0;
	public static int DG_USER_OBJECT_ID_IDENTITY = -1;
	public final static int DG_PRODUCTS = 1;
	public final static int DG_SERVERS = 2;
	public final static int DG_DISCOVER_SETS = 4;
	public final static int DG_MASKING_SETS = 6;
	public final static int DG_DISCOVER_FILE_SETS = 8;
	public final static int DG_DISCOVER_NMAP_SETS = 5;
	public final static int DG_DISCOVER_HIVE_SETS=21;
	public final static int DG_DISCOVER_HADOOP_FILE_SETS = 9;
	public final static int DG_S3_TASK = 24;
	public final static int DG_RDS_DISCOVER_SETS = 26;
	public final static int DG_RDS_MASKER_SETS = 27;
	public final static int DG_TASK_TEMPLATE= 10;
	public final static int DG_FTP_TASK_TEMPLATE= 11;
	public final static int DG_NOTIFICATIONS_DETAILS = 12;
	
	public final static int DG_SEARCH_FILE_NETWORK_MAP = 13;
	//public final static int DG_MASK_TEMPLATES = 14;
	public final static int DG_CUSTOM_FUNCTIONS = 15;
	public final static int DG_HDFS_OUTPUT_DIRECTORY = 16;
	public final static int DG_HADOOP_TEXT_STRUCTURE = 17;
	public final static int DG_HADOOP_SEQUENCE_STRUCTURE = 18;
	public final static int DG_HADOOP_AVRO_STRUCTURE = 19;
	public final static int DG_HDFS_DOMAIN = 20;
	public final static int DG_HDFS_CLUSTER = 22;
	public final static int DG_FLUME_FLOW=23;
	public final static int DG_HADOOP_STRUCTURE=24;
	public final static int DG_RDS_SERVERS = 28;
	public final static int DG_AZ_DISCOVER_SETS = 29;
	public final static int DG_AZ_SERVERS = 30;
	public final static int DG_SQOOP_SERVERS = 31;
	
	//Data RBAC constants
	public final static int DG_DECRYPT_METHOD = 1;
	public final static int DAY_OF_WEEK = 2;
	public final static int DAY_TIME_MAP = 3;
	public final static int DG_REGEX_GROUPS = 4;
	public final static int DATA_HDFS_DOMAIN = 5;
	public final static int DG_SOURCE_IP_RANGE = 6;
	
	
	//TO DO : this id has nothing to do with rbac access it is a dummy value.
	public final static int DG_SQOOP_SETS = 25;
	
	//Task Type
	public static String DG_TASK_TYPE = "DA";
	
	public static String CONNECTIONS_UPDATED_SUCCESSFULLY = "Connections are allocated successfully";
	public static String CONNECTIONS_NOT_UPDATED_SUCCESSFULLY = "Connections are not allocated successfully";
    public static String SUPER_USER = "SUPER_ADMIN";
	public static String WARNING_REGARDING_UNDERLYING_PERMISSIONS_FOR_CONNECTIONS  = "Please provide same permissions as considered for this task for underlying connections in task first ";
	public static String TASK_DEFINITIONS_UPDATED_SUCCESSFULLY = "Task definitions are updated successfully";
	public static String TASK_DEFINITIONS_NOT_UPDATED_SUCCESSFULLY = "Task definitions are not updated successfully";
	public static String PRODUCTS_ALLOCATIONS_UPDATED_SUCCESSFULLY = "Products permissions are allocated successfully";
	public static String PRODUCTS_ALLOCATIONS_NOT_UPDATED_SUCCESSFULLY = "Products permissions  are not updated successfully";
	public static String CONNECTION_GROUP_DBTYE_MAP="dg_conn_grp_db_vendor_map";
	
	
	public static final String HDFS_INFO_PROCESSING_ENGINE="HDFSInfoProcessingEngine";
	
	//As we have  modularize the access level to sub products , but we have followed same approach with them as being followed with parent  products hence need to keep these products separately.
	public static String LICENCE_EXCLUDING_PRODUCTS = "'DgPolicy','Domain','Structure','HDFSOutputDirectory','AttributeAssignment','Role&ACL','FilesOutputDirectory','Attribute'";
	
	/**
	 * This will contain reference to different products available where each product code has its unique bit position.
	 * @author mgrover,
	 *
	 */ 
	private static Integer firstBit = 0X1;
	private static  Integer seventeenthBit = firstBit<<16;
	public enum Products{
		
//		DgDashBoard(1),DgDiscoverMF(2),DgForHadoop(4),DgMasker(8),SearchFiles(16),DgDiscover(32),DgDiscoverDuo(DgDiscoverMF.getCode() | DgDiscover.getCode()),DgAllProducts(63)
//		,DgPolicy(0X10000),DgDomain(0X20000),Structure(0X40000),HDFSOutputDirectory(0X80000),HDFSAttributeAssignment(0X100000),HDFSRoleACL(0X200000),FilesOutputDirectory(0x400000);
		
		//TODO Need to re-work on the sub modules: This particular enum should be used for products only.
		//Different enum/flag(integer) should be there for each product whose bits will further represent sub module access.
		//eg. HadoopSubModules containing Structures,Domains etc.,DBMSSubModules containing Attributes.
		
		//While startup we save only one flag(using information from this enum) corresponding to the role id. 
		
		//Lower 16th bits for products and the next 16 bits for sub modules.
		
		//PRODUCTS
		DgDashBoard(firstBit),DgDiscoverMF(firstBit<<1),DgForHadoop(firstBit<<2),DgMasker(firstBit<<3),SearchFiles(firstBit<<4),DgDiscover(firstBit<<5),AWS(firstBit<<6),Monitor(firstBit<<6)
		,Azure(firstBit<<7)
		
		//Sub-Modules
		,DgPolicy(seventeenthBit),Domain(seventeenthBit<<1),Structure(seventeenthBit<<2),HDFSOutputDirectory(seventeenthBit<<3),
		HDFSAttributeAssignment(seventeenthBit<<4),HDFSRoleACL(seventeenthBit<<5),FilesOutputDirectory(seventeenthBit<<6),
		DBMSAttribute(seventeenthBit<<7),S3(seventeenthBit<<8),RDSDetection(seventeenthBit<<9),RDSMasking(seventeenthBit<<10),
		DatabaseDetection(seventeenthBit<<11)
				
		//Combinations: should be placed separately,should keeping in .	
		,DgDiscoverDuo(DgDiscoverMF.getCode() | DgDiscover.getCode()),
		DgAllProducts(DgDiscoverDuo.getCode()|DgDashBoard.getCode()|DgMasker.getCode()|DgForHadoop.getCode()|SearchFiles.getCode()|AWS.getCode()|Monitor.getCode()|Azure.getCode());
		
		
		
		private Products(Integer code){
			this.code = code;
		}
		private int code;
		/**
		 * @return the code
		 */
		public int getCode() {
			return code;
		}
		/**
		 * @param code the code to set
		 */
		public void setCode(int code) {
			this.code = code;
		}
		
//		public boolean isFeatureAvailable(int flags, ) {
//			
//		}
				
		
	}
			
	

}


