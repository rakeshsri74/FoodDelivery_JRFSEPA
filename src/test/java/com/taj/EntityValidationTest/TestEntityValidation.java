package com.taj.EntityValidationTest;

import static com.taj.UtilTestClass.TestUtils.boundaryTestFile;
import static com.taj.UtilTestClass.TestUtils.currentTest;
import static com.taj.UtilTestClass.TestUtils.yakshaAssert;

//import java.io.File;
import java.io.IOException;
import java.text.ParseException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

//import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;

import com.taj.UtilTestClass.MasterData;
import com.taj.entity.Category;
import com.taj.entity.Order;
import com.taj.entity.OrderItems;
import com.taj.entity.Product;
import com.taj.entity.Restaurant;
import com.taj.entity.User;

public class TestEntityValidation {

	private Validator validator;

	  
    //----------------------------------------------------------------------------------------------
    @Before
    public void setUp() throws IOException
    {
    	ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }

    //----------------------------------------------------------------------------------------------
    @Test
    public void testCategorySuccess() throws IOException
    {
    	Category category = MasterData.getCategory();
        Set<ConstraintViolation<Category>> violations = validator.validate(category);
        
	    yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

        
    }
    
    @Test
    public void testCategoryFailed() throws IOException
    {
    	Category category = MasterData.getCategory();
    	category.setCategoryName(null);
        Set<ConstraintViolation<Category>> violations = validator.validate(category);
        System.out.println(violations.isEmpty());
	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);

    }

    //----------------------------------------------------------------------------------------------
    @Test
    public void testOrderSuccess() throws IOException, ParseException
    {
    	Order order = MasterData.getOrder();
        Set<ConstraintViolation<Order>> violations = validator.validate(order);

	    yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
    @Test
    public void testOrderFailed() throws IOException, ParseException
    {
    	Order order = MasterData.getOrder();
    	order.setOrderId(0);
        Set<ConstraintViolation<Order>> violations = validator.validate(order);

	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
  //----------------------------------------------------------------------------------------------
    @Test
    public void testOrderItemsSuccess() throws IOException, ParseException
    {
    	OrderItems orderItems = MasterData.getOrderItems();
        Set<ConstraintViolation<OrderItems>> violations = validator.validate(orderItems);

	    yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
    @Test
    public void testOrderItemsFailed() throws IOException, ParseException
    {
    	OrderItems orderItems = MasterData.getOrderItems();
    	orderItems.setName(null);
        Set<ConstraintViolation<OrderItems>> violations = validator.validate(orderItems);

	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
  //----------------------------------------------------------------------------------------------
    @Test
    public void testProductSuccess() throws IOException, ParseException
    {
    	Product product = MasterData.getProduct();
        Set<ConstraintViolation<Product>> violations = validator.validate(product);

	    yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
    @Test
    public void testProductFailed() throws IOException, ParseException
    {
    	Product product = MasterData.getProduct();
    	product.setProductName(null);
        Set<ConstraintViolation<Product>> violations = validator.validate(product);

	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
    //----------------------------------------------------------------------------------------------
    @Test
    public void testRestaurantSuccess() throws IOException, ParseException
    {
    	Restaurant restaurant = MasterData.getRestaurant();
        Set<ConstraintViolation<Restaurant>> violations = validator.validate(restaurant);

	    yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
    @Test
    public void testRestaurantFailed() throws IOException, ParseException
    {
    	Restaurant restaurant = MasterData.getRestaurant();
    	restaurant.setRestaurantName(null);
        Set<ConstraintViolation<Restaurant>> violations = validator.validate(restaurant);

	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);

    }

    
  //----------------------------------------------------------------------------------------------
    @Test
    public void testUserSuccess() throws IOException, ParseException
    {
    	User user = MasterData.getUser();
        Set<ConstraintViolation<User>> violations = validator.validate(user);

	    yakshaAssert(currentTest(), violations.isEmpty() ? true : false, boundaryTestFile);

    }
    
    @Test
    public void testUserFailed() throws IOException, ParseException
    {
    	User user = MasterData.getUser();
    	user.setfName(null);
        Set<ConstraintViolation<User>> violations = validator.validate(user);

	    yakshaAssert(currentTest(), !violations.isEmpty() ? true : false, boundaryTestFile);

    }



}
