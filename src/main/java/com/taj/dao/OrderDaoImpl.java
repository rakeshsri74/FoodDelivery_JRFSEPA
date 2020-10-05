package com.taj.dao;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taj.entity.Order;
import com.taj.entity.OrderItems;
import com.taj.entity.User;
import com.taj.model.ItemInfo;
import com.taj.model.ShoppingCart;

@Repository("orderDao")
@Transactional(propagation= Propagation.REQUIRED)
public class OrderDaoImpl implements OrderDao {
    
	@Autowired
	private SessionFactory sessionFactory;

	public void saveOrder(ShoppingCart cart) {	
			
	}

	public User getUser(String emailId) {
		return null;
	}

	public int getMaxOrderNum() {
		return 0;
	}

	public List<Order> showOrdersForToday() {
		
		return null;	
	}

	public Order getOrderDetails(int orderId){
		return null;	
	}
}
