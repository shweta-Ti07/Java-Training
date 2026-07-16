package com.coforge.beans;

import java.util.List;

public class Order {
	
	private int orderId;
	private double orderCost;
	private List<Item> itemList;
	
	public Order() {
		super();
	}
	
	public Order(int orderId, double orderCost, List<Item> itemList) {
		super();
		this.orderId = orderId;
		this.orderCost = orderCost;
		this.itemList = itemList;
	}
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderCost=" + orderCost + ", item=" + itemList + "]";
	}


}
