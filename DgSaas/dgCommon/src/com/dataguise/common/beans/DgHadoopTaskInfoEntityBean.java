/**
 * This is a bean for DgHadoopTaskInfo entity
 */
package com.dataguise.common.beans;

import java.sql.Timestamp;

/**
 * @author
 * 
 */
public class DgHadoopTaskInfoEntityBean {
	private Integer id;
	private Integer taskInstanceId;
	private String hadoopJobId;
	private long endProcessTime;
	private String jobStartInfo;
	private String jtIdentifier;
	private String hadoopUser;
	private Timestamp taskCreatets;
	private Timestamp taskUpdatets;
	private Integer totalFiles;

	/**
	 * @return the endProcessTime
	 */
	public long getEndProcessTime() {
		return endProcessTime;
	}

	/**
	 * @return the hadoopJobId
	 */
	public String getHadoopJobId() {
		return hadoopJobId;
	}

	/**
	 * @return the hadoopUser
	 */
	public String getHadoopUser() {
		return hadoopUser;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @return the jobStartInfo
	 */
	public String getJobStartInfo() {
		return jobStartInfo;
	}

	/**
	 * @return the jtIdentifier
	 */
	public String getJtIdentifier() {
		return jtIdentifier;
	}

	/**
	 * @return the taskCreatets
	 */
	public Timestamp getTaskCreatets() {
		return taskCreatets;
	}

	/**
	 * @return the taskInstanceId
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	/**
	 * @return the taskUpdatets
	 */
	public Timestamp getTaskUpdatets() {
		return taskUpdatets;
	}

	/**
	 * @param endProcessTime
	 *            the endProcessTime to set
	 */
	public void setEndProcessTime(long endProcessTime) {
		this.endProcessTime = endProcessTime;
	}

	/**
	 * @param hadoopJobId
	 *            the hadoopJobId to set
	 */
	public void setHadoopJobId(String hadoopJobId) {
		this.hadoopJobId = hadoopJobId;
	}

	/**
	 * @param hadoopUser
	 *            the hadoopUser to set
	 */
	public void setHadoopUser(String hadoopUser) {
		this.hadoopUser = hadoopUser;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * @param jobStartInfo
	 *            the jobStartInfo to set
	 */
	public void setJobStartInfo(String jobStartInfo) {
		this.jobStartInfo = jobStartInfo;
	}

	/**
	 * @param jtIdentifier
	 *            the jtIdentifier to set
	 */
	public void setJtIdentifier(String jtIdentifier) {
		this.jtIdentifier = jtIdentifier;
	}

	/**
	 * @param taskCreatets
	 *            the taskCreatets to set
	 */
	public void setTaskCreatets(Timestamp taskCreatets) {
		this.taskCreatets = taskCreatets;
	}

	/**
	 * @param taskInstanceId
	 *            the taskInstanceId to set
	 */
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	/**
	 * @param taskUpdatets
	 *            the taskUpdatets to set
	 */
	public void setTaskUpdatets(Timestamp taskUpdatets) {
		this.taskUpdatets = taskUpdatets;
	}

	public Integer getTotalFiles() {
		return totalFiles;
	}

	public void setTotalFiles(Integer totalFiles) {
		this.totalFiles = totalFiles;
	}

}
