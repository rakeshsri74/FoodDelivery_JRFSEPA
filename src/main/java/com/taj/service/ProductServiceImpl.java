package com.taj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.taj.dao.ProductDao;
import com.taj.entity.Category;
import com.taj.entity.Product;
import com.taj.entity.Restaurant;

@Service("productService")
@Transactional(propagation= Propagation.REQUIRED)
@EnableTransactionManagement
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao productDao;
	
	public Product getProductDetails(int itemId) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Restaurant> findByFood(String productName) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Restaurant findByRestaurant(String restaurantName) {
		// TODO Auto-generated method stub
		return null;
	}

}
