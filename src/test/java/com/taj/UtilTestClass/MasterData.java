package com.taj.UtilTestClass;

import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.taj.entity.Category;
import com.taj.entity.Order;
import com.taj.entity.OrderItems;
import com.taj.entity.Product;
import com.taj.entity.Restaurant;
import com.taj.entity.User;

public class MasterData {

	public static Category getCategory() {
		Category category = new Category();
		
		category.setCategoryId(1);
		category.setCategoryName("Snacks");
		
		List<Product> products = new ArrayList<Product>();
		Product product = new Product();
		product.setCategoryId(category);
		product.setDescription("Any product");
		product.setPrice(12.234);
		product.setProductId(1);
		product.setProductName("Samosha");
		
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantId(1);
		restaurant.setRestaurantName("Taj");
		products.add(product);
		restaurant.setProducts(products);
				
		product.setRestaurantId(restaurant);
		
		category.setProducts(products);
		
		return category;
				
	}
	
	public static Order getOrder() throws ParseException {
		
		Order order = new Order();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("23/09/2007");
		long time = date.getTime();
				
		order.setDate(new Timestamp(time));
		
		OrderItems item = new OrderItems();
		List<OrderItems> items = new ArrayList<OrderItems>();
		item.setHotnessLevel("Hot");
		item.setName("Samosha");
		item.setOrderId(order);
		item.setOrderItemId(1);
		item.setQuantity(2);
		
		items.add(item);
		
		order.setItems(items);
		order.setOrderId(1);
		order.setPrice(23.345);
		
		User user = new User();
		user.setAddress("F1/82");
		user.setAddress("rakesh@gmail.com");
		user.setfName("Rakesh");
		user.setlName("Srivastava");
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(order);
		
		user.setOrders(orders);
		user.setPhone("98738");
		user.setUserId(1);
		
		order.setUserId(user);
		
		return order;
				
	}
	
	public static OrderItems getOrderItems() throws ParseException {
		
		OrderItems item = new OrderItems();
		item.setHotnessLevel("Hot");
		item.setName("Samosha");
		
		Order order = new Order();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("23/09/2007");
		long time = date.getTime();
				
		order.setDate(new Timestamp(time));
		List<OrderItems> items = new ArrayList<OrderItems>();
		item.setHotnessLevel("Hot");
		item.setName("Samosha");
		item.setOrderId(order);
		item.setOrderItemId(1);
		item.setQuantity(2);
		
		items.add(item);
		
		order.setItems(items);
		order.setOrderId(1);
		order.setPrice(23.345);
		
		User user = new User();
		user.setAddress("F1/82");
		user.setAddress("rakesh@gmail.com");
		user.setfName("Rakesh");
		user.setlName("Srivastava");
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(order);
		
		user.setOrders(orders);
		user.setPhone("98738");
		user.setUserId(1);
		
		order.setUserId(user);
		
		return item;
		
	}
	
	public static Product getProduct() {
		
		Product product = new Product();
		
		Category category = new Category();
		
		category.setCategoryId(1);
		category.setCategoryName("Snacks");
		
		List<Product> products = new ArrayList<Product>();
		product.setCategoryId(category);
		product.setDescription("Any product");
		product.setPrice(12.234);
		product.setProductId(1);
		product.setProductName("Samosha");
		
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantId(1);
		restaurant.setRestaurantName("Taj");
		products.add(product);
		restaurant.setProducts(products);
				
		product.setRestaurantId(restaurant);
		
		category.setProducts(products);
	
		
		return product;
	}
	
	public static Restaurant getRestaurant() {
		
		Product product = new Product();
		
		Category category = new Category();
		
		category.setCategoryId(1);
		category.setCategoryName("Snacks");
		
		
		List<Product> products = new ArrayList<Product>();
		product.setCategoryId(category);
		product.setDescription("Any product");
		product.setPrice(12.234);
		product.setProductId(1);
		product.setProductName("Samosha");
		
		Restaurant restaurant = new Restaurant();
		restaurant.setRestaurantId(1);
		restaurant.setRestaurantName("Taj");
		products.add(product);
		restaurant.setProducts(products);
				
		product.setRestaurantId(restaurant);
		
		return restaurant;
			
	}
	
	
	public static User getUser() throws ParseException {
		
		Order order = new Order();
		
		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = dateFormat.parse("23/09/2007");
		long time = date.getTime();
				
		order.setDate(new Timestamp(time));
		List<OrderItems> items = new ArrayList<OrderItems>();
		OrderItems item = new OrderItems();
		item.setHotnessLevel("Hot");
		item.setName("Samosha");
		item.setOrderId(order);
		item.setOrderItemId(1);
		item.setQuantity(2);
		
		items.add(item);
		
		order.setItems(items);
		order.setOrderId(1);
		order.setPrice(23.345);
		
		User user = new User();
		user.setAddress("F1/82");
		user.setAddress("rakesh@gmail.com");
		user.setfName("Rakesh");
		user.setlName("Srivastava");
		
		List<Order> orders = new ArrayList<Order>();
		orders.add(order);
		
		user.setOrders(orders);
		user.setPhone("98738");
		user.setUserId(1);
		
		order.setUserId(user);
	
		return user;
	}
}
