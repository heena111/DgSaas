/**
 * Bean for DgHadoopTaskInfo passed to DiscoverHadoopMainResultsBean.
 */
package com.dataguise.common.beans;

/**
 * @author
 * 
 */
public class DgHadoopTaskInfoBean {
	private Integer taskInstanceId;
	private Integer hadoopJobId;
	private Integer totalFilesSearched;
	private String jobStartInfo;
	private String jtIdentifier;
	private String hadoopUser;

	/**
	 * @return the hadoopJobId
	 */
	public Integer getHadoopJobId() {
		return hadoopJobId;
	}

	/**
	 * @return the hadoopUser
	 */
	public String getHadoopUser() {
		return hadoopUser;
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
	 * @return the taskInstanceId
	 */
	public Integer getTaskInstanceId() {
		return taskInstanceId;
	}

	/**
	 * @return the totalFilesSearched
	 */
	public Integer getTotalFilesSearched() {
		return totalFilesSearched;
	}

	/**
	 * @param hadoopJobId
	 *            the hadoopJobId to set
	 */
	public void setHadoopJobId(Integer hadoopJobId) {
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
	 * @param taskInstanceId
	 *            the taskInstanceId to set
	 */
	public void setTaskInstanceId(Integer taskInstanceId) {
		this.taskInstanceId = taskInstanceId;
	}

	/**
	 * @param totalFilesSearched
	 *            the totalFilesSearched to set
	 */
	public void setTotalFilesSearched(Integer totalFilesSearched) {
		this.totalFilesSearched = totalFilesSearched;
	}

}
