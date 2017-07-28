package com.engineers.learner.order.entity;

import java.util.UUID;

public class Order_Items {

	private UUID id;

	private Orders orders;

	private Products products;

	private int quantity;

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Orders getOrders() {
		return orders;
	}

	public void setOrders(Orders orders) {
		this.orders = orders;
	}

	public Products getProducts() {
		return products;
	}

	public void setProducts(Products products) {
		this.products = products;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
