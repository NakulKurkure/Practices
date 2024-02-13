package com.example.crud.entity;

import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user_entity")
public class UserEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private Long id;
	
	@Column(name="email")
	private String email;
	
	@Column(name="name")
	private String name;
	
	public UserEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public UserEntity(Long id, String email, String name, String password, Date created_by, Date updated_by,
			boolean isActive) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.password = password;
		this.created_by = created_by;
		this.updated_by = updated_by;
		this.isActive = isActive;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreated_by() {
		return created_by;
	}

	public void setCreated_by(Date created_by) {
		this.created_by = created_by;
	}

	public Date getUpdated_by() {
		return updated_by;
	}

	public void setUpdated_by(Date updated_by) {
		this.updated_by = updated_by;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Column(name="password")
	private String password;
	
	@CreationTimestamp
	@Column(name="created_by")
	private Date created_by;
	
	@UpdateTimestamp
	@Column(name="updated_by")
	private Date updated_by;
	
	@Column(name="is_active")
	private boolean isActive=true;
	
	
}
