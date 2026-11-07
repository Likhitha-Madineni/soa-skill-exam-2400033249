package com.klef.soa.entity;

import java.time.LocalDateTime;


import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="clinic_table")

public class Clinic {
	  
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long clinicId;
	@Column(length=100,nullable=false)
	private String name;
	@Column(nullable=false)
	private String type;
	@Column(nullable=false)
	private boolean status;
	@Column(nullable=false)
	private String location;
	@CreationTimestamp
	private LocalDateTime createdAt;
@UpdateTimestamp
	private LocalDateTime updatedAt;
	public long getClinicId() {
		return clinicId;
	}
	public void setClinicId(long clinicId) {
		this.clinicId = clinicId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public LocalDateTime getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}
	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}
	@Override
	public String toString() {
		return "Clinic [clinicId=" + clinicId + ", name=" + name + ", type=" + type + ", status=" + status
				+ ", location=" + location + ", createdAt=" + createdAt + ", updatedAt=" + updatedAt + "]";
	}
}