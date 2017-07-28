package com.engineers.learner.order.entity;

import java.util.Date;
import java.util.UUID;

import com.engineers.learner.customers.entity.Customers;
import com.engineers.learner.delivery.address.entity.DeliveryAddress;

public class Orders {

	private UUID id;

	private Customers customers;

	private boolean registered;

	private DeliveryAddress deliveryAddress;

	private String paymentType;

	private Date date;

	private boolean status;

	private String session;

	private int total;

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

	public boolean isRegistered() {
		return registered;
	}

	public void setRegistered(boolean registered) {
		this.registered = registered;
	}

	public DeliveryAddress getDeliveryAddress() {
		return deliveryAddress;
	}

	public void setDeliveryAddress(DeliveryAddress deliveryAddress) {
		this.deliveryAddress = deliveryAddress;
	}

	public String getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getSession() {
		return session;
	}

	public void setSession(String session) {
		this.session = session;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}
}
