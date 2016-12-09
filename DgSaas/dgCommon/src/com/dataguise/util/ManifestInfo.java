package com.dataguise.util;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.jar.Attributes;
import java.util.jar.Manifest;

import org.apache.log4j.Logger;

import com.dataguise.webservices.beans.DgException;

public class ManifestInfo {

	Logger logger = Logger.getLogger(ManifestInfo.class);
	private final Class<?> clazz;
	private final InputStream inputStream;
	private Manifest manifest ;

	public ManifestInfo() throws MalformedURLException, IOException {
		clazz = this.getClass();
		inputStream = getManifestURL().openStream();
		manifest = new Manifest(inputStream);
	}

	public ManifestInfo(Class<?> clazz) throws MalformedURLException, IOException {
		this.clazz = clazz;
		inputStream = getManifestURL().openStream();
		manifest = new Manifest(inputStream);
	}
	public ManifestInfo(String manifestPath) throws MalformedURLException, IOException {
		clazz=null;			
		inputStream =  new URL(manifestPath).openStream();
		manifest = new Manifest(inputStream);
	}

	/**
	 * Retrieves and returns all the main attributes in the manifest file
	 * 
	 * @return
	 * @throws MalformedURLException 
	 * @throws IOException
	 */
	private Attributes getAllManifestAttributes() throws MalformedURLException, IOException  {
		Attributes manifestAttributes = manifest.getMainAttributes();

		return manifestAttributes;
	}
	
	/**
	 * Retrieves and returns all the entries in the manifest file
	 * 
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 */
	private Map<String, Attributes> getAllManifestEntries() throws MalformedURLException, IOException  {
		Map<String, Attributes> manifestAttributes = manifest.getEntries();

		return manifestAttributes;
	}

	/**
	 * Returns the location of the manifest file
	 * 
	 * @return
	 * @throws MalformedURLException
	 */
	private URL getManifestURL() throws MalformedURLException {
		String deploymentLocation = DeploymentPathUtil.getDeploymentLocation(clazz);
		URL manifestURL = new URL(deploymentLocation + "/META-INF/MANIFEST.MF");
		logger.debug("Manifest location is - " + deploymentLocation + "/META-INF/MANIFEST.MF");

		return manifestURL;
	}
	
	/**
	 * Retrieves and returns the value of a main attribute from the manifest file
	 * 
	 * @param attribute
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws DgException
	 */
	public String getManifestAttribute(String attribute) throws MalformedURLException, IOException, IllegalArgumentException {
		String value = getAllManifestAttributes().getValue(attribute);
		if (value == null) {
			throw new IllegalArgumentException("Attribute not found in Manifest. ");
		}
		return value;
	}
	
	/**
	 * Retrieves and returns the value of an entry attribute from the manifest file
	 * 
	 * @param entryName
	 * @param attribute
	 * @return
	 * @throws MalformedURLException
	 * @throws IOException
	 * @throws DgException
	 */
	public String getManifestEntryAttribute(String entryName, String attribute) throws MalformedURLException, IOException, NullPointerException, IllegalArgumentException  {
		Attributes entryAttributes = getAllManifestEntries().get(entryName);
		if (entryAttributes == null)
			throw new NullPointerException("Group name not found in Manifest. ");
		String value = entryAttributes.getValue(attribute);
		if (value == null)
			throw new IllegalArgumentException("Attribute not found in Manifest. ");
		return value;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		try {
			Iterator<Entry<Object, Object>> mainIterator = getAllManifestAttributes().entrySet().iterator();
			while (mainIterator.hasNext()) {
				Entry<Object, Object> mainPair = mainIterator.next();
				sb.append(mainPair.getKey().toString()).append(" : ").append(mainPair.getValue().toString());
				sb.append("\n");
			}
			sb.append("\n");
			Iterator<Entry<String, Attributes>> entryIterator = getAllManifestEntries().entrySet().iterator();
			while (entryIterator.hasNext()) {
				Entry<String, Attributes> entryPair = entryIterator.next();
				sb.append("Name : ").append(entryPair.getKey()).append("\n");
				Iterator<Entry<Object, Object>> entryValueIterator = entryPair.getValue().entrySet().iterator();
				while (entryValueIterator.hasNext()) {
					Entry<Object, Object> entryValuePair = entryValueIterator.next();
					sb.append(entryValuePair.getKey().toString()).append(" : ").append(entryValuePair.getValue().toString());
					sb.append("\n");
				}
			}			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();
	}

}
