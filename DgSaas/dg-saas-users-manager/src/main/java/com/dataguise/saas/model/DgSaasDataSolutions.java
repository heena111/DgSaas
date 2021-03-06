package com.dataguise.saas.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DgSaasDataSolutions generated by hbm2java
 */
@Entity
@Table(name = "dg_saas_data_solutions")
public class DgSaasDataSolutions implements java.io.Serializable {

	private int id;
	private String dataSolution;

	public DgSaasDataSolutions() {
	}

	public DgSaasDataSolutions(int id, String dataSolution) {
		this.id = id;
		this.dataSolution = dataSolution;
	}

	@Id
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Column(name = "data_solution", nullable = false, length = 100)
	public String getDataSolution() {
		return this.dataSolution;
	}

	public void setDataSolution(String dataSolution) {
		this.dataSolution = dataSolution;
	}

}
