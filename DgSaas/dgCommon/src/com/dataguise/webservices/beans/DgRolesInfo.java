
package com.dataguise.webservices.beans;


public class DgRolesInfo {

    protected String roleName;
    protected Integer roleId;
   
    /**
     * Gets the value of the roleName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoleName() {
        return roleName;
    }

    /**
     * Sets the value of the roleName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }
    
    public Integer getRoleId() {
        return roleId;
    }
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

   

}
