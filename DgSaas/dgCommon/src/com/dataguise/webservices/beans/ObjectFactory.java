package com.dataguise.webservices.beans;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.dataguise.webservices.beans.masker.DgMaskerColumn;
import com.dataguise.webservices.beans.masker.DgMaskerLinkedColumn;
import com.dataguise.webservices.beans.masker.DgMaskerParameters;
import com.dataguise.webservices.beans.masker.DgMaskerTask;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.dataguise.webservices.beans package.
 * <p>
 * An ObjectFactory allows you to programatically construct new instances of the
 * Java representation for XML content. The Java representation of XML content
 * can consist of schema derived interfaces and classes representing the binding
 * of schema type definitions, element declarations and model groups. Factory
 * methods for each of these are provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

	private final static QName _TestConnection_QNAME = new QName(
			"http://webservices.dataguise.com/", "testConnection");
	private final static QName _LoadSensitiveDataDiscoveryErrorsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadSensitiveDataDiscoveryErrorsResponse");
	private final static QName _GetSampleRow_QNAME = new QName(
			"http://webservices.dataguise.com/", "getSampleRow");
	private final static QName _LoginResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loginResponse");
	private final static QName _DiffDiscoverResultsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "diffDiscoverResultsResponse");
	private final static QName _DeleteDiscoverTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteDiscoverTaskResponse");
	private final static QName _StartDatabaseFindTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "startDatabaseFindTask");
	private final static QName _SaveDiscoverSafeListResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDiscoverSafeListResponse");
	private final static QName _Logout_QNAME = new QName(
			"http://webservices.dataguise.com/", "logout");
	private final static QName _GetDbEncryptFlagStatusResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"getDbEncryptFlagStatusResponse");
	private final static QName _DeleteDiscoverExpression_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteDiscoverExpression");
	private final static QName _CancelDatabaseFindTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"cancelDatabaseFindTaskResponse");
	private final static QName _LoadDatabaseFindResultsDetailsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDatabaseFindResultsDetailsResponse");
	private final static QName _LoadConnectionGroups_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadConnectionGroups");
	private final static QName _GetDatabaseFindResults_QNAME = new QName(
			"http://webservices.dataguise.com/", "getDatabaseFindResults");
	private final static QName _LoadSynchDataResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadSynchDataResponse");
	private final static QName _DeleteDatabaseFindTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"deleteDatabaseFindTaskResponse");
	private final static QName _DiffDiscoverResults_QNAME = new QName(
			"http://webservices.dataguise.com/", "diffDiscoverResults");
	private final static QName _DeleteDiscoverTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteDiscoverTask");
	private final static QName _DeleteMaskerTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteMaskerTaskResponse");
	private final static QName _GetDatabaseFindStatus_QNAME = new QName(
			"http://webservices.dataguise.com/", "getDatabaseFindStatus");
	private final static QName _CheckIfValidSession_QNAME = new QName(
			"http://webservices.dataguise.com/", "checkIfValidSession");
	private final static QName _LoadConnectionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadConnectionResponse");
	private final static QName _TestConnectionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "testConnectionResponse");
	private final static QName _SaveDatabaseFindTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDatabaseFindTaskResponse");
	private final static QName _LoadSensitiveDataDiscoveryErrors_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadSensitiveDataDiscoveryErrors");
	private final static QName _GetSampleRowResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getSampleRowResponse");
	private final static QName _GetDbEncryptFlagStatus_QNAME = new QName(
			"http://webservices.dataguise.com/", "getDbEncryptFlagStatus");


	private final static QName _GetTaskIdforTaskNameResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getTaskIdforTaskNameResponse");

	private final static QName _CacheDatabasesForConnection_QNAME = new QName(
			"http://webservices.dataguise.com/", "cacheDatabasesForConnection");
	private final static QName _LoadDiscoverResultsSummary_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverResultsSummary");
	private final static QName _SaveMaskerTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveMaskerTask");
	private final static QName _GetColumnsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getColumnsResponse");
	private final static QName _GetLicenseInfoResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getLicenseInfoResponse");
	private final static QName _GetBrandingResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getBrandingResponse");
	private final static QName _LoadDiscoverResultsSummaryPdf_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDiscoverResultsSummaryPdf");
	private final static QName _DeleteDatabaseFindTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteDatabaseFindTask");
	private final static QName _LoadSensitiveDataDiscoveryResults_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadSensitiveDataDiscoveryResults");
	private final static QName _GetColumns_QNAME = new QName(
			"http://webservices.dataguise.com/", "getColumns");
	private final static QName _GetMaskerStatusResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getMaskerStatusResponse");
	private final static QName _LoadDatabaseFindResultsByType_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDatabaseFindResultsByType");
	private final static QName _StartDatabaseFindTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"startDatabaseFindTaskResponse");
	private final static QName _SaveDiscoverExpressionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"saveDiscoverExpressionResponse");
	private final static QName _SaveDiscoverTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDiscoverTask");
	private final static QName _DgException_QNAME = new QName(
			"http://webservices.dataguise.com/", "DgException");
	private final static QName _LoadDatabaseFindResultsDetails_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDatabaseFindResultsDetails");
	private final static QName _GetLicenseInfo_QNAME = new QName(
			"http://webservices.dataguise.com/", "getLicenseInfo");
	private final static QName _GetBranding_QNAME = new QName(
			"http://webservices.dataguise.com/", "getBranding");
	private final static QName _GetMaskerResultsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getMaskerResultsResponse");
	private final static QName _GetTablesResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getTablesResponse");
	private final static QName _StartDiscoverTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "startDiscoverTask");
	private final static QName _LoadDatabaseFindTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDatabaseFindTask");
	private final static QName _CancelDatabaseFindTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "cancelDatabaseFindTask");
	private final static QName _LoadDatabaseFindResultsByTypeResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDatabaseFindResultsByTypeResponse");
	private final static QName _SaveConnectionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveConnectionResponse");
	private final static QName _LoadSensitiveDataDiscoveryResultsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadSensitiveDataDiscoveryResultsResponse");
	private final static QName _LoadMaskerTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadMaskerTask");
	private final static QName _SaveDatabaseFindTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDatabaseFindTask");
	private final static QName _GetReferencesResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getReferencesResponse");
	private final static QName _LoadConnectionsInGroupResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadConnectionsInGroupResponse");
	private final static QName _LoadDiscoverTaskSnapshotResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDiscoverTaskSnapshotResponse");
	private final static QName _AuthenticateResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "authenticateResponse");
	private final static QName _GetDatabasesResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "getDatabasesResponse");
	private final static QName _LoadMaskerTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadMaskerTaskResponse");
	private final static QName _LoadDgUITaskInstanceResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDgUITaskInstanceResponse");
	private final static QName _CancelDiscoverTaskInstanceResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"cancelDiscoverTaskInstanceResponse");
	private final static QName _CheckIfValidSessionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "checkIfValidSessionResponse");
	private final static QName _LoadDiscoverResultsSummaryPdfResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDiscoverResultsSummaryPdfResponse");
	private final static QName _CancelDiscoverTaskInstance_QNAME = new QName(
			"http://webservices.dataguise.com/", "cancelDiscoverTaskInstance");

	private final static QName _GetTables_QNAME = new QName(
			"http://webservices.dataguise.com/", "getTables");
	private final static QName _LoadConnection_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadConnection");
	private final static QName _LoadDiscoverExpression_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverExpression");
	private final static QName _CacheDatabasesForConnectionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"cacheDatabasesForConnectionResponse");
	private final static QName _StartMaskerTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "startMaskerTaskResponse");
	private final static QName _GetReferences_QNAME = new QName(
			"http://webservices.dataguise.com/", "getReferences");
	private final static QName _StartDatabaseFind_QNAME = new QName(
			"http://webservices.dataguise.com/", "startDatabaseFind");
	private final static QName _LoadConnectionsInGroup_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadConnectionsInGroup");
	private final static QName _LoadDiscoverExpressionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDiscoverExpressionResponse");
	private final static QName _Authenticate_QNAME = new QName(
			"http://webservices.dataguise.com/", "authenticate");
	private final static QName _DeleteDiscoverExpressionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"deleteDiscoverExpressionResponse");
	private final static QName _GetTaskIdforTaskName_QNAME = new QName(
			"http://webservices.dataguise.com/", "getTaskIdforTaskName");
	private final static QName _SaveDiscoverTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDiscoverTaskResponse");
	private final static QName _SaveMaskerTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveMaskerTaskResponse");
	private final static QName _LoadDatabaseFindTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDatabaseFindTaskResponse");
	private final static QName _LoadDiscoverTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverTask");
	private final static QName _StartDatabaseFindResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "startDatabaseFindResponse");
	private final static QName _SaveDiscoverSafeList_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDiscoverSafeList");
	private final static QName _LoadConnectionGroupsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadConnectionGroupsResponse");
	private final static QName _LoadDiscoverTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverTaskResponse");
	private final static QName _GetDatabaseFindStatusResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"getDatabaseFindStatusResponse");
	private final static QName _LoadDiscoverResultsSummaryResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"loadDiscoverResultsSummaryResponse");
	private final static QName _GetDatabaseFindResultsResponse_QNAME = new QName(
			"http://webservices.dataguise.com/",
			"getDatabaseFindResultsResponse");
	private final static QName _SaveDiscoverExpression_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveDiscoverExpression");
	private final static QName _GetMaskerStatus_QNAME = new QName(
			"http://webservices.dataguise.com/", "getMaskerStatus");
	private final static QName _StartDiscoverTaskResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "startDiscoverTaskResponse");
	private final static QName _LoadDgUITaskInstance_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDgUITaskInstance");
	private final static QName _DeleteMaskerTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteMaskerTask");
	private final static QName _DeleteConnectionResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteConnectionResponse");
	private final static QName _GetMaskerResults_QNAME = new QName(
			"http://webservices.dataguise.com/", "getMaskerResults");
	private final static QName _Login_QNAME = new QName(
			"http://webservices.dataguise.com/", "login");
	private final static QName _SaveConnection_QNAME = new QName(
			"http://webservices.dataguise.com/", "saveConnection");
	private final static QName _GetDatabases_QNAME = new QName(
			"http://webservices.dataguise.com/", "getDatabases");
	private final static QName _DeleteConnection_QNAME = new QName(
			"http://webservices.dataguise.com/", "deleteConnection");
	private final static QName _LoadDiscoverSafeList_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverSafeList");
	private final static QName _LogoutResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "logoutResponse");
	private final static QName _LoadDiscoverSafeListResponse_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverSafeListResponse");
	private final static QName _StartMaskerTask_QNAME = new QName(
			"http://webservices.dataguise.com/", "startMaskerTask");
	private final static QName _LoadDiscoverTaskSnapshot_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadDiscoverTaskSnapshot");
	private final static QName _LoadSynchData_QNAME = new QName(
			"http://webservices.dataguise.com/", "loadSynchData");
	private final static QName _LoadDiscoverResultsSummaryPdfResponseReturn_QNAME = new QName(
			"", "return");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package: com.dataguise.webservices.beans
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link LoadMaskerTaskResponse }
	 * 
	 */
	public LoadMaskerTaskResponse createLoadMaskerTaskResponse() {
		return new LoadMaskerTaskResponse();
	}

	/**
	 * Create an instance of {@link GetLicenseInfoResponse }
	 * 
	 */
	public GetLicenseInfoResponse createGetLicenseInfoResponse() {
		return new GetLicenseInfoResponse();
	}
	/**
	 * Create an instance of {@link GetBrandingResponse }
	 * 
	 */
	public GetBrandingResponse createBrandingResponse() {
		return new GetBrandingResponse();
	}

	/**
	 * Create an instance of {@link SaveDiscoverExpression }
	 * 
	 */
	public SaveDiscoverExpression createSaveDiscoverExpression() {
		return new SaveDiscoverExpression();
	}

	/**
	 * Create an instance of {@link DeleteConnection }
	 * 
	 */
	public DeleteConnection createDeleteConnection() {
		return new DeleteConnection();
	}

	/**
	 * Create an instance of {@link DeleteDiscoverExpressionResponse }
	 * 
	 */
	public DeleteDiscoverExpressionResponse createDeleteDiscoverExpressionResponse() {
		return new DeleteDiscoverExpressionResponse();
	}

	/**
	 * Create an instance of {@link LoadDatabaseFindTaskResponse }
	 * 
	 */
	public LoadDatabaseFindTaskResponse createLoadDatabaseFindTaskResponse() {
		return new LoadDatabaseFindTaskResponse();
	}

	/**
	 * Create an instance of {@link DeleteDiscoverTask }
	 * 
	 */
	public DeleteDiscoverTask createDeleteDiscoverTask() {
		return new DeleteDiscoverTask();
	}

	/**
	 * Create an instance of {@link SaveConnectionResponse }
	 * 
	 */
	public SaveConnectionResponse createSaveConnectionResponse() {
		return new SaveConnectionResponse();
	}

	/**
	 * Create an instance of {@link LoadConnectionResponse }
	 * 
	 */
	public LoadConnectionResponse createLoadConnectionResponse() {
		return new LoadConnectionResponse();
	}

	/**
	 * Create an instance of {@link GetDbEncryptFlagStatusResponse }
	 * 
	 */
	public GetDbEncryptFlagStatusResponse createGetDbEncryptFlagStatusResponse() {
		return new GetDbEncryptFlagStatusResponse();
	}

	/**
	 * Create an instance of {@link SaveDatabaseFindTaskResponse }
	 * 
	 */
	public SaveDatabaseFindTaskResponse createSaveDatabaseFindTaskResponse() {
		return new SaveDatabaseFindTaskResponse();
	}

	/**
	 * Create an instance of {@link DgUITaskInstance }
	 * 
	 */
	public DgUITaskInstance createDgUITaskInstance() {
		return new DgUITaskInstance();
	}

	/**
	 * Create an instance of {@link SaveDiscoverSafeListResponse }
	 * 
	 */
	public SaveDiscoverSafeListResponse createSaveDiscoverSafeListResponse() {
		return new SaveDiscoverSafeListResponse();
	}

	/**
	 * Create an instance of {@link LoadConnection }
	 * 
	 */
	public LoadConnection createLoadConnection() {
		return new LoadConnection();
	}

	/**
	 * Create an instance of {@link DgDiscoverSafe }
	 * 
	 */
	public DgDiscoverSafe createDgDiscoverSafe() {
		return new DgDiscoverSafe();
	}

	/**
	 * Create an instance of {@link GetMaskerStatus }
	 * 
	 */
	public GetMaskerStatus createGetMaskerStatus() {
		return new GetMaskerStatus();
	}

	/**
	 * Create an instance of {@link SaveMaskerTaskResponse }
	 * 
	 */
	public SaveMaskerTaskResponse createSaveMaskerTaskResponse() {
		return new SaveMaskerTaskResponse();
	}

	/**
	 * Create an instance of {@link StartDiscoverTask }
	 * 
	 */
	public StartDiscoverTask createStartDiscoverTask() {
		return new StartDiscoverTask();
	}

	/**
	 * Create an instance of {@link DgDiscoverDatabase }
	 * 
	 */
	public DgDiscoverDatabase createDgDiscoverDatabase() {
		return new DgDiscoverDatabase();
	}

	/**
	 * Create an instance of {@link DgFaultInfo }
	 * 
	 */
	public DgFaultInfo createDgFaultInfo() {
		return new DgFaultInfo();
	}

	/**
	 * Create an instance of {@link DgDiscoverResultsSummary }
	 * 
	 */
	public DgDiscoverResultsSummary createDgDiscoverResultsSummary() {
		return new DgDiscoverResultsSummary();
	}

	/**
	 * Create an instance of {@link StartDatabaseFindTask }
	 * 
	 */
	public StartDatabaseFindTask createStartDatabaseFindTask() {
		return new StartDatabaseFindTask();
	}
	/**
	 * Create an instance of {@link LoadDiscoverResultsSummaryPdfResponse }
	 * 
	 */
	public LoadDiscoverResultsSummaryPdfResponse createLoadDiscoverResultsSummaryPdfResponse() {
		return new LoadDiscoverResultsSummaryPdfResponse();
	}

	/**
	 * Create an instance of {@link DgDatabaseFindResultsDetails }
	 * 
	 */
	public DgDatabaseFindResultsDetails createDgDatabaseFindResultsDetails() {
		return new DgDatabaseFindResultsDetails();
	}

	/**
	 * Create an instance of {@link LoadDiscoverExpressionResponse }
	 * 
	 */
	public LoadDiscoverExpressionResponse createLoadDiscoverExpressionResponse() {
		return new LoadDiscoverExpressionResponse();
	}

	/**
	 * Create an instance of {@link Logout }
	 * 
	 */
	public Logout createLogout() {
		return new Logout();
	}

	/**
	 * Create an instance of {@link LoadDiscoverExpression }
	 * 
	 */
	public LoadDiscoverExpression createLoadDiscoverExpression() {
		return new LoadDiscoverExpression();
	}

	/**
	 * Create an instance of {@link LoadSensitiveDataDiscoveryResults }
	 * 
	 */
	public LoadSensitiveDataDiscoveryResults createLoadSensitiveDataDiscoveryResults() {
		return new LoadSensitiveDataDiscoveryResults();
	}

	/**
	 * Create an instance of {@link GetLicenseInfo }
	 * 
	 */
	public GetLicenseInfo createGetLicenseInfo() {
		return new GetLicenseInfo();
	}

	/**
	 * Create an instance of {@link GetBranding }
	 * 
	 */
	public GetBranding createGetBranding() {
		return new GetBranding();
	}
	/**
	 * Create an instance of {@link LoadConnectionGroups }
	 * 
	 */
	public LoadConnectionGroups createLoadConnectionGroups() {
		return new LoadConnectionGroups();
	}

	/**
	 * Create an instance of {@link DgMaskerParameters }
	 * 
	 */
	public DgMaskerParameters createDgMaskerParameters() {
		return new DgMaskerParameters();
	}

	/**
	 * Create an instance of {@link DeleteDiscoverExpression }
	 * 
	 */
	public DeleteDiscoverExpression createDeleteDiscoverExpression() {
		return new DeleteDiscoverExpression();
	}

	/**
	 * Create an instance of {@link GetSampleRow }
	 * 
	 */
	public GetSampleRow createGetSampleRow() {
		return new GetSampleRow();
	}

	/**
	 * Create an instance of {@link GetReferences }
	 * 
	 */
	public GetReferences createGetReferences() {
		return new GetReferences();
	}

	/**
	 * Create an instance of {@link GetMaskerStatusResponse }
	 * 
	 */
	public GetMaskerStatusResponse createGetMaskerStatusResponse() {
		return new GetMaskerStatusResponse();
	}

	/**
	 * Create an instance of {@link DeleteDiscoverTaskResponse }
	 * 
	 */
	public DeleteDiscoverTaskResponse createDeleteDiscoverTaskResponse() {
		return new DeleteDiscoverTaskResponse();
	}

	/**
	 * Create an instance of {@link LoadConnectionsInGroup }
	 * 
	 */
	public LoadConnectionsInGroup createLoadConnectionsInGroup() {
		return new LoadConnectionsInGroup();
	}

	/**
	 * Create an instance of {@link NMapScan }
	 * 
	 */
	public NMapScan createNMapScan() {
		return new NMapScan();
	}

	/**
	 * Create an instance of {@link NMapTaskIdAckElement }
	 * 
	 */
	public NMapTaskIdAckElement createNMapTaskIdAckElement() {
		return new NMapTaskIdAckElement();
	}

	/**
	 * Create an instance of {@link DgColumnInfo }
	 * 
	 */
	public DgColumnInfo createDgColumnInfo() {
		return new DgColumnInfo();
	}
/**
	 * Create an instance of {@link LoadDiscoverResultsSummaryPdf }
	 * 
	 */
	public LoadDiscoverResultsSummaryPdf createLoadDiscoverResultsSummaryPdf() {
		return new LoadDiscoverResultsSummaryPdf();
	}


	/**
	 * Create an instance of {@link DgDatabaseFindTask }
	 * 
	 */
	public DgDatabaseFindTask createDgDatabaseFindTask() {
		return new DgDatabaseFindTask();
	}

	/**
	 * Create an instance of {@link StartDatabaseFindTaskResponse }
	 * 
	 */
	public StartDatabaseFindTaskResponse createStartDatabaseFindTaskResponse() {
		return new StartDatabaseFindTaskResponse();
	}

	/**
	 * Create an instance of {@link DatabaseInfo }
	 * 
	 */
	public DatabaseInfo createDatabaseInfo() {
		return new DatabaseInfo();
	}

    	/**
	 * Create an instance of {@link GetTaskIdforTaskNameResponse }
	 * 
	 */
	public GetTaskIdforTaskNameResponse createGetTaskIdforTaskNameResponse() {
		return new GetTaskIdforTaskNameResponse();
	}
	/**
	 * Create an instance of {@link DgMaskerResults }
	 * 
	 */
	public DgMaskerResults createDgMaskerResults() {
		return new DgMaskerResults();
	}

	/**
	 * Create an instance of {@link NMapTaskIdScanElement }
	 * 
	 */
	public NMapTaskIdScanElement createNMapTaskIdScanElement() {
		return new NMapTaskIdScanElement();
	}

	/**
	 * Create an instance of {@link LoadDiscoverResultsSummaryResponse }
	 * 
	 */
	public LoadDiscoverResultsSummaryResponse createLoadDiscoverResultsSummaryResponse() {
		return new LoadDiscoverResultsSummaryResponse();
	}

	/**
	 * Create an instance of {@link DgConnectionGroup }
	 * 
	 */
	public DgConnectionGroup createDgConnectionGroup() {
		return new DgConnectionGroup();
	}

	/**
	 * Create an instance of {@link GetDatabases }
	 * 
	 */
	public GetDatabases createGetDatabases() {
		return new GetDatabases();
	}

	/**
	 * Create an instance of {@link SaveDiscoverTask }
	 * 
	 */
	public SaveDiscoverTask createSaveDiscoverTask() {
		return new SaveDiscoverTask();
	}




	/**
	 * Create an instance of {@link DgConnection }
	 * 
	 */
	public DgConnection createDgConnection() {
		return new DgConnection();
	}

	/**
	 * Create an instance of {@link CheckIfValidSessionResponse }
	 * 
	 */
	public CheckIfValidSessionResponse createCheckIfValidSessionResponse() {
		return new CheckIfValidSessionResponse();
	}


	/**
	 * Create an instance of {@link CacheDatabasesForConnection }
	 * 
	 */
	public CacheDatabasesForConnection createCacheDatabasesForConnection() {
		return new CacheDatabasesForConnection();
	}

	/**
	 * Create an instance of {@link DgMaskerTask }
	 * 
	 */
	public DgMaskerTask createDgMaskerTask() {
		return new DgMaskerTask();
	}

	/**
	 * Create an instance of {@link LoadSensitiveDataDiscoveryErrors }
	 * 
	 */
	public LoadSensitiveDataDiscoveryErrors createLoadSensitiveDataDiscoveryErrors() {
		return new LoadSensitiveDataDiscoveryErrors();
	}

	/**
	 * Create an instance of {@link CacheDatabasesForConnectionResponse }
	 * 
	 */
	public CacheDatabasesForConnectionResponse createCacheDatabasesForConnectionResponse() {
		return new CacheDatabasesForConnectionResponse();
	}

	/**
	 * Create an instance of {@link Login }
	 * 
	 */
	public Login createLogin() {
		return new Login();
	}

	/**
	 * Create an instance of {@link GetDatabaseFindStatus }
	 * 
	 */
	public GetDatabaseFindStatus createGetDatabaseFindStatus() {
		return new GetDatabaseFindStatus();
	}

	/**
	 * Create an instance of {@link DgBaseBean }
	 * 
	 */
	public DgBaseBean createDgBaseBean() {
		return new DgBaseBean();
	}

	/**
	 * Create an instance of {@link DgDiscoverExpression }
	 * 
	 */
	public DgDiscoverExpression createDgDiscoverExpression() {
		return new DgDiscoverExpression();
	}

	/**
	 * Create an instance of {@link LoadSensitiveDataDiscoveryErrorsResponse }
	 * 
	 */
	public LoadSensitiveDataDiscoveryErrorsResponse createLoadSensitiveDataDiscoveryErrorsResponse() {
		return new LoadSensitiveDataDiscoveryErrorsResponse();
	}

	/**
	 * Create an instance of {@link LoginResponse }
	 * 
	 */
	public LoginResponse createLoginResponse() {
		return new LoginResponse();
	}

	/**
	 * Create an instance of {@link LogoutResponse }
	 * 
	 */
	public LogoutResponse createLogoutResponse() {
		return new LogoutResponse();
	}

	/**
	 * Create an instance of {@link DgRegexCounts }
	 * 
	 */
	public DgRegexCounts createDgRegexCounts() {
		return new DgRegexCounts();
	}

	/**
	 * Create an instance of {@link LoadConnectionsInGroupResponse }
	 * 
	 */
	public LoadConnectionsInGroupResponse createLoadConnectionsInGroupResponse() {
		return new LoadConnectionsInGroupResponse();
	}

	/**
	 * Create an instance of {@link DgDiscoverTaskSnapshot }
	 * 
	 */
	public DgDiscoverTaskSnapshot createDgDiscoverTaskSnapshot() {
		return new DgDiscoverTaskSnapshot();
	}

	/**
	 * Create an instance of {@link GetColumns }
	 * 
	 */
	public GetColumns createGetColumns() {
		return new GetColumns();
	}

	/**
	 * Create an instance of {@link LoadDiscoverTaskSnapshot }
	 * 
	 */
	public LoadDiscoverTaskSnapshot createLoadDiscoverTaskSnapshot() {
		return new LoadDiscoverTaskSnapshot();
	}

	/**
	 * Create an instance of {@link TestConnectionResponse }
	 * 
	 */
	public TestConnectionResponse createTestConnectionResponse() {
		return new TestConnectionResponse();
	}


	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDbEncryptFlagStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDbEncryptFlagStatusResponse")
	public JAXBElement<GetDbEncryptFlagStatusResponse> createGetDbEncryptFlagStatusResponse(
			GetDbEncryptFlagStatusResponse value) {
		return new JAXBElement<GetDbEncryptFlagStatusResponse>(
				_GetDbEncryptFlagStatusResponse_QNAME,
				GetDbEncryptFlagStatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link LoadDiscoverTaskResponse }
	 * 
	 */
	public LoadDiscoverTaskResponse createLoadDiscoverTaskResponse() {
		return new LoadDiscoverTaskResponse();
	}

	/**
	 * Create an instance of {@link StartMaskerTaskResponse }
	 * 
	 */
	public StartMaskerTaskResponse createStartMaskerTaskResponse() {
		return new StartMaskerTaskResponse();
	}

	/**
	 * Create an instance of {@link GetColumnsResponse }
	 * 
	 */
	public GetColumnsResponse createGetColumnsResponse() {
		return new GetColumnsResponse();
	}

	/**
	 * Create an instance of {@link DeleteDatabaseFindTask }
	 * 
	 */
	public DeleteDatabaseFindTask createDeleteDatabaseFindTask() {
		return new DeleteDatabaseFindTask();
	}

	/**
	 * Create an instance of {@link SaveDiscoverTaskResponse }
	 * 
	 */
	public SaveDiscoverTaskResponse createSaveDiscoverTaskResponse() {
		return new SaveDiscoverTaskResponse();
	}

	/**
	 * Create an instance of {@link GetMaskerResults }
	 * 
	 */
	public GetMaskerResults createGetMaskerResults() {
		return new GetMaskerResults();
	}

	/**
	 * Create an instance of {@link GetDatabaseFindStatusResponse }
	 * 
	 */
	public GetDatabaseFindStatusResponse createGetDatabaseFindStatusResponse() {
		return new GetDatabaseFindStatusResponse();
	}

	/**
	 * Create an instance of {@link SaveConnection }
	 * 
	 */
	public SaveConnection createSaveConnection() {
		return new SaveConnection();
	}

	/**
	 * Create an instance of {@link LoadMaskerTask }
	 * 
	 */
	public LoadMaskerTask createLoadMaskerTask() {
		return new LoadMaskerTask();
	}

	/**
	 * Create an instance of {@link AuthenticateResponse }
	 * 
	 */
	public AuthenticateResponse createAuthenticateResponse() {
		return new AuthenticateResponse();
	}

	/**
	 * Create an instance of {@link DgMaskerLinkedColumn }
	 * 
	 */
	public DgMaskerLinkedColumn createDgMaskerLinkedColumn() {
		return new DgMaskerLinkedColumn();
	}

	/**
	 * Create an instance of {@link GetTables }
	 * 
	 */
	public GetTables createGetTables() {
		return new GetTables();
	}

	/**
	 * Create an instance of {@link GetMaskerResultsResponse }
	 * 
	 */
	public GetMaskerResultsResponse createGetMaskerResultsResponse() {
		return new GetMaskerResultsResponse();
	}

	/**
	 * Create an instance of {@link GetTablesResponse }
	 * 
	 */
	public GetTablesResponse createGetTablesResponse() {
		return new GetTablesResponse();
	}

	/**
	 * Create an instance of {@link DgLicenseInfoBean }
	 * 
	 */
	public DgLicenseInfoBean createDgLicenseInfoBean() {
		return new DgLicenseInfoBean();
	}

	/**
	 * Create an instance of {@link StartDatabaseFind }
	 * 
	 */
	public StartDatabaseFind createStartDatabaseFind() {
		return new StartDatabaseFind();
	}

	/**
	 * Create an instance of {@link LoadDiscoverTask }
	 * 
	 */
	public LoadDiscoverTask createLoadDiscoverTask() {
		return new LoadDiscoverTask();
	}

	/**
	 * Create an instance of {@link LoadDiscoverResultsSummary }
	 * 
	 */
	public LoadDiscoverResultsSummary createLoadDiscoverResultsSummary() {
		return new LoadDiscoverResultsSummary();
	}

	/**
	 * Create an instance of {@link DgUserAuthorities }
	 * 
	 */
	public DgUserAuthorities createDgUserAuthorities() {
		return new DgUserAuthorities();
	}

	/**
	 * Create an instance of {@link DgDiscoverUIResults }
	 * 
	 */
	public DgDiscoverUIResults createDgDiscoverUIResults() {
		return new DgDiscoverUIResults();
	}

	/**
	 * Create an instance of {@link DgMaskerStatus }
	 * 
	 */
	public DgMaskerStatus createDgMaskerStatus() {
		return new DgMaskerStatus();
	}

	/**
	 * Create an instance of {@link CancelDatabaseFindTask }
	 * 
	 */
	public CancelDatabaseFindTask createCancelDatabaseFindTask() {
		return new CancelDatabaseFindTask();
	}

	/**
	 * Create an instance of {@link DgKeyInfo }
	 * 
	 */
	public DgKeyInfo createDgKeyInfo() {
		return new DgKeyInfo();
	}

	/**
	 * Create an instance of {@link DiffDiscoverResultsResponse }
	 * 
	 */
	public DiffDiscoverResultsResponse createDiffDiscoverResultsResponse() {
		return new DiffDiscoverResultsResponse();
	}

    /**
	 * Create an instance of {@link GetTaskIdforTaskName }
	 * 
	 */
	public GetTaskIdforTaskName createGetTaskIdforTaskName() {
		return new GetTaskIdforTaskName();
	}
	/**
	 * Create an instance of {@link CancelDiscoverTaskInstanceResponse }
	 * 
	 */
	public CancelDiscoverTaskInstanceResponse createCancelDiscoverTaskInstanceResponse() {
		return new CancelDiscoverTaskInstanceResponse();
	}

	/**
	 * Create an instance of {@link StartMaskerTask }
	 * 
	 */
	public StartMaskerTask createStartMaskerTask() {
		return new StartMaskerTask();
	}

	/**
	 * Create an instance of {@link StartDiscoverTaskResponse }
	 * 
	 */
	public StartDiscoverTaskResponse createStartDiscoverTaskResponse() {
		return new StartDiscoverTaskResponse();
	}

	/**
	 * Create an instance of {@link DeleteConnectionResponse }
	 * 
	 */
	public DeleteConnectionResponse createDeleteConnectionResponse() {
		return new DeleteConnectionResponse();
	}

	/**
	 * Create an instance of {@link LoadDatabaseFindResultsByTypeResponse }
	 * 
	 */
	public LoadDatabaseFindResultsByTypeResponse createLoadDatabaseFindResultsByTypeResponse() {
		return new LoadDatabaseFindResultsByTypeResponse();
	}

	/**
	 * Create an instance of {@link NMapStatus }
	 * 
	 */
	public NMapStatus createNMapStatus() {
		return new NMapStatus();
	}

	/**
	 * Create an instance of {@link LoadSynchData }
	 * 
	 */
	public LoadSynchData createLoadSynchData() {
		return new LoadSynchData();
	}

	/**
	 * Create an instance of {@link DeleteMaskerTask }
	 * 
	 */
	public DeleteMaskerTask createDeleteMaskerTask() {
		return new DeleteMaskerTask();
	}

	/**
	 * Create an instance of {@link LoadDgUITaskInstanceResponse }
	 * 
	 */
	public LoadDgUITaskInstanceResponse createLoadDgUITaskInstanceResponse() {
		return new LoadDgUITaskInstanceResponse();
	}

	/**
	 * Create an instance of {@link TestConnection }
	 * 
	 */
	public TestConnection createTestConnection() {
		return new TestConnection();
	}

	/**
	 * Create an instance of {@link DgDiscoverUIDiffResults }
	 * 
	 */
	public DgDiscoverUIDiffResults createDgDiscoverUIDiffResults() {
		return new DgDiscoverUIDiffResults();
	}

	/**
	 * Create an instance of {@link SaveDiscoverSafeList }
	 * 
	 */
	public SaveDiscoverSafeList createSaveDiscoverSafeList() {
		return new SaveDiscoverSafeList();
	}

	/**
	 * Create an instance of {@link LoadDiscoverTaskSnapshotResponse }
	 * 
	 */
	public LoadDiscoverTaskSnapshotResponse createLoadDiscoverTaskSnapshotResponse() {
		return new LoadDiscoverTaskSnapshotResponse();
	}

	
	/**
	 * Create an instance of {@link CancelDatabaseFindTaskResponse }
	 * 
	 */
	public CancelDatabaseFindTaskResponse createCancelDatabaseFindTaskResponse() {
		return new CancelDatabaseFindTaskResponse();
	}

	/**
	 * Create an instance of {@link LoadDatabaseFindResultsByType }
	 * 
	 */
	public LoadDatabaseFindResultsByType createLoadDatabaseFindResultsByType() {
		return new LoadDatabaseFindResultsByType();
	}

	/**
	 * Create an instance of {@link Authenticate }
	 * 
	 */
	public Authenticate createAuthenticate() {
		return new Authenticate();
	}

	/**
	 * Create an instance of {@link GetDatabaseFindResultsResponse }
	 * 
	 */
	public GetDatabaseFindResultsResponse createGetDatabaseFindResultsResponse() {
		return new GetDatabaseFindResultsResponse();
	}

	/**
	 * Create an instance of {@link SaveMaskerTask }
	 * 
	 */
	public SaveMaskerTask createSaveMaskerTask() {
		return new SaveMaskerTask();
	}

	/**
	 * Create an instance of {@link DgSynchDataStructure }
	 * 
	 */
	public DgSynchDataStructure createDgSynchDataStructure() {
		return new DgSynchDataStructure();
	}

	/**
	 * Create an instance of {@link DgDiscoverUIErrors }
	 * 
	 */
	public DgDiscoverUIErrors createDgDiscoverUIErrors() {
		return new DgDiscoverUIErrors();
	}

	/**
	 * Create an instance of {@link StartDatabaseFindResponse }
	 * 
	 */
	public StartDatabaseFindResponse createStartDatabaseFindResponse() {
		return new StartDatabaseFindResponse();
	}

	/**
	 * Create an instance of {@link LoadConnectionGroupsResponse }
	 * 
	 */
	public LoadConnectionGroupsResponse createLoadConnectionGroupsResponse() {
		return new LoadConnectionGroupsResponse();
	}

	/**
	 * Create an instance of {@link DgColumnData }
	 * 
	 */
	public DgColumnData createDgColumnData() {
		return new DgColumnData();
	}

	/**
	 * Create an instance of {@link GetSampleRowResponse }
	 * 
	 */
	public GetSampleRowResponse createGetSampleRowResponse() {
		return new GetSampleRowResponse();
	}

	/**
	 * Create an instance of {@link DgDiscoverTask }
	 * 
	 */
	public DgDiscoverTask createDgDiscoverTask() {
		return new DgDiscoverTask();
	}

	/**
	 * Create an instance of {@link LoadDatabaseFindTask }
	 * 
	 */
	public LoadDatabaseFindTask createLoadDatabaseFindTask() {
		return new LoadDatabaseFindTask();
	}

	/**
	 * Create an instance of {@link LoadDatabaseFindResultsDetailsResponse }
	 * 
	 */
	public LoadDatabaseFindResultsDetailsResponse createLoadDatabaseFindResultsDetailsResponse() {
		return new LoadDatabaseFindResultsDetailsResponse();
	}

	/**
	 * Create an instance of {@link DeleteDatabaseFindTaskResponse }
	 * 
	 */
	public DeleteDatabaseFindTaskResponse createDeleteDatabaseFindTaskResponse() {
		return new DeleteDatabaseFindTaskResponse();
	}

	/**
	 * Create an instance of {@link GetDatabasesResponse }
	 * 
	 */
	public GetDatabasesResponse createGetDatabasesResponse() {
		return new GetDatabasesResponse();
	}

	/**
	 * Create an instance of {@link LoadDgUITaskInstance }
	 * 
	 */
	public LoadDgUITaskInstance createLoadDgUITaskInstance() {
		return new LoadDgUITaskInstance();
	}

	/**
	 * Create an instance of {@link MaskingOptions }
	 * 
	 */
	public MaskingOptions createMaskingOptions() {
		return new MaskingOptions();
	}

	/**
	 * Create an instance of {@link NMapOutputArray }
	 * 
	 */
	public NMapOutputArray createNMapOutputArray() {
		return new NMapOutputArray();
	}

	



	/**
	 * Create an instance of {@link LoadDiscoverSafeList }
	 * 
	 */
	public LoadDiscoverSafeList createLoadDiscoverSafeList() {
		return new LoadDiscoverSafeList();
	}

	/**
	 * Create an instance of {@link NMapTaskIdResultsElement }
	 * 
	 */
	public NMapTaskIdResultsElement createNMapTaskIdResultsElement() {
		return new NMapTaskIdResultsElement();
	}

	/**
	 * Create an instance of {@link CancelDiscoverTaskInstance }
	 * 
	 */
	public CancelDiscoverTaskInstance createCancelDiscoverTaskInstance() {
		return new CancelDiscoverTaskInstance();
	}

	/**
	 * Create an instance of {@link SaveDiscoverExpressionResponse }
	 * 
	 */
	public SaveDiscoverExpressionResponse createSaveDiscoverExpressionResponse() {
		return new SaveDiscoverExpressionResponse();
	}

	/**
	 * Create an instance of {@link GetReferencesResponse }
	 * 
	 */
	public GetReferencesResponse createGetReferencesResponse() {
		return new GetReferencesResponse();
	}

	/**
	 * Create an instance of {@link DgMaskerColumn }
	 * 
	 */
	public DgMaskerColumn createDgMaskerColumn() {
		return new DgMaskerColumn();
	}

	

	/**
	 * Create an instance of {@link SaveDatabaseFindTask }
	 * 
	 */
	public SaveDatabaseFindTask createSaveDatabaseFindTask() {
		return new SaveDatabaseFindTask();
	}


	/**
	 * Create an instance of {@link CheckIfValidSession }
	 * 
	 */
	public CheckIfValidSession createCheckIfValidSession() {
		return new CheckIfValidSession();
	}

	/**
	 * Create an instance of {@link LoadSynchDataResponse }
	 * 
	 */
	public LoadSynchDataResponse createLoadSynchDataResponse() {
		return new LoadSynchDataResponse();
	}

	/**
	 * Create an instance of {@link LoadDiscoverSafeListResponse }
	 * 
	 */
	public LoadDiscoverSafeListResponse createLoadDiscoverSafeListResponse() {
		return new LoadDiscoverSafeListResponse();
	}

	/**
	 * Create an instance of {@link DgAuthenticationInfo }
	 * 
	 */
	public DgAuthenticationInfo createDgAuthenticationInfo() {
		return new DgAuthenticationInfo();
	}

	/**
	 * Create an instance of {@link DiffDiscoverResults }
	 * 
	 */
	public DiffDiscoverResults createDiffDiscoverResults() {
		return new DiffDiscoverResults();
	}

	/**
	 * Create an instance of {@link DeleteMaskerTaskResponse }
	 * 
	 */
	public DeleteMaskerTaskResponse createDeleteMaskerTaskResponse() {
		return new DeleteMaskerTaskResponse();
	}

	/**
	 * Create an instance of {@link LoadSensitiveDataDiscoveryResultsResponse }
	 * 
	 */
	public LoadSensitiveDataDiscoveryResultsResponse createLoadSensitiveDataDiscoveryResultsResponse() {
		return new LoadSensitiveDataDiscoveryResultsResponse();
	}

	/**
	 * Create an instance of {@link LoadDatabaseFindResultsDetails }
	 * 
	 */
	public LoadDatabaseFindResultsDetails createLoadDatabaseFindResultsDetails() {
		return new LoadDatabaseFindResultsDetails();
	}

	/**
	 * Create an instance of {@link GetDatabaseFindResults }
	 * 
	 */
	public GetDatabaseFindResults createGetDatabaseFindResults() {
		return new GetDatabaseFindResults();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "testConnection")
	public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
		return new JAXBElement<TestConnection>(_TestConnection_QNAME,
				TestConnection.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadSensitiveDataDiscoveryErrorsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadSensitiveDataDiscoveryErrorsResponse")
	public JAXBElement<LoadSensitiveDataDiscoveryErrorsResponse> createLoadSensitiveDataDiscoveryErrorsResponse(
			LoadSensitiveDataDiscoveryErrorsResponse value) {
		return new JAXBElement<LoadSensitiveDataDiscoveryErrorsResponse>(
				_LoadSensitiveDataDiscoveryErrorsResponse_QNAME,
				LoadSensitiveDataDiscoveryErrorsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetSampleRow }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getSampleRow")
	public JAXBElement<GetSampleRow> createGetSampleRow(GetSampleRow value) {
		return new JAXBElement<GetSampleRow>(_GetSampleRow_QNAME,
				GetSampleRow.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loginResponse")
	public JAXBElement<LoginResponse> createLoginResponse(LoginResponse value) {
		return new JAXBElement<LoginResponse>(_LoginResponse_QNAME,
				LoginResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DiffDiscoverResultsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "diffDiscoverResultsResponse")
	public JAXBElement<DiffDiscoverResultsResponse> createDiffDiscoverResultsResponse(
			DiffDiscoverResultsResponse value) {
		return new JAXBElement<DiffDiscoverResultsResponse>(
				_DiffDiscoverResultsResponse_QNAME,
				DiffDiscoverResultsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDiscoverTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteDiscoverTaskResponse")
	public JAXBElement<DeleteDiscoverTaskResponse> createDeleteDiscoverTaskResponse(
			DeleteDiscoverTaskResponse value) {
		return new JAXBElement<DeleteDiscoverTaskResponse>(
				_DeleteDiscoverTaskResponse_QNAME,
				DeleteDiscoverTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDatabaseFindTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startDatabaseFindTask")
	public JAXBElement<StartDatabaseFindTask> createStartDatabaseFindTask(
			StartDatabaseFindTask value) {
		return new JAXBElement<StartDatabaseFindTask>(
				_StartDatabaseFindTask_QNAME, StartDatabaseFindTask.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDiscoverSafeListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDiscoverSafeListResponse")
	public JAXBElement<SaveDiscoverSafeListResponse> createSaveDiscoverSafeListResponse(
			SaveDiscoverSafeListResponse value) {
		return new JAXBElement<SaveDiscoverSafeListResponse>(
				_SaveDiscoverSafeListResponse_QNAME,
				SaveDiscoverSafeListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Logout }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "logout")
	public JAXBElement<Logout> createLogout(Logout value) {
		return new JAXBElement<Logout>(_Logout_QNAME, Logout.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDiscoverExpression }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteDiscoverExpression")
	public JAXBElement<DeleteDiscoverExpression> createDeleteDiscoverExpression(
			DeleteDiscoverExpression value) {
		return new JAXBElement<DeleteDiscoverExpression>(
				_DeleteDiscoverExpression_QNAME,
				DeleteDiscoverExpression.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CancelDatabaseFindTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "cancelDatabaseFindTaskResponse")
	public JAXBElement<CancelDatabaseFindTaskResponse> createCancelDatabaseFindTaskResponse(
			CancelDatabaseFindTaskResponse value) {
		return new JAXBElement<CancelDatabaseFindTaskResponse>(
				_CancelDatabaseFindTaskResponse_QNAME,
				CancelDatabaseFindTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDatabaseFindResultsDetailsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDatabaseFindResultsDetailsResponse")
	public JAXBElement<LoadDatabaseFindResultsDetailsResponse> createLoadDatabaseFindResultsDetailsResponse(
			LoadDatabaseFindResultsDetailsResponse value) {
		return new JAXBElement<LoadDatabaseFindResultsDetailsResponse>(
				_LoadDatabaseFindResultsDetailsResponse_QNAME,
				LoadDatabaseFindResultsDetailsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadConnectionGroups }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadConnectionGroups")
	public JAXBElement<LoadConnectionGroups> createLoadConnectionGroups(
			LoadConnectionGroups value) {
		return new JAXBElement<LoadConnectionGroups>(
				_LoadConnectionGroups_QNAME, LoadConnectionGroups.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDatabaseFindResults }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDatabaseFindResults")
	public JAXBElement<GetDatabaseFindResults> createGetDatabaseFindResults(
			GetDatabaseFindResults value) {
		return new JAXBElement<GetDatabaseFindResults>(
				_GetDatabaseFindResults_QNAME, GetDatabaseFindResults.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadSynchDataResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadSynchDataResponse")
	public JAXBElement<LoadSynchDataResponse> createLoadSynchDataResponse(
			LoadSynchDataResponse value) {
		return new JAXBElement<LoadSynchDataResponse>(
				_LoadSynchDataResponse_QNAME, LoadSynchDataResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDatabaseFindTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteDatabaseFindTaskResponse")
	public JAXBElement<DeleteDatabaseFindTaskResponse> createDeleteDatabaseFindTaskResponse(
			DeleteDatabaseFindTaskResponse value) {
		return new JAXBElement<DeleteDatabaseFindTaskResponse>(
				_DeleteDatabaseFindTaskResponse_QNAME,
				DeleteDatabaseFindTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DiffDiscoverResults }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "diffDiscoverResults")
	public JAXBElement<DiffDiscoverResults> createDiffDiscoverResults(
			DiffDiscoverResults value) {
		return new JAXBElement<DiffDiscoverResults>(_DiffDiscoverResults_QNAME,
				DiffDiscoverResults.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDiscoverTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteDiscoverTask")
	public JAXBElement<DeleteDiscoverTask> createDeleteDiscoverTask(
			DeleteDiscoverTask value) {
		return new JAXBElement<DeleteDiscoverTask>(_DeleteDiscoverTask_QNAME,
				DeleteDiscoverTask.class, null, value);
	}





	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteMaskerTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteMaskerTaskResponse")
	public JAXBElement<DeleteMaskerTaskResponse> createDeleteMaskerTaskResponse(
			DeleteMaskerTaskResponse value) {
		return new JAXBElement<DeleteMaskerTaskResponse>(
				_DeleteMaskerTaskResponse_QNAME,
				DeleteMaskerTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDatabaseFindStatus }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDatabaseFindStatus")
	public JAXBElement<GetDatabaseFindStatus> createGetDatabaseFindStatus(
			GetDatabaseFindStatus value) {
		return new JAXBElement<GetDatabaseFindStatus>(
				_GetDatabaseFindStatus_QNAME, GetDatabaseFindStatus.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CheckIfValidSession }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "checkIfValidSession")
	public JAXBElement<CheckIfValidSession> createCheckIfValidSession(
			CheckIfValidSession value) {
		return new JAXBElement<CheckIfValidSession>(_CheckIfValidSession_QNAME,
				CheckIfValidSession.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadConnectionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadConnectionResponse")
	public JAXBElement<LoadConnectionResponse> createLoadConnectionResponse(
			LoadConnectionResponse value) {
		return new JAXBElement<LoadConnectionResponse>(
				_LoadConnectionResponse_QNAME, LoadConnectionResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link TestConnectionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "testConnectionResponse")
	public JAXBElement<TestConnectionResponse> createTestConnectionResponse(
			TestConnectionResponse value) {
		return new JAXBElement<TestConnectionResponse>(
				_TestConnectionResponse_QNAME, TestConnectionResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDatabaseFindTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDatabaseFindTaskResponse")
	public JAXBElement<SaveDatabaseFindTaskResponse> createSaveDatabaseFindTaskResponse(
			SaveDatabaseFindTaskResponse value) {
		return new JAXBElement<SaveDatabaseFindTaskResponse>(
				_SaveDatabaseFindTaskResponse_QNAME,
				SaveDatabaseFindTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadSensitiveDataDiscoveryErrors }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadSensitiveDataDiscoveryErrors")
	public JAXBElement<LoadSensitiveDataDiscoveryErrors> createLoadSensitiveDataDiscoveryErrors(
			LoadSensitiveDataDiscoveryErrors value) {
		return new JAXBElement<LoadSensitiveDataDiscoveryErrors>(
				_LoadSensitiveDataDiscoveryErrors_QNAME,
				LoadSensitiveDataDiscoveryErrors.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSampleRowResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getSampleRowResponse")
	public JAXBElement<GetSampleRowResponse> createGetSampleRowResponse(
			GetSampleRowResponse value) {
		return new JAXBElement<GetSampleRowResponse>(
				_GetSampleRowResponse_QNAME, GetSampleRowResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDbEncryptFlagStatus }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDbEncryptFlagStatus")
	public JAXBElement<GetDbEncryptFlagStatus> createGetDbEncryptFlagStatus(
			GetDbEncryptFlagStatus value) {
		return new JAXBElement<GetDbEncryptFlagStatus>(
				_GetDbEncryptFlagStatus_QNAME, GetDbEncryptFlagStatus.class,
				null, value);
	}



	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CacheDatabasesForConnection }{@code >}
	 * 
	 */
   	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getTaskIdforTaskNameResponse")
	public JAXBElement<GetTaskIdforTaskNameResponse> createGetTaskIdforTaskNameResponse(
			GetTaskIdforTaskNameResponse value) {
		return new JAXBElement<GetTaskIdforTaskNameResponse>(
				_GetTaskIdforTaskNameResponse_QNAME,
				GetTaskIdforTaskNameResponse.class, null, value);
	}


	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "cacheDatabasesForConnection")
	public JAXBElement<CacheDatabasesForConnection> createCacheDatabasesForConnection(
			CacheDatabasesForConnection value) {
		return new JAXBElement<CacheDatabasesForConnection>(
				_CacheDatabasesForConnection_QNAME,
				CacheDatabasesForConnection.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverResultsSummary }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverResultsSummary")
	public JAXBElement<LoadDiscoverResultsSummary> createLoadDiscoverResultsSummary(
			LoadDiscoverResultsSummary value) {
		return new JAXBElement<LoadDiscoverResultsSummary>(
				_LoadDiscoverResultsSummary_QNAME,
				LoadDiscoverResultsSummary.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveMaskerTask }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveMaskerTask")
	public JAXBElement<SaveMaskerTask> createSaveMaskerTask(SaveMaskerTask value) {
		return new JAXBElement<SaveMaskerTask>(_SaveMaskerTask_QNAME,
				SaveMaskerTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetColumnsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getColumnsResponse")
	public JAXBElement<GetColumnsResponse> createGetColumnsResponse(
			GetColumnsResponse value) {
		return new JAXBElement<GetColumnsResponse>(_GetColumnsResponse_QNAME,
				GetColumnsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetLicenseInfoResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getLicenseInfoResponse")
	public JAXBElement<GetLicenseInfoResponse> createGetLicenseInfoResponse(
			GetLicenseInfoResponse value) {
		return new JAXBElement<GetLicenseInfoResponse>(
				_GetLicenseInfoResponse_QNAME, GetLicenseInfoResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetBrandingResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getBrandingResponse")
	public JAXBElement<GetBrandingResponse> createGetBrandingResponse(
			GetBrandingResponse value) {
		return new JAXBElement<GetBrandingResponse>(
				_GetBrandingResponse_QNAME, GetBrandingResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverResultsSummaryPdf }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverResultsSummaryPdf")
	public JAXBElement<LoadDiscoverResultsSummaryPdf> createLoadDiscoverResultsSummaryPdf(
			LoadDiscoverResultsSummaryPdf value) {
		return new JAXBElement<LoadDiscoverResultsSummaryPdf>(
				_LoadDiscoverResultsSummaryPdf_QNAME,
				LoadDiscoverResultsSummaryPdf.class, null, value);
	}



	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDatabaseFindTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteDatabaseFindTask")
	public JAXBElement<DeleteDatabaseFindTask> createDeleteDatabaseFindTask(
			DeleteDatabaseFindTask value) {
		return new JAXBElement<DeleteDatabaseFindTask>(
				_DeleteDatabaseFindTask_QNAME, DeleteDatabaseFindTask.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadSensitiveDataDiscoveryResults }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadSensitiveDataDiscoveryResults")
	public JAXBElement<LoadSensitiveDataDiscoveryResults> createLoadSensitiveDataDiscoveryResults(
			LoadSensitiveDataDiscoveryResults value) {
		return new JAXBElement<LoadSensitiveDataDiscoveryResults>(
				_LoadSensitiveDataDiscoveryResults_QNAME,
				LoadSensitiveDataDiscoveryResults.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetColumns }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getColumns")
	public JAXBElement<GetColumns> createGetColumns(GetColumns value) {
		return new JAXBElement<GetColumns>(_GetColumns_QNAME, GetColumns.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskerStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getMaskerStatusResponse")
	public JAXBElement<GetMaskerStatusResponse> createGetMaskerStatusResponse(
			GetMaskerStatusResponse value) {
		return new JAXBElement<GetMaskerStatusResponse>(
				_GetMaskerStatusResponse_QNAME, GetMaskerStatusResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDatabaseFindResultsByType }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDatabaseFindResultsByType")
	public JAXBElement<LoadDatabaseFindResultsByType> createLoadDatabaseFindResultsByType(
			LoadDatabaseFindResultsByType value) {
		return new JAXBElement<LoadDatabaseFindResultsByType>(
				_LoadDatabaseFindResultsByType_QNAME,
				LoadDatabaseFindResultsByType.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDatabaseFindTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startDatabaseFindTaskResponse")
	public JAXBElement<StartDatabaseFindTaskResponse> createStartDatabaseFindTaskResponse(
			StartDatabaseFindTaskResponse value) {
		return new JAXBElement<StartDatabaseFindTaskResponse>(
				_StartDatabaseFindTaskResponse_QNAME,
				StartDatabaseFindTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDiscoverExpressionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDiscoverExpressionResponse")
	public JAXBElement<SaveDiscoverExpressionResponse> createSaveDiscoverExpressionResponse(
			SaveDiscoverExpressionResponse value) {
		return new JAXBElement<SaveDiscoverExpressionResponse>(
				_SaveDiscoverExpressionResponse_QNAME,
				SaveDiscoverExpressionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDiscoverTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDiscoverTask")
	public JAXBElement<SaveDiscoverTask> createSaveDiscoverTask(
			SaveDiscoverTask value) {
		return new JAXBElement<SaveDiscoverTask>(_SaveDiscoverTask_QNAME,
				SaveDiscoverTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link DgFaultInfo }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "DgException")
	public JAXBElement<DgFaultInfo> createDgException(DgFaultInfo value) {
		return new JAXBElement<DgFaultInfo>(_DgException_QNAME,
				DgFaultInfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDatabaseFindResultsDetails }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDatabaseFindResultsDetails")
	public JAXBElement<LoadDatabaseFindResultsDetails> createLoadDatabaseFindResultsDetails(
			LoadDatabaseFindResultsDetails value) {
		return new JAXBElement<LoadDatabaseFindResultsDetails>(
				_LoadDatabaseFindResultsDetails_QNAME,
				LoadDatabaseFindResultsDetails.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetLicenseInfo }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getLicenseInfo")
	public JAXBElement<GetLicenseInfo> createGetLicenseInfo(GetLicenseInfo value) {
		return new JAXBElement<GetLicenseInfo>(_GetLicenseInfo_QNAME,
				GetLicenseInfo.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetBranding }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getBranding")
	public JAXBElement<GetBranding> createGetBranding(GetBranding value) {
		return new JAXBElement<GetBranding>(_GetBranding_QNAME,
				GetBranding.class, null, value);
	}
	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskerResultsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getMaskerResultsResponse")
	public JAXBElement<GetMaskerResultsResponse> createGetMaskerResultsResponse(
			GetMaskerResultsResponse value) {
		return new JAXBElement<GetMaskerResultsResponse>(
				_GetMaskerResultsResponse_QNAME,
				GetMaskerResultsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetTablesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getTablesResponse")
	public JAXBElement<GetTablesResponse> createGetTablesResponse(
			GetTablesResponse value) {
		return new JAXBElement<GetTablesResponse>(_GetTablesResponse_QNAME,
				GetTablesResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDiscoverTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startDiscoverTask")
	public JAXBElement<StartDiscoverTask> createStartDiscoverTask(
			StartDiscoverTask value) {
		return new JAXBElement<StartDiscoverTask>(_StartDiscoverTask_QNAME,
				StartDiscoverTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDatabaseFindTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDatabaseFindTask")
	public JAXBElement<LoadDatabaseFindTask> createLoadDatabaseFindTask(
			LoadDatabaseFindTask value) {
		return new JAXBElement<LoadDatabaseFindTask>(
				_LoadDatabaseFindTask_QNAME, LoadDatabaseFindTask.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CancelDatabaseFindTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "cancelDatabaseFindTask")
	public JAXBElement<CancelDatabaseFindTask> createCancelDatabaseFindTask(
			CancelDatabaseFindTask value) {
		return new JAXBElement<CancelDatabaseFindTask>(
				_CancelDatabaseFindTask_QNAME, CancelDatabaseFindTask.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDatabaseFindResultsByTypeResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDatabaseFindResultsByTypeResponse")
	public JAXBElement<LoadDatabaseFindResultsByTypeResponse> createLoadDatabaseFindResultsByTypeResponse(
			LoadDatabaseFindResultsByTypeResponse value) {
		return new JAXBElement<LoadDatabaseFindResultsByTypeResponse>(
				_LoadDatabaseFindResultsByTypeResponse_QNAME,
				LoadDatabaseFindResultsByTypeResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveConnectionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveConnectionResponse")
	public JAXBElement<SaveConnectionResponse> createSaveConnectionResponse(
			SaveConnectionResponse value) {
		return new JAXBElement<SaveConnectionResponse>(
				_SaveConnectionResponse_QNAME, SaveConnectionResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadSensitiveDataDiscoveryResultsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadSensitiveDataDiscoveryResultsResponse")
	public JAXBElement<LoadSensitiveDataDiscoveryResultsResponse> createLoadSensitiveDataDiscoveryResultsResponse(
			LoadSensitiveDataDiscoveryResultsResponse value) {
		return new JAXBElement<LoadSensitiveDataDiscoveryResultsResponse>(
				_LoadSensitiveDataDiscoveryResultsResponse_QNAME,
				LoadSensitiveDataDiscoveryResultsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadMaskerTask }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadMaskerTask")
	public JAXBElement<LoadMaskerTask> createLoadMaskerTask(LoadMaskerTask value) {
		return new JAXBElement<LoadMaskerTask>(_LoadMaskerTask_QNAME,
				LoadMaskerTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDatabaseFindTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDatabaseFindTask")
	public JAXBElement<SaveDatabaseFindTask> createSaveDatabaseFindTask(
			SaveDatabaseFindTask value) {
		return new JAXBElement<SaveDatabaseFindTask>(
				_SaveDatabaseFindTask_QNAME, SaveDatabaseFindTask.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetReferencesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getReferencesResponse")
	public JAXBElement<GetReferencesResponse> createGetReferencesResponse(
			GetReferencesResponse value) {
		return new JAXBElement<GetReferencesResponse>(
				_GetReferencesResponse_QNAME, GetReferencesResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadConnectionsInGroupResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadConnectionsInGroupResponse")
	public JAXBElement<LoadConnectionsInGroupResponse> createLoadConnectionsInGroupResponse(
			LoadConnectionsInGroupResponse value) {
		return new JAXBElement<LoadConnectionsInGroupResponse>(
				_LoadConnectionsInGroupResponse_QNAME,
				LoadConnectionsInGroupResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverTaskSnapshotResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverTaskSnapshotResponse")
	public JAXBElement<LoadDiscoverTaskSnapshotResponse> createLoadDiscoverTaskSnapshotResponse(
			LoadDiscoverTaskSnapshotResponse value) {
		return new JAXBElement<LoadDiscoverTaskSnapshotResponse>(
				_LoadDiscoverTaskSnapshotResponse_QNAME,
				LoadDiscoverTaskSnapshotResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link AuthenticateResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "authenticateResponse")
	public JAXBElement<AuthenticateResponse> createAuthenticateResponse(
			AuthenticateResponse value) {
		return new JAXBElement<AuthenticateResponse>(
				_AuthenticateResponse_QNAME, AuthenticateResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDatabasesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDatabasesResponse")
	public JAXBElement<GetDatabasesResponse> createGetDatabasesResponse(
			GetDatabasesResponse value) {
		return new JAXBElement<GetDatabasesResponse>(
				_GetDatabasesResponse_QNAME, GetDatabasesResponse.class, null,
				value);
	}




	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadMaskerTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadMaskerTaskResponse")
	public JAXBElement<LoadMaskerTaskResponse> createLoadMaskerTaskResponse(
			LoadMaskerTaskResponse value) {
		return new JAXBElement<LoadMaskerTaskResponse>(
				_LoadMaskerTaskResponse_QNAME, LoadMaskerTaskResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDgUITaskInstanceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDgUITaskInstanceResponse")
	public JAXBElement<LoadDgUITaskInstanceResponse> createLoadDgUITaskInstanceResponse(
			LoadDgUITaskInstanceResponse value) {
		return new JAXBElement<LoadDgUITaskInstanceResponse>(
				_LoadDgUITaskInstanceResponse_QNAME,
				LoadDgUITaskInstanceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CancelDiscoverTaskInstanceResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "cancelDiscoverTaskInstanceResponse")
	public JAXBElement<CancelDiscoverTaskInstanceResponse> createCancelDiscoverTaskInstanceResponse(
			CancelDiscoverTaskInstanceResponse value) {
		return new JAXBElement<CancelDiscoverTaskInstanceResponse>(
				_CancelDiscoverTaskInstanceResponse_QNAME,
				CancelDiscoverTaskInstanceResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CheckIfValidSessionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "checkIfValidSessionResponse")
	public JAXBElement<CheckIfValidSessionResponse> createCheckIfValidSessionResponse(
			CheckIfValidSessionResponse value) {
		return new JAXBElement<CheckIfValidSessionResponse>(
				_CheckIfValidSessionResponse_QNAME,
				CheckIfValidSessionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CancelDiscoverTaskInstance }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "cancelDiscoverTaskInstance")
	public JAXBElement<CancelDiscoverTaskInstance> createCancelDiscoverTaskInstance(
			CancelDiscoverTaskInstance value) {
		return new JAXBElement<CancelDiscoverTaskInstance>(
				_CancelDiscoverTaskInstance_QNAME,
				CancelDiscoverTaskInstance.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverResultsSummaryPdfResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverResultsSummaryPdfResponse")
	public JAXBElement<LoadDiscoverResultsSummaryPdfResponse> createLoadDiscoverResultsSummaryPdfResponse(
			LoadDiscoverResultsSummaryPdfResponse value) {
		return new JAXBElement<LoadDiscoverResultsSummaryPdfResponse>(
				_LoadDiscoverResultsSummaryPdfResponse_QNAME,
				LoadDiscoverResultsSummaryPdfResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTables }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getTables")
	public JAXBElement<GetTables> createGetTables(GetTables value) {
		return new JAXBElement<GetTables>(_GetTables_QNAME, GetTables.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadConnection }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadConnection")
	public JAXBElement<LoadConnection> createLoadConnection(LoadConnection value) {
		return new JAXBElement<LoadConnection>(_LoadConnection_QNAME,
				LoadConnection.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverExpression }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverExpression")
	public JAXBElement<LoadDiscoverExpression> createLoadDiscoverExpression(
			LoadDiscoverExpression value) {
		return new JAXBElement<LoadDiscoverExpression>(
				_LoadDiscoverExpression_QNAME, LoadDiscoverExpression.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CacheDatabasesForConnectionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "cacheDatabasesForConnectionResponse")
	public JAXBElement<CacheDatabasesForConnectionResponse> createCacheDatabasesForConnectionResponse(
			CacheDatabasesForConnectionResponse value) {
		return new JAXBElement<CacheDatabasesForConnectionResponse>(
				_CacheDatabasesForConnectionResponse_QNAME,
				CacheDatabasesForConnectionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartMaskerTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startMaskerTaskResponse")
	public JAXBElement<StartMaskerTaskResponse> createStartMaskerTaskResponse(
			StartMaskerTaskResponse value) {
		return new JAXBElement<StartMaskerTaskResponse>(
				_StartMaskerTaskResponse_QNAME, StartMaskerTaskResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetReferences }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getReferences")
	public JAXBElement<GetReferences> createGetReferences(GetReferences value) {
		return new JAXBElement<GetReferences>(_GetReferences_QNAME,
				GetReferences.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDatabaseFind }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startDatabaseFind")
	public JAXBElement<StartDatabaseFind> createStartDatabaseFind(
			StartDatabaseFind value) {
		return new JAXBElement<StartDatabaseFind>(_StartDatabaseFind_QNAME,
				StartDatabaseFind.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadConnectionsInGroup }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadConnectionsInGroup")
	public JAXBElement<LoadConnectionsInGroup> createLoadConnectionsInGroup(
			LoadConnectionsInGroup value) {
		return new JAXBElement<LoadConnectionsInGroup>(
				_LoadConnectionsInGroup_QNAME, LoadConnectionsInGroup.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverExpressionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverExpressionResponse")
	public JAXBElement<LoadDiscoverExpressionResponse> createLoadDiscoverExpressionResponse(
			LoadDiscoverExpressionResponse value) {
		return new JAXBElement<LoadDiscoverExpressionResponse>(
				_LoadDiscoverExpressionResponse_QNAME,
				LoadDiscoverExpressionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Authenticate }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "authenticate")
	public JAXBElement<Authenticate> createAuthenticate(Authenticate value) {
		return new JAXBElement<Authenticate>(_Authenticate_QNAME,
				Authenticate.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteDiscoverExpressionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteDiscoverExpressionResponse")
	public JAXBElement<DeleteDiscoverExpressionResponse> createDeleteDiscoverExpressionResponse(
			DeleteDiscoverExpressionResponse value) {
		return new JAXBElement<DeleteDiscoverExpressionResponse>(
				_DeleteDiscoverExpressionResponse_QNAME,
				DeleteDiscoverExpressionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getTaskIdforTaskName")
	public JAXBElement<GetTaskIdforTaskName> createGetTaskIdforTaskName(
			GetTaskIdforTaskName value) {
		return new JAXBElement<GetTaskIdforTaskName>(
				_GetTaskIdforTaskName_QNAME, GetTaskIdforTaskName.class, null,
				value);
	}
	 * {@link SaveDiscoverTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDiscoverTaskResponse")
	public JAXBElement<SaveDiscoverTaskResponse> createSaveDiscoverTaskResponse(
			SaveDiscoverTaskResponse value) {
		return new JAXBElement<SaveDiscoverTaskResponse>(
				_SaveDiscoverTaskResponse_QNAME,
				SaveDiscoverTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveMaskerTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveMaskerTaskResponse")
	public JAXBElement<SaveMaskerTaskResponse> createSaveMaskerTaskResponse(
			SaveMaskerTaskResponse value) {
		return new JAXBElement<SaveMaskerTaskResponse>(
				_SaveMaskerTaskResponse_QNAME, SaveMaskerTaskResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDatabaseFindTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDatabaseFindTaskResponse")
	public JAXBElement<LoadDatabaseFindTaskResponse> createLoadDatabaseFindTaskResponse(
			LoadDatabaseFindTaskResponse value) {
		return new JAXBElement<LoadDatabaseFindTaskResponse>(
				_LoadDatabaseFindTaskResponse_QNAME,
				LoadDatabaseFindTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverTask")
	public JAXBElement<LoadDiscoverTask> createLoadDiscoverTask(
			LoadDiscoverTask value) {
		return new JAXBElement<LoadDiscoverTask>(_LoadDiscoverTask_QNAME,
				LoadDiscoverTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDatabaseFindResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startDatabaseFindResponse")
	public JAXBElement<StartDatabaseFindResponse> createStartDatabaseFindResponse(
			StartDatabaseFindResponse value) {
		return new JAXBElement<StartDatabaseFindResponse>(
				_StartDatabaseFindResponse_QNAME,
				StartDatabaseFindResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDiscoverSafeList }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDiscoverSafeList")
	public JAXBElement<SaveDiscoverSafeList> createSaveDiscoverSafeList(
			SaveDiscoverSafeList value) {
		return new JAXBElement<SaveDiscoverSafeList>(
				_SaveDiscoverSafeList_QNAME, SaveDiscoverSafeList.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadConnectionGroupsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadConnectionGroupsResponse")
	public JAXBElement<LoadConnectionGroupsResponse> createLoadConnectionGroupsResponse(
			LoadConnectionGroupsResponse value) {
		return new JAXBElement<LoadConnectionGroupsResponse>(
				_LoadConnectionGroupsResponse_QNAME,
				LoadConnectionGroupsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverTaskResponse")
	public JAXBElement<LoadDiscoverTaskResponse> createLoadDiscoverTaskResponse(
			LoadDiscoverTaskResponse value) {
		return new JAXBElement<LoadDiscoverTaskResponse>(
				_LoadDiscoverTaskResponse_QNAME,
				LoadDiscoverTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDatabaseFindStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDatabaseFindStatusResponse")
	public JAXBElement<GetDatabaseFindStatusResponse> createGetDatabaseFindStatusResponse(
			GetDatabaseFindStatusResponse value) {
		return new JAXBElement<GetDatabaseFindStatusResponse>(
				_GetDatabaseFindStatusResponse_QNAME,
				GetDatabaseFindStatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverResultsSummaryResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverResultsSummaryResponse")
	public JAXBElement<LoadDiscoverResultsSummaryResponse> createLoadDiscoverResultsSummaryResponse(
			LoadDiscoverResultsSummaryResponse value) {
		return new JAXBElement<LoadDiscoverResultsSummaryResponse>(
				_LoadDiscoverResultsSummaryResponse_QNAME,
				LoadDiscoverResultsSummaryResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDatabaseFindResultsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDatabaseFindResultsResponse")
	public JAXBElement<GetDatabaseFindResultsResponse> createGetDatabaseFindResultsResponse(
			GetDatabaseFindResultsResponse value) {
		return new JAXBElement<GetDatabaseFindResultsResponse>(
				_GetDatabaseFindResultsResponse_QNAME,
				GetDatabaseFindResultsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link SaveDiscoverExpression }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveDiscoverExpression")
	public JAXBElement<SaveDiscoverExpression> createSaveDiscoverExpression(
			SaveDiscoverExpression value) {
		return new JAXBElement<SaveDiscoverExpression>(
				_SaveDiscoverExpression_QNAME, SaveDiscoverExpression.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetMaskerStatus }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getMaskerStatus")
	public JAXBElement<GetMaskerStatus> createGetMaskerStatus(
			GetMaskerStatus value) {
		return new JAXBElement<GetMaskerStatus>(_GetMaskerStatus_QNAME,
				GetMaskerStatus.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDiscoverTaskResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startDiscoverTaskResponse")
	public JAXBElement<StartDiscoverTaskResponse> createStartDiscoverTaskResponse(
			StartDiscoverTaskResponse value) {
		return new JAXBElement<StartDiscoverTaskResponse>(
				_StartDiscoverTaskResponse_QNAME,
				StartDiscoverTaskResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDgUITaskInstance }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDgUITaskInstance")
	public JAXBElement<LoadDgUITaskInstance> createLoadDgUITaskInstance(
			LoadDgUITaskInstance value) {
		return new JAXBElement<LoadDgUITaskInstance>(
				_LoadDgUITaskInstance_QNAME, LoadDgUITaskInstance.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteMaskerTask }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteMaskerTask")
	public JAXBElement<DeleteMaskerTask> createDeleteMaskerTask(
			DeleteMaskerTask value) {
		return new JAXBElement<DeleteMaskerTask>(_DeleteMaskerTask_QNAME,
				DeleteMaskerTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteConnectionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteConnectionResponse")
	public JAXBElement<DeleteConnectionResponse> createDeleteConnectionResponse(
			DeleteConnectionResponse value) {
		return new JAXBElement<DeleteConnectionResponse>(
				_DeleteConnectionResponse_QNAME,
				DeleteConnectionResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskerResults }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getMaskerResults")
	public JAXBElement<GetMaskerResults> createGetMaskerResults(
			GetMaskerResults value) {
		return new JAXBElement<GetMaskerResults>(_GetMaskerResults_QNAME,
				GetMaskerResults.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link Login }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "login")
	public JAXBElement<Login> createLogin(Login value) {
		return new JAXBElement<Login>(_Login_QNAME, Login.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link SaveConnection }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "saveConnection")
	public JAXBElement<SaveConnection> createSaveConnection(SaveConnection value) {
		return new JAXBElement<SaveConnection>(_SaveConnection_QNAME,
				SaveConnection.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetDatabases }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "getDatabases")
	public JAXBElement<GetDatabases> createGetDatabases(GetDatabases value) {
		return new JAXBElement<GetDatabases>(_GetDatabases_QNAME,
				GetDatabases.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link DeleteConnection }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "deleteConnection")
	public JAXBElement<DeleteConnection> createDeleteConnection(
			DeleteConnection value) {
		return new JAXBElement<DeleteConnection>(_DeleteConnection_QNAME,
				DeleteConnection.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverSafeList }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverSafeList")
	public JAXBElement<LoadDiscoverSafeList> createLoadDiscoverSafeList(
			LoadDiscoverSafeList value) {
		return new JAXBElement<LoadDiscoverSafeList>(
				_LoadDiscoverSafeList_QNAME, LoadDiscoverSafeList.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LogoutResponse }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "logoutResponse")
	public JAXBElement<LogoutResponse> createLogoutResponse(LogoutResponse value) {
		return new JAXBElement<LogoutResponse>(_LogoutResponse_QNAME,
				LogoutResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverSafeListResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverSafeListResponse")
	public JAXBElement<LoadDiscoverSafeListResponse> createLoadDiscoverSafeListResponse(
			LoadDiscoverSafeListResponse value) {
		return new JAXBElement<LoadDiscoverSafeListResponse>(
				_LoadDiscoverSafeListResponse_QNAME,
				LoadDiscoverSafeListResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link StartMaskerTask }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "startMaskerTask")
	public JAXBElement<StartMaskerTask> createStartMaskerTask(
			StartMaskerTask value) {
		return new JAXBElement<StartMaskerTask>(_StartMaskerTask_QNAME,
				StartMaskerTask.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadDiscoverTaskSnapshot }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadDiscoverTaskSnapshot")
	public JAXBElement<LoadDiscoverTaskSnapshot> createLoadDiscoverTaskSnapshot(
			LoadDiscoverTaskSnapshot value) {
		return new JAXBElement<LoadDiscoverTaskSnapshot>(
				_LoadDiscoverTaskSnapshot_QNAME,
				LoadDiscoverTaskSnapshot.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadSynchData }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://webservices.dataguise.com/", name = "loadSynchData")
	public JAXBElement<LoadSynchData> createLoadSynchData(LoadSynchData value) {
		return new JAXBElement<LoadSynchData>(_LoadSynchData_QNAME,
				LoadSynchData.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = LoadDiscoverResultsSummaryPdfResponse.class)
	public JAXBElement<byte[]> createLoadDiscoverResultsSummaryPdfResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME,
				byte[].class, LoadDiscoverResultsSummaryPdfResponse.class,
				((byte[]) value));
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetPathPermissionInfoResponse.class)
	public JAXBElement<byte[]> createGetPathPermissionInfoResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME, byte[].class,
				GetPathPermissionInfoResponse.class, ((byte[]) value));
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetHDFSresultsDataForPDFResponse.class)
	public JAXBElement<byte[]> createGetHDFSresultsDataForPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME, byte[].class,
				GetHDFSresultsDataForPDFResponse.class, ((byte[]) value));
	}

	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetHDFSDateRangeResultsPDFResponse.class)
	public JAXBElement<byte[]> createGetHDFSDateRangeResultsPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME,
				byte[].class, GetHDFSDateRangeResultsPDFResponse.class,
				((byte[]) value));
	}
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetPathPermissionInfoSummaryResponse.class)
	public JAXBElement<byte[]> createGetPathPermissionInfoSummaryResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME, byte[].class,
				GetPathPermissionInfoSummaryResponse.class, ((byte[]) value));
	}
	
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetSearchFileResultsPDFResponse.class)
	public JAXBElement<byte[]> createGetSearchFileResultsPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME, byte[].class,
				GetSearchFileResultsPDFResponse.class, ((byte[]) value));
	}

	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetPermissionForUserOrGroupResponse.class)
	public JAXBElement<byte[]> createGetPermissionForUserOrGroupResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME,
				byte[].class, GetPermissionForUserOrGroupResponse.class,
				((byte[]) value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetPermissionSummaryForUserOrGroupResponse.class)
	public JAXBElement<byte[]> createGetPermissionSummaryForUserOrGroupResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME,
				byte[].class, GetPermissionSummaryForUserOrGroupResponse.class,
				((byte[]) value));
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetDgFtpResultsDetailsPDFResponse.class)
	public JAXBElement<byte[]> createGetDgFtpResultsDetailsPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME, byte[].class,
				GetDgFtpResultsDetailsPDFResponse.class, ((byte[]) value));
	}
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetMaskerResultsDataForPDFResponse.class)
	public JAXBElement<byte[]> createGetMaskerResultsDataForPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME,
				byte[].class, GetMaskerResultsDataForPDFResponse.class,
				((byte[]) value));
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetDatabaseFindResultsDetailsPDFResponse.class)
	public JAXBElement<byte[]> createGetDatabaseFindResultsDetailsPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME, byte[].class,
				GetDatabaseFindResultsDetailsPDFResponse.class,
				((byte[]) value));
	}
	
	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "", name = "return", scope = GetSearchItResultsDataForPDFResponse.class)
	public JAXBElement<byte[]> createGetSearchItResultsDataForPDFResponseReturn(
			byte[] value) {
		return new JAXBElement<byte[]>(
				_LoadDiscoverResultsSummaryPdfResponseReturn_QNAME,
				byte[].class, GetSearchItResultsDataForPDFResponse.class,
				((byte[]) value));
	}
	
	
	
	
	
	
}
