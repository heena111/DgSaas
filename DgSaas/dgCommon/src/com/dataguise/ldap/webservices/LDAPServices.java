package com.dataguise.ldap.webservices;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.log4j.Logger;

import com.dataguise.ldap.beans.LDAPConnectionParams;
import com.dataguise.webservices.beans.UserGroupInfoBean;
import com.google.gson.Gson;

/**
 * LDAP web-service class.
 * <p>
 * This will contain all methods for getting data from LDAP
 * @author Harmin
 *
 */

@Path("/services")
public class LDAPServices {

	
	static Logger log = Logger.getLogger(LDAPServices.class.getName());
	
	
	//Gets the List of groups and the users in those groups from LDAP.
	@GET
	@Path("getUserGroupInfo")
	@Produces("application/json")
	public Response getUserGroupInfo(@QueryParam("json") String json){
		List<UserGroupInfoBean> userGroupInfoBeanList = null;
		try {
			LDAPConnectionParams connectionParams=new Gson().fromJson(json, LDAPConnectionParams.class);			
			userGroupInfoBeanList = null;
		} catch (Exception e) {			
			log.error(e.getMessage());
			return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(new Gson().toJson(e)).build();			
		}				
		String result = new Gson().toJson(userGroupInfoBeanList);
		return Response.ok(result).build(); 
	}
}
