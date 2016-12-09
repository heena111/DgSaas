/**
 * 
 */
package com.dataguise.webservices.beans;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;

/**
 * @author Jaspaul
 *
 */
public class DgUITaskInstance extends DgBaseBean{
	protected Integer taskInstanceID;
	protected String taskName;
	protected String startTime ;
	protected String endTime;
	protected String status ;
	protected Integer totalTables ;
	protected Integer totalProcessedTables ;
	protected Integer taskId;
	protected String taskDefType;
	protected boolean showHadoopSampleData;
	protected String taskType;
	protected String hadoopUser;
	protected String executedBy;
	protected String isGlobal;
	protected String globalDomain;
	protected String connectionType;
	protected String logMsg;
	protected String clusterName;
	protected Boolean skippedFlag;
	protected String dbBeingScanned;
	protected String fileModStartTime;
    protected String fileModEndTime;
    protected Boolean isResumeEnable;

	public String getConnectionType() {
		return connectionType;
	}

	public void setConnectionType(String connectionType) {
		this.connectionType = connectionType;
	}

	public String getHadoopUser() {
		return hadoopUser;
	}

	public void setHadoopUser(String hadoopUser) {
		this.hadoopUser = hadoopUser;
	}

	public String getExecutedBy() {
		return executedBy;
	}

	public void setExecutedBy(String executedBy) {
		this.executedBy = executedBy;
	}

	public boolean isShowHadoopSampleData() {
		return showHadoopSampleData;
	}

	public void setShowHadoopSampleData(boolean showHadoopSampleData) {
		this.showHadoopSampleData = showHadoopSampleData;
	}

	/**
	 * @return the taskId
	 */
	public Integer getTaskId() {
		return taskId;
	}

	/**
	 * @param taskId the taskId to set
	 */
	public void setTaskId(Integer taskId) {
		this.taskId = taskId;
	}

	public Integer getTaskInstanceID() {
		return taskInstanceID;
	}
	
	public void setTaskInstanceID(Integer taskInstanceID) {
		this.taskInstanceID = taskInstanceID;
	}
	
	public String getTaskName() {
		return taskName;
	}
	
	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}
	
	public String getStartTime() {
		return startTime;
	}
	
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	
	public String getEndTime() {
		return endTime;
	}
	
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	
	public String getStatus() {
		return status;
	}
	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public String getTaskDefType() {
		return taskDefType;
	}
	
	public void setTaskDefType(String taskDefType) {
		this.taskDefType = taskDefType;
	}
	public Integer getTotalTables() {
		return totalTables;
	}
	
	public void setTotalTables(Integer totalTables) {
		this.totalTables = totalTables;
	}
	public Integer getTotalProcessedTables() {
		return totalProcessedTables;
	}
	
	public void setTotalProcessedTables(Integer totalProcessedTables) {
		this.totalProcessedTables = totalProcessedTables;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}
	
	  public String getIsGlobal() {
		return isGlobal;
	}

	public void setIsGlobal(String isGlobal) {
		this.isGlobal = isGlobal;
	}

	public String getGlobalDomain() {
		return globalDomain;
	}

	public void setGlobalDomain(String globalDomain) {
		this.globalDomain = globalDomain;
	}



	public Boolean getSkippedFlag() {
		return skippedFlag;
	}

	public void setSkippedFlag(Boolean skippedFlag) {
		this.skippedFlag = skippedFlag;
	}
	
	public String getDbBeingScanned() {
				return dbBeingScanned;
	}
		
	public void setDbBeingScanned(String dbBeingScanned) {
			this.dbBeingScanned = dbBeingScanned;
	}


	public static Comparator<DgUITaskInstance> SORT_BY_TASKINSID = new Comparator<DgUITaskInstance>() {
	        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
	            return one.taskInstanceID.compareTo(other.taskInstanceID);
	        }
	    };
	   
	    public static Comparator<DgUITaskInstance> SORT_BY_TASKNAME = new Comparator<DgUITaskInstance>() {
	        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
	            return one.taskName.compareToIgnoreCase(other.taskName);
	        }
	    };
	    
	 
	    public static Comparator<DgUITaskInstance> SORT_BY_CLUSTERNAME = new Comparator<DgUITaskInstance>() {
	        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
	            return one.clusterName.compareToIgnoreCase(other.clusterName);
	        }
	    };
	    
		public static Comparator<DgUITaskInstance> SORT_BY_STARTTIME = new Comparator<DgUITaskInstance>() {
			  @Override
			  public int compare(DgUITaskInstance o1, DgUITaskInstance o2) {
			   Timestamp fromTS1=null;
			   Timestamp fromTS2 =null;
			   try {
			    SimpleDateFormat monthDayformatter = new SimpleDateFormat(
			    "MMM-dd-yyyy HH:mm");   
			    Date fromDate1 = monthDayformatter.parse(o1.getStartTime());

			    fromTS1 = new Timestamp(fromDate1.getTime());

			    Date fromDate2 = monthDayformatter.parse(o2.getStartTime());

			    fromTS2 = new Timestamp(fromDate2.getTime());
			   } catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			    throw new NullPointerException(e.getMessage());
			   } 
			   return fromTS1.compareTo(fromTS2);
			  }
			
		};
		
		
		public static Comparator<DgUITaskInstance> SORT_BY_ENDTIME = new Comparator<DgUITaskInstance>() {
			  @Override
			  public int compare(DgUITaskInstance o1, DgUITaskInstance o2) {
			   Timestamp fromTS1=null;
			   Timestamp fromTS2 =null;
			   try {
			    SimpleDateFormat monthDayformatter = new SimpleDateFormat(
			    "MMM-dd-yyyy HH:mm");   
			    Date fromDate1 = monthDayformatter.parse(o1.getEndTime());

			    fromTS1 = new Timestamp(fromDate1.getTime());

			    Date fromDate2 = monthDayformatter.parse(o2.getEndTime());

			    fromTS2 = new Timestamp(fromDate2.getTime());
			   } catch (Exception e) {
			    // TODO Auto-generated catch block
			    e.printStackTrace();
			    throw new NullPointerException(e.getMessage());
			   } 
			   return fromTS1.compareTo(fromTS2);
			  }
		};
		
		 public static Comparator<DgUITaskInstance> SORT_BY_STATUS = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return one.status.compareToIgnoreCase(other.status);
		        }
		    };
		    
		    
		    public static Comparator<DgUITaskInstance> SORT_BY_TTBLS = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return one.totalTables.compareTo(other.totalTables);
		        }
			};
			
			
			public static Comparator<DgUITaskInstance> SORT_BY_TPT = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return one.totalProcessedTables.compareTo(other.totalProcessedTables);
		        }
			};
	    
	    
	    
		public static Comparator<DgUITaskInstance> SORT_BY_TASKID = new Comparator<DgUITaskInstance>() {
	        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
	            return one.taskId.compareTo(other.taskId);
	        }
		};

		
		 public static Comparator<DgUITaskInstance> SORT_BY_TASKTYPE = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return one.taskType.compareToIgnoreCase(other.taskType);
		        }
		    };

		
		    public static Comparator<DgUITaskInstance> SORT_BY_TASKINSID_DESC = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return other.taskInstanceID.compareTo(one.taskInstanceID);
		        }
		    };
		   
		    public static Comparator<DgUITaskInstance> SORT_BY_TASKNAME_DESC = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return other.taskName.compareToIgnoreCase(one.taskName);
		        }
		    };
		    
		 
		    
			public static Comparator<DgUITaskInstance> SORT_BY_STARTTIME_DESC = new Comparator<DgUITaskInstance>() {
				  @Override
				  public int compare(DgUITaskInstance o1, DgUITaskInstance o2) {
				   Timestamp fromTS1=null;
				   Timestamp fromTS2 =null;
				   try {
				    SimpleDateFormat monthDayformatter = new SimpleDateFormat(
				    "MMM-dd-yyyy HH:mm");   
				    Date fromDate1 = monthDayformatter.parse(o1.getStartTime());

				    fromTS1 = new Timestamp(fromDate1.getTime());

				    Date fromDate2 = monthDayformatter.parse(o2.getStartTime());

				    fromTS2 = new Timestamp(fromDate2.getTime());
				   } catch (Exception e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				    throw new NullPointerException(e.getMessage());
				   } 
				   return fromTS2.compareTo(fromTS1);
				  }
				
			};
			
			
			public static Comparator<DgUITaskInstance> SORT_BY_ENDTIME_DESC = new Comparator<DgUITaskInstance>() {
				  @Override
				  public int compare(DgUITaskInstance o1, DgUITaskInstance o2) {
				   Timestamp fromTS1=null;
				   Timestamp fromTS2 =null;
				   try {
				    SimpleDateFormat monthDayformatter = new SimpleDateFormat(
				    "MMM-dd-yyyy HH:mm");   
				    Date fromDate1 = monthDayformatter.parse(o1.getEndTime());

				    fromTS1 = new Timestamp(fromDate1.getTime());

				    Date fromDate2 = monthDayformatter.parse(o2.getEndTime());

				    fromTS2 = new Timestamp(fromDate2.getTime());
				   } catch (Exception e) {
				    // TODO Auto-generated catch block
				    e.printStackTrace();
				    throw new NullPointerException(e.getMessage());
				   } 
				   return fromTS2.compareTo(fromTS1);
				  }
			};
			
			 public static Comparator<DgUITaskInstance> SORT_BY_STATUS_DESC = new Comparator<DgUITaskInstance>() {
			        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
			            return other.status.compareToIgnoreCase(one.status);
			        }
			    };
			    
			    
			    public static Comparator<DgUITaskInstance> SORT_BY_TTBLS_DESC = new Comparator<DgUITaskInstance>() {
			        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
			            return other.totalTables.compareTo(one.totalTables);
			        }
				};
				
				
				public static Comparator<DgUITaskInstance> SORT_BY_TPT_DESC = new Comparator<DgUITaskInstance>() {
			        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
			            return other.totalProcessedTables.compareTo(one.totalProcessedTables);
			        }
				};
		    
		    
		    
			public static Comparator<DgUITaskInstance> SORT_BY_TASKID_DESC = new Comparator<DgUITaskInstance>() {
		        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
		            return other.taskId.compareTo(one.taskId);
		        }
			};

			
			 public static Comparator<DgUITaskInstance> SORT_BY_TASKTYPE_DESC = new Comparator<DgUITaskInstance>() {
			        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
			            return other.taskType.compareToIgnoreCase(one.taskType);
			        }
			    
			 };
			 
			 public static Comparator<DgUITaskInstance> SORT_BY_CLUSTERNAME_DESC = new Comparator<DgUITaskInstance>() {
			        public int compare(DgUITaskInstance one, DgUITaskInstance other) {
			            return other.clusterName.compareToIgnoreCase(one.clusterName);
			        }
			    
			 };
			 

				public void setLogMsg(String logMsg) {
					this.logMsg = logMsg;
				}

				public String getLogMsg() {
					return logMsg;
				}

				public String getClusterName() {
					return clusterName;
				}

				public void setClusterName(String clusterName) {
					this.clusterName = clusterName;
				}

				public String getFileModStartTime() {
					return fileModStartTime;
				}

				public void setFileModStartTime(String fileModStartTime) {
					this.fileModStartTime = fileModStartTime;
				}

				public String getFileModEndTime() {
					return fileModEndTime;
				}

				public void setFileModEndTime(String fileModEndTime) {
					this.fileModEndTime = fileModEndTime;
				}

				public Boolean getIsResumeEnable() {
					return isResumeEnable;
				}

				public void setIsResumeEnable(Boolean isResumeEnable) {
					this.isResumeEnable = isResumeEnable;
				}
				
				
				
}


