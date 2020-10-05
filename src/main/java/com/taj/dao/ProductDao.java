package com.taj.dao;

import java.util.List;

import com.taj.entity.Category;
import com.taj.entity.Product;
import com.taj.entity.Restaurant;

public interface ProductDao {

	public Product getProductDetails(int itemId);
	
	public List<Category> getCategories();
	
	public List<Restaurant> findByFood(String productName);
	
	public Restaurant findByRestaurant(String restaurantName);
	
}
