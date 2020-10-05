package com.taj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taj.dao.OrderDao;
import com.taj.entity.Order;
import com.taj.entity.User;
import com.taj.model.ShoppingCart;

@Service("orderService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class OrderServiceImpl implements OrderService {

	@Autowired
	private OrderDao orderDao;
	
	public void saveOrder(ShoppingCart cart) {
		

	}

	public List<Order> showOrdersForToday() {
		// TODO Auto-generated method stub
		return null;
	}

	public Order getOrderDetails(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}

	public User getUser(String emailId) {
		// TODO Auto-generated method stub
		return null;
	}

	public int getMaxOrderNum() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
