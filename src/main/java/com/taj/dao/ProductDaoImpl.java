package com.taj.dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taj.dao.ProductDao;
import com.taj.entity.Category;
import com.taj.entity.Product;
import com.taj.entity.Restaurant;

@Repository("productDao")
@Transactional(propagation= Propagation.REQUIRED)
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Product getProductDetails(int productId) {

		return null;
	}

	public List<Category> getCategories() {

		return null;
	}

	@Override
	public List<Restaurant> findByFood(String productName) {
		return null;
	}

	@Override
	public Restaurant findByRestaurant(String restaurantName) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
