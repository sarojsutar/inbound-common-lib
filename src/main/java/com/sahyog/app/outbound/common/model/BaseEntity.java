package com.sahyog.app.outbound.common.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {

	@CreatedDate
	@Column(name = "CREATED_DATE")
	private Timestamp createdDate;

	@LastModifiedDate
	@Column(name = "UPDATED_DATE")
	private Timestamp updatedDate;

	@CreatedBy
	@Column(name = "CREATED_BY_USER")
	private String createdByUser;

	@Column(name = "CREATED_BY_SERVICE")
	private String createdByService;

	@LastModifiedBy
	@Column(name = "UPDATED_BY_USER")
	private String updatedByUser;

	@Column(name = "UPDATED_BY_SERVICE")
	private String updatedByService;

	public Timestamp getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Timestamp createdDate) {
		this.createdDate = createdDate;
	}

	public Timestamp getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Timestamp updatedDate) {
		this.updatedDate = updatedDate;
	}

	public String getCreatedByUser() {
		return createdByUser;
	}

	public void setCreatedByUser(String createdByUser) {
		this.createdByUser = createdByUser;
	}

	public String getCreatedByService() {
		return createdByService;
	}

	public void setCreatedByService(String createdByService) {
		this.createdByService = createdByService;
	}

	public String getUpdatedByUser() {
		return updatedByUser;
	}

	public void setUpdatedByUser(String updatedByUser) {
		this.updatedByUser = updatedByUser;
	}

	public String getUpdatedByService() {
		return updatedByService;
	}

	public void setUpdatedByService(String updatedByService) {
		this.updatedByService = updatedByService;
	}

}
