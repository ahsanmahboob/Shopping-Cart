package com.engineers.learner.customers.entity;

import java.util.UUID;

/**
 * The Class Customers.
 */
public class Customers {

	/** The id. */
	private UUID id;

	/** The forename. */
	private String forename;

	/** The surname. */
	private String surname;

	/** The add 1. */
	private String add1;

	/** The add 2. */
	private String add2;

	/** The add 3. */
	private String add3;

	/** The postcode. */
	private String postcode;

	/** The phone. */
	private String phone;

	/** The email. */
	private String email;

	/** The registered. */
	private boolean registered;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getForename() {
		return forename;
	}

	public void setForename(String forename) {
		this.forename = forename;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getAdd1() {
		return add1;
	}

	public void setAdd1(String add1) {
		this.add1 = add1;
	}

	public String getAdd2() {
		return add2;
	}

	public void setAdd2(String add2) {
		this.add2 = add2;
	}

	public String getAdd3() {
		return add3;
	}

	public void setAdd3(String add3) {
		this.add3 = add3;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}
}
