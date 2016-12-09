package com.dataguise.ldap;


public class LdapGroupStruct {
	
	
	public LdapGroupStruct(String cn, String dnString) {
		super();
		this.cn = cn;
		this.dnString = dnString;
	}
	private String cn;
 
	private String dnString;
	public String getDnString() {
		return dnString;
	}
	public void setDnString(String dnString) {
		this.dnString = dnString;
	}
	 
	 
	public String getCn() {
		return cn;
	}
	public void setCn(String cn) {
		this.cn = cn;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cn == null) ? 0 : cn.hashCode());
		result = prime * result
				+ ((dnString == null) ? 0 : dnString.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		LdapGroupStruct other = (LdapGroupStruct) obj;
		if (cn == null) {
			if (other.cn != null)
				return false;
		} else if (!cn.equals(other.cn))
			return false;
		if (dnString == null) {
			if (other.dnString != null)
				return false;
		} else if (!dnString.equals(other.dnString))
			return false;
		return true;
	}
	 
}
