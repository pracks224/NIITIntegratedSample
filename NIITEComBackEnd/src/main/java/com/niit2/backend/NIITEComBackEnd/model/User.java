package com.niit2.backend.NIITEComBackEnd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Table(name="UserDetail")
@Entity
@Component
public class User {

	@Id
	@Column(name = "username")
	private String name;
	@Column(name = "password")
	private String password;

	@Column(name = "enabled")
	private boolean enabled;

	@Column(name = "Addr")
	private boolean addr;

	@Column(name = "customername ")
	private boolean customername;

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Column(name = "role")
	private String role;

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
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

	public boolean isAddr() {
		return addr;
	}

	public void setAddr(boolean addr) {
		this.addr = addr;
	}

	public boolean isCustomername() {
		return customername;
	}

	public void setCustomername(boolean customername) {
		this.customername = customername;
	}

}
