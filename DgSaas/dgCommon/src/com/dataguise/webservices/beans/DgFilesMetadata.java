package com.dataguise.webservices.beans;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * File's task metadata
 * @author dataguise
 *
 */
@XmlRootElement
public class DgFilesMetadata {

	protected Integer taskInstanceId;
	protected Integer latestLeafTraversed = 0;
    protected Set<Integer> runningLeaves;
    protected Integer connectionId;
    

	public DgFilesMetadata() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public DgFilesMetadata(Integer latestLeafTraversed, Set<Integer> runningLeaves) {
		super();
		this.latestLeafTraversed = latestLeafTraversed;
		this.runningLeaves = runningLeaves;
	}

	public Integer getLatestLeafTraversed() {
		return latestLeafTraversed;
	}
	public void setLatestLeafTraversed(Integer latestLeafTraversed) {
		this.latestLeafTraversed = latestLeafTraversed;
	}

	public void setRunningLeaves(Set<Integer> runningLeaves) {
		this.runningLeaves = runningLeaves;
	}

	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}
	
	public Set<Integer> getRunningLeaves() {
		if(runningLeaves==null)
			runningLeaves = new HashSet<Integer>();
		return runningLeaves;
	}
	
	public Integer incrementLatestLeafTraversed(){
		return ++latestLeafTraversed;
	}

	public Integer getConnectionId() {
		return connectionId;
	}

	public void setConnectionId(Integer connectionId) {
		this.connectionId = connectionId;
	}
	
}
