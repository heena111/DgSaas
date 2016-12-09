package com.dataguise.saas.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

/**
 * DgUsers entity.
 */
@Entity
@Table(name = "dg_saas_users")
public class DgSaasUsers implements java.io.Serializable {

	// Fields

	/**
	 * 
	 */
	private static final long serialVersionUID = 2840058390105394922L;
	private Integer id;
	private String nameTitle;
	private String firstName;
	private String middleName;
	private String lastName;
	private String companyName;
	private String companyAddress;
	private String emailAddress;
	private String positionTitle;
	private String phoneNumber;
	private String userName;
	private String loginPassword;
	private Boolean active;
	private Timestamp createts;
	private Timestamp updatets;

	// Constructors

	/** default constructor */
	public DgSaasUsers() {
	}

	/** minimal constructor */
	public DgSaasUsers(Integer id, String firstName, String emailAddress, Timestamp createts, Timestamp updatets) {
		this.id = id;
		this.firstName = firstName;
		this.emailAddress=emailAddress;
		this.createts = createts;
		this.updatets = updatets;
	}


	@Id 
	@Column(name="id",  nullable=false)
	@TableGenerator(name="table_gen", table="dg_sequence_gen", pkColumnName="seq_col_name",
	valueColumnName="seq_col_value", pkColumnValue="dg_saas_users", allocationSize=1)
	@GeneratedValue(strategy=GenerationType.TABLE, generator="table_gen")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(name = "name_prefix", unique = false, length = 10)
	public String getNameTitle() {
		return nameTitle;
	}

	public void setNameTitle(String nameTitle) {
		this.nameTitle = nameTitle;
	}
	
	@Column(name = "first_name", nullable = false, length = 100)
	public String getFirstName() {
		return this.firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	@Column(name = "middle_name", length = 100)
	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	@Column(name = "last_name", length = 100)
	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	@Column(name = "company_name", nullable = false, length = 100)
	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	@Column(name = "company_address", length = 500)
	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	@Column(name = "email_address", length = 256)
	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	@Column(name = "position_title", length = 100)
	public String getPositionTitle() {
		return positionTitle;
	}

	public void setPositionTitle(String positionTitle) {
		this.positionTitle = positionTitle;
	}
	
	@Column(name = "phone_number", length = 20)
	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Column(name = "user_name", unique = false, nullable = false, length = 256)
	public String getUsername() {
		return this.userName;
	}

	public void setUsername(String userName) {
		this.userName = userName;
	}
	
	@Column(name = "login_password", length = 100)
	public String getLoginPassword() {
		return loginPassword;
	}

	public void setLoginPassword(String loginPassword) {
		this.loginPassword = loginPassword;
	}
	
	@Column(name = "active", nullable = false)
	public Boolean getActive() {
		return this.active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	@Column(name = "createts", nullable = false, length = 19)
	public Timestamp getCreatets() {
		return this.createts;
	}

	public void setCreatets(Timestamp createts) {
		this.createts = createts;
	}

	@Column(name = "updatets", nullable = false, length = 19)
	public Timestamp getUpdatets() {
		return this.updatets;
	}

	public void setUpdatets(Timestamp updatets) {
		this.updatets = updatets;
	}

}