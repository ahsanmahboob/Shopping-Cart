package com.engineers.learner.login.entity;

import java.util.UUID;

import com.engineers.learner.customers.entity.Customers;

public class Logins {

	private UUID id;

	private Customers customers;

	private String username;

	private String password;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Customers getCustomers() {
		return customers;
	}

	public void setCustomers(Customers customers) {
		this.customers = customers;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
