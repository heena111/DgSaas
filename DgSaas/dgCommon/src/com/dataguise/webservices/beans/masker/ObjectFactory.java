package com.dataguise.webservices.beans.masker;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

import com.dataguise.webservices.beans.DgBaseBean;
import com.dataguise.webservices.beans.DgColumnInfo;
import com.dataguise.webservices.beans.DgConnection;
import com.dataguise.webservices.beans.DgFaultInfo;
import com.dataguise.webservices.beans.DgKeyInfo;
import com.dataguise.webservices.beans.DgSynchDataStructure;
import com.dataguise.webservices.beans.MaskerProgressStatus;
import com.dataguise.webservices.beans.MaskerSummaryStatus;
import com.dataguise.webservices.beans.MaskingOptions;

/**
 * This object contains factory methods for each Java content interface and Java
 * element interface generated in the com.dataguise.webservices.beans.masker
 * package.
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

	private final static QName _GetDefaultLogContent_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getDefaultLogContent");
	private final static QName _ClearDefaultLogContent_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"clearDefaultLogContent");
	private final static QName _GetColumnsResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getColumnsResponse");
	private final static QName _GetDatabasesResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getDatabasesResponse");
	private final static QName _ClearLogContent_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "clearLogContent");
	private final static QName _StartDatabaseMaskingResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"startDatabaseMaskingResponse");
	private final static QName _GetSampleRowResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getSampleRowResponse");
	private final static QName _GetMaskingProgressStatusResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getMaskingProgressStatusResponse");
	private final static QName _GetReferencesResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getReferencesResponse");
	private final static QName _GetDefaultLogContentResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getDefaultLogContentResponse");
	private final static QName _GetLogContent_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "getLogContent");
	private final static QName _TestConnectionResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"testConnectionResponse");
	private final static QName _GetSampleRow_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "getSampleRow");
	private final static QName _TestConnection_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "testConnection");
	private final static QName _GetTablesResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getTablesResponse");
	private final static QName _LoadSynchData_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "loadSynchData");
	private final static QName _TruncateSchemaResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"truncateSchemaResponse");
	private final static QName _ClearDefaultLogContentResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"clearDefaultLogContentResponse");
	private final static QName _GetMaskingProgressStatus_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getMaskingProgressStatus");
	private final static QName _GetMaskingSummaryStatus_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getMaskingSummaryStatus");
	private final static QName _GetDatabases_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "getDatabases");
	private final static QName _CancelMasking_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "cancelMasking");
	private final static QName _GetLogContentResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getLogContentResponse");
	private final static QName _GetReferences_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "getReferences");
	private final static QName _CancelMaskingResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"cancelMaskingResponse");
	private final static QName _LoadSynchDataResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"loadSynchDataResponse");
	private final static QName _DgException_QNAME = new QName(
			"http://webservices.dataguise.com/", "DgException");
	private final static QName _StartDatabaseMasking_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"startDatabaseMasking");
	private final static QName _GetColumns_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "getColumns");
	private final static QName _GetMaskingSummaryStatusResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"getMaskingSummaryStatusResponse");
	private final static QName _TruncateSchema_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "truncateSchema");
	private final static QName _GetTables_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/", "getTables");
	private final static QName _ClearLogContentResponse_QNAME = new QName(
			"http://MaskerAgent.webservices.dataguise.com/",
			"clearLogContentResponse");

	/**
	 * Create a new ObjectFactory that can be used to create new instances of
	 * schema derived classes for package:
	 * com.dataguise.webservices.beans.masker
	 * 
	 */
	public ObjectFactory() {
	}

	/**
	 * Create an instance of {@link StartDatabaseMaskingResponse }
	 * 
	 */
	public StartDatabaseMaskingResponse createStartDatabaseMaskingResponse() {
		return new StartDatabaseMaskingResponse();
	}

	/**
	 * Create an instance of {@link TruncateSchema }
	 * 
	 */
	public TruncateSchema createTruncateSchema() {
		return new TruncateSchema();
	}

	/**
	 * Create an instance of {@link GetLogContent }
	 * 
	 */
	public GetLogContent createGetLogContent() {
		return new GetLogContent();
	}

	/**
	 * Create an instance of {@link CancelMaskingResponse }
	 * 
	 */
	public CancelMaskingResponse createCancelMaskingResponse() {
		return new CancelMaskingResponse();
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
	 * Create an instance of {@link GetColumns }
	 * 
	 */
	public GetColumns createGetColumns() {
		return new GetColumns();
	}

	/**
	 * Create an instance of {@link DgColumnData }
	 * 
	 */
	public DgColumnData createDgColumnData() {
		return new DgColumnData();
	}

	/**
	 * Create an instance of {@link GetDatabasesResponse }
	 * 
	 */
	public GetDatabasesResponse createGetDatabasesResponse() {
		return new GetDatabasesResponse();
	}

	/**
	 * Create an instance of {@link TestConnection }
	 * 
	 */
	public TestConnection createTestConnection() {
		return new TestConnection();
	}

	/**
	 * Create an instance of {@link DgKeyInfo }
	 * 
	 */
	public DgKeyInfo createDgKeyInfo() {
		return new DgKeyInfo();
	}

	/**
	 * Create an instance of {@link DgMaskerParameters }
	 * 
	 */
	public DgMaskerParameters createDgMaskerParameters() {
		return new DgMaskerParameters();
	}

	/**
	 * Create an instance of {@link ClearLogContent }
	 * 
	 */
	public ClearLogContent createClearLogContent() {
		return new ClearLogContent();
	}

	/**
	 * Create an instance of {@link GetColumnsResponse }
	 * 
	 */
	public GetColumnsResponse createGetColumnsResponse() {
		return new GetColumnsResponse();
	}

	/**
	 * Create an instance of {@link GetSampleRow }
	 * 
	 */
	public GetSampleRow createGetSampleRow() {
		return new GetSampleRow();
	}

	/**
	 * Create an instance of {@link DgSynchDataStructure }
	 * 
	 */
	public DgSynchDataStructure createDgSynchDataStructure() {
		return new DgSynchDataStructure();
	}

	/**
	 * Create an instance of {@link GetMaskingSummaryStatus }
	 * 
	 */
	public GetMaskingSummaryStatus createGetMaskingSummaryStatus() {
		return new GetMaskingSummaryStatus();
	}

	/**
	 * Create an instance of {@link ClearLogContentResponse }
	 * 
	 */
	public ClearLogContentResponse createClearLogContentResponse() {
		return new ClearLogContentResponse();
	}

	/**
	 * Create an instance of {@link GetTablesResponse }
	 * 
	 */
	public GetTablesResponse createGetTablesResponse() {
		return new GetTablesResponse();
	}

	/**
	 * Create an instance of {@link LoadSynchDataResponse }
	 * 
	 */
	public LoadSynchDataResponse createLoadSynchDataResponse() {
		return new LoadSynchDataResponse();
	}

	/**
	 * Create an instance of {@link MaskerSummaryStatus }
	 * 
	 */
	public MaskerSummaryStatus createMaskerSummaryStatus() {
		return new MaskerSummaryStatus();
	}

	/**
	 * Create an instance of {@link StartDatabaseMasking }
	 * 
	 */
	public StartDatabaseMasking createStartDatabaseMasking() {
		return new StartDatabaseMasking();
	}

	/**
	 * Create an instance of {@link TruncateSchemaResponse }
	 * 
	 */
	public TruncateSchemaResponse createTruncateSchemaResponse() {
		return new TruncateSchemaResponse();
	}

	/**
	 * Create an instance of {@link DgMaskerTask }
	 * 
	 */
	public DgMaskerTask createDgMaskerTask() {
		return new DgMaskerTask();
	}

	/**
	 * Create an instance of {@link GetDefaultLogContentResponse }
	 * 
	 */
	public GetDefaultLogContentResponse createGetDefaultLogContentResponse() {
		return new GetDefaultLogContentResponse();
	}

	/**
	 * Create an instance of {@link DgBaseBean }
	 * 
	 */
	public DgBaseBean createDgBaseBean() {
		return new DgBaseBean();
	}

	/**
	 * Create an instance of {@link DgMaskerColumn }
	 * 
	 */
	public DgMaskerColumn createDgMaskerColumn() {
		return new DgMaskerColumn();
	}

	/**
	 * Create an instance of {@link DgColumnInfo }
	 * 
	 */
	public DgColumnInfo createDgColumnInfo() {
		return new DgColumnInfo();
	}

	/**
	 * Create an instance of {@link TestConnectionResponse }
	 * 
	 */
	public TestConnectionResponse createTestConnectionResponse() {
		return new TestConnectionResponse();
	}

	/**
	 * Create an instance of {@link DgFaultInfo }
	 * 
	 */
	public DgFaultInfo createDgFaultInfo() {
		return new DgFaultInfo();
	}

	/**
	 * Create an instance of {@link MaskingOptions }
	 * 
	 */
	public MaskingOptions createMaskingOptions() {
		return new MaskingOptions();
	}

	/**
	 * Create an instance of {@link GetMaskingSummaryStatusResponse }
	 * 
	 */
	public GetMaskingSummaryStatusResponse createGetMaskingSummaryStatusResponse() {
		return new GetMaskingSummaryStatusResponse();
	}

	/**
	 * Create an instance of {@link CancelMasking }
	 * 
	 */
	public CancelMasking createCancelMasking() {
		return new CancelMasking();
	}

	/**
	 * Create an instance of {@link GetMaskingProgressStatus }
	 * 
	 */
	public GetMaskingProgressStatus createGetMaskingProgressStatus() {
		return new GetMaskingProgressStatus();
	}

	/**
	 * Create an instance of {@link GetReferences }
	 * 
	 */
	public GetReferences createGetReferences() {
		return new GetReferences();
	}

	/**
	 * Create an instance of {@link MaskerProgressStatus }
	 * 
	 */
	public MaskerProgressStatus createMaskerProgressStatus() {
		return new MaskerProgressStatus();
	}

	/**
	 * Create an instance of {@link LoadSynchData }
	 * 
	 */
	public LoadSynchData createLoadSynchData() {
		return new LoadSynchData();
	}

	/**
	 * Create an instance of {@link GetSampleRowResponse }
	 * 
	 */
	public GetSampleRowResponse createGetSampleRowResponse() {
		return new GetSampleRowResponse();
	}

	/**
	 * Create an instance of {@link GetMaskingProgressStatusResponse }
	 * 
	 */
	public GetMaskingProgressStatusResponse createGetMaskingProgressStatusResponse() {
		return new GetMaskingProgressStatusResponse();
	}

	/**
	 * Create an instance of {@link GetDefaultLogContent }
	 * 
	 */
	public GetDefaultLogContent createGetDefaultLogContent() {
		return new GetDefaultLogContent();
	}

	/**
	 * Create an instance of {@link DgConnection }
	 * 
	 */
	public DgConnection createDgConnection() {
		return new DgConnection();
	}

	/**
	 * Create an instance of {@link ClearDefaultLogContent }
	 * 
	 */
	public ClearDefaultLogContent createClearDefaultLogContent() {
		return new ClearDefaultLogContent();
	}

	/**
	 * Create an instance of {@link ClearDefaultLogContentResponse }
	 * 
	 */
	public ClearDefaultLogContentResponse createClearDefaultLogContentResponse() {
		return new ClearDefaultLogContentResponse();
	}

	/**
	 * Create an instance of {@link GetDatabases }
	 * 
	 */
	public GetDatabases createGetDatabases() {
		return new GetDatabases();
	}

	/**
	 * Create an instance of {@link GetReferencesResponse }
	 * 
	 */
	public GetReferencesResponse createGetReferencesResponse() {
		return new GetReferencesResponse();
	}

	/**
	 * Create an instance of {@link GetLogContentResponse }
	 * 
	 */
	public GetLogContentResponse createGetLogContentResponse() {
		return new GetLogContentResponse();
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDefaultLogContent }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getDefaultLogContent")
	public JAXBElement<GetDefaultLogContent> createGetDefaultLogContent(
			GetDefaultLogContent value) {
		return new JAXBElement<GetDefaultLogContent>(
				_GetDefaultLogContent_QNAME, GetDefaultLogContent.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ClearDefaultLogContent }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "clearDefaultLogContent")
	public JAXBElement<ClearDefaultLogContent> createClearDefaultLogContent(
			ClearDefaultLogContent value) {
		return new JAXBElement<ClearDefaultLogContent>(
				_ClearDefaultLogContent_QNAME, ClearDefaultLogContent.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetColumnsResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getColumnsResponse")
	public JAXBElement<GetColumnsResponse> createGetColumnsResponse(
			GetColumnsResponse value) {
		return new JAXBElement<GetColumnsResponse>(_GetColumnsResponse_QNAME,
				GetColumnsResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDatabasesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getDatabasesResponse")
	public JAXBElement<GetDatabasesResponse> createGetDatabasesResponse(
			GetDatabasesResponse value) {
		return new JAXBElement<GetDatabasesResponse>(
				_GetDatabasesResponse_QNAME, GetDatabasesResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link ClearLogContent }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "clearLogContent")
	public JAXBElement<ClearLogContent> createClearLogContent(
			ClearLogContent value) {
		return new JAXBElement<ClearLogContent>(_ClearLogContent_QNAME,
				ClearLogContent.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link StartDatabaseMaskingResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "startDatabaseMaskingResponse")
	public JAXBElement<StartDatabaseMaskingResponse> createStartDatabaseMaskingResponse(
			StartDatabaseMaskingResponse value) {
		return new JAXBElement<StartDatabaseMaskingResponse>(
				_StartDatabaseMaskingResponse_QNAME,
				StartDatabaseMaskingResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetSampleRowResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getSampleRowResponse")
	public JAXBElement<GetSampleRowResponse> createGetSampleRowResponse(
			GetSampleRowResponse value) {
		return new JAXBElement<GetSampleRowResponse>(
				_GetSampleRowResponse_QNAME, GetSampleRowResponse.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskingProgressStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getMaskingProgressStatusResponse")
	public JAXBElement<GetMaskingProgressStatusResponse> createGetMaskingProgressStatusResponse(
			GetMaskingProgressStatusResponse value) {
		return new JAXBElement<GetMaskingProgressStatusResponse>(
				_GetMaskingProgressStatusResponse_QNAME,
				GetMaskingProgressStatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetReferencesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getReferencesResponse")
	public JAXBElement<GetReferencesResponse> createGetReferencesResponse(
			GetReferencesResponse value) {
		return new JAXBElement<GetReferencesResponse>(
				_GetReferencesResponse_QNAME, GetReferencesResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetDefaultLogContentResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getDefaultLogContentResponse")
	public JAXBElement<GetDefaultLogContentResponse> createGetDefaultLogContentResponse(
			GetDefaultLogContentResponse value) {
		return new JAXBElement<GetDefaultLogContentResponse>(
				_GetDefaultLogContentResponse_QNAME,
				GetDefaultLogContentResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetLogContent }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getLogContent")
	public JAXBElement<GetLogContent> createGetLogContent(GetLogContent value) {
		return new JAXBElement<GetLogContent>(_GetLogContent_QNAME,
				GetLogContent.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link TestConnectionResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "testConnectionResponse")
	public JAXBElement<TestConnectionResponse> createTestConnectionResponse(
			TestConnectionResponse value) {
		return new JAXBElement<TestConnectionResponse>(
				_TestConnectionResponse_QNAME, TestConnectionResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetSampleRow }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getSampleRow")
	public JAXBElement<GetSampleRow> createGetSampleRow(GetSampleRow value) {
		return new JAXBElement<GetSampleRow>(_GetSampleRow_QNAME,
				GetSampleRow.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TestConnection }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "testConnection")
	public JAXBElement<TestConnection> createTestConnection(TestConnection value) {
		return new JAXBElement<TestConnection>(_TestConnection_QNAME,
				TestConnection.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetTablesResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getTablesResponse")
	public JAXBElement<GetTablesResponse> createGetTablesResponse(
			GetTablesResponse value) {
		return new JAXBElement<GetTablesResponse>(_GetTablesResponse_QNAME,
				GetTablesResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link LoadSynchData }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "loadSynchData")
	public JAXBElement<LoadSynchData> createLoadSynchData(LoadSynchData value) {
		return new JAXBElement<LoadSynchData>(_LoadSynchData_QNAME,
				LoadSynchData.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link TruncateSchemaResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "truncateSchemaResponse")
	public JAXBElement<TruncateSchemaResponse> createTruncateSchemaResponse(
			TruncateSchemaResponse value) {
		return new JAXBElement<TruncateSchemaResponse>(
				_TruncateSchemaResponse_QNAME, TruncateSchemaResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ClearDefaultLogContentResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "clearDefaultLogContentResponse")
	public JAXBElement<ClearDefaultLogContentResponse> createClearDefaultLogContentResponse(
			ClearDefaultLogContentResponse value) {
		return new JAXBElement<ClearDefaultLogContentResponse>(
				_ClearDefaultLogContentResponse_QNAME,
				ClearDefaultLogContentResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskingProgressStatus }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getMaskingProgressStatus")
	public JAXBElement<GetMaskingProgressStatus> createGetMaskingProgressStatus(
			GetMaskingProgressStatus value) {
		return new JAXBElement<GetMaskingProgressStatus>(
				_GetMaskingProgressStatus_QNAME,
				GetMaskingProgressStatus.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskingSummaryStatus }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getMaskingSummaryStatus")
	public JAXBElement<GetMaskingSummaryStatus> createGetMaskingSummaryStatus(
			GetMaskingSummaryStatus value) {
		return new JAXBElement<GetMaskingSummaryStatus>(
				_GetMaskingSummaryStatus_QNAME, GetMaskingSummaryStatus.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetDatabases }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getDatabases")
	public JAXBElement<GetDatabases> createGetDatabases(GetDatabases value) {
		return new JAXBElement<GetDatabases>(_GetDatabases_QNAME,
				GetDatabases.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link CancelMasking }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "cancelMasking")
	public JAXBElement<CancelMasking> createCancelMasking(CancelMasking value) {
		return new JAXBElement<CancelMasking>(_CancelMasking_QNAME,
				CancelMasking.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetLogContentResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getLogContentResponse")
	public JAXBElement<GetLogContentResponse> createGetLogContentResponse(
			GetLogContentResponse value) {
		return new JAXBElement<GetLogContentResponse>(
				_GetLogContentResponse_QNAME, GetLogContentResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetReferences }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getReferences")
	public JAXBElement<GetReferences> createGetReferences(GetReferences value) {
		return new JAXBElement<GetReferences>(_GetReferences_QNAME,
				GetReferences.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link CancelMaskingResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "cancelMaskingResponse")
	public JAXBElement<CancelMaskingResponse> createCancelMaskingResponse(
			CancelMaskingResponse value) {
		return new JAXBElement<CancelMaskingResponse>(
				_CancelMaskingResponse_QNAME, CancelMaskingResponse.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link LoadSynchDataResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "loadSynchDataResponse")
	public JAXBElement<LoadSynchDataResponse> createLoadSynchDataResponse(
			LoadSynchDataResponse value) {
		return new JAXBElement<LoadSynchDataResponse>(
				_LoadSynchDataResponse_QNAME, LoadSynchDataResponse.class,
				null, value);
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
	 * {@link StartDatabaseMasking }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "startDatabaseMasking")
	public JAXBElement<StartDatabaseMasking> createStartDatabaseMasking(
			StartDatabaseMasking value) {
		return new JAXBElement<StartDatabaseMasking>(
				_StartDatabaseMasking_QNAME, StartDatabaseMasking.class, null,
				value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetColumns }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getColumns")
	public JAXBElement<GetColumns> createGetColumns(GetColumns value) {
		return new JAXBElement<GetColumns>(_GetColumns_QNAME, GetColumns.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link GetMaskingSummaryStatusResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getMaskingSummaryStatusResponse")
	public JAXBElement<GetMaskingSummaryStatusResponse> createGetMaskingSummaryStatusResponse(
			GetMaskingSummaryStatusResponse value) {
		return new JAXBElement<GetMaskingSummaryStatusResponse>(
				_GetMaskingSummaryStatusResponse_QNAME,
				GetMaskingSummaryStatusResponse.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link TruncateSchema }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "truncateSchema")
	public JAXBElement<TruncateSchema> createTruncateSchema(TruncateSchema value) {
		return new JAXBElement<TruncateSchema>(_TruncateSchema_QNAME,
				TruncateSchema.class, null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}{@link GetTables }
	 * {@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "getTables")
	public JAXBElement<GetTables> createGetTables(GetTables value) {
		return new JAXBElement<GetTables>(_GetTables_QNAME, GetTables.class,
				null, value);
	}

	/**
	 * Create an instance of {@link JAXBElement }{@code <}
	 * {@link ClearLogContentResponse }{@code >}
	 * 
	 */
	@XmlElementDecl(namespace = "http://MaskerAgent.webservices.dataguise.com/", name = "clearLogContentResponse")
	public JAXBElement<ClearLogContentResponse> createClearLogContentResponse(
			ClearLogContentResponse value) {
		return new JAXBElement<ClearLogContentResponse>(
				_ClearLogContentResponse_QNAME, ClearLogContentResponse.class,
				null, value);
	}

}
