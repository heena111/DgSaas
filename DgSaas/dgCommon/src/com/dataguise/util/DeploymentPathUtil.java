package com.dataguise.util;

public class DeploymentPathUtil {

	/**
	 * Returns the deployment location of the class
	 * 
	 * @param clazz
	 * @return
	 */
	public static String getDeploymentLocation (Class<?> clazz) {
		// Convert the class package hierarchy to a path format
		String resourcePath = "/" + clazz.getName().replace(".", "/") + ".class";
		// Look up the class's resource(here, .class file) on application server to get the full path 
		String rootPath = clazz.getResource(resourcePath).toString();
		// Compute the deployment location by removing the resource path from root path
		String deploymentLocation = rootPath.substring(0, rootPath.length() - resourcePath.length());
		
		if (deploymentLocation.endsWith("\\WEB-INF\\classes") || deploymentLocation.endsWith("/WEB-INF/classes")) {
			// In case of WAR, we need to remove /WEB-INF/classes from the path to get the deployment location
			deploymentLocation = deploymentLocation.substring(0, deploymentLocation.length() - "/WEB-INF/classes".length());
		}
		
		return deploymentLocation;
	}
}
