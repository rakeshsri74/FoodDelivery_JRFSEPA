package com.taj.service;

import java.util.List;

import com.taj.entity.Order;
import com.taj.entity.User;
import com.taj.model.ShoppingCart;

public interface OrderService {

public void saveOrder(ShoppingCart cart);
	
	public List<Order> showOrdersForToday();
	
	public Order getOrderDetails(int orderId);
	
	public User getUser(String emailId);
	
	public int getMaxOrderNum();
}
