package com.dataguise.ha.beans;

import com.dataguise.webservices.beans.HadoopStatusInfoBean;



/**
 * @author Harinder Singh Bedi
 *
 */
public class TaskControllerMetadata {
	
	private HadoopStatusInfoBean hadoopStatusInfoBean=new HadoopStatusInfoBean();

	/**
	 * @return the hadoopStatusInfoBean
	 */
	public HadoopStatusInfoBean getHadoopStatusInfoBean() {
		return hadoopStatusInfoBean;
	}

	/**
	 * @param hadoopStatusInfoBean the hadoopStatusInfoBean to set
	 */
	public void setHadoopStatusInfoBean(HadoopStatusInfoBean hadoopStatusInfoBean) {
		this.hadoopStatusInfoBean = hadoopStatusInfoBean;
	}
	

}
