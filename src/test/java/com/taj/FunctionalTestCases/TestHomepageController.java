package com.taj.FunctionalTestCases;

import static com.taj.UtilTestClass.TestUtils.businessTestFile;
import static com.taj.UtilTestClass.TestUtils.currentTest;
import static com.taj.UtilTestClass.TestUtils.yakshaAssert;
import static com.taj.UtilTestClass.TestUtils.asJsonString;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;

//import java.io.File;
//import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

//import org.apache.commons.io.FileUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.invocation.InvocationOnMock;
import org.mockito.stubbing.Answer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;

import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.RequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import com.taj.UtilTestClass.MasterData;

import com.taj.configuration.WebMvcConfig;

import com.taj.controller.HomepageController;
import com.taj.entity.Product;
import com.taj.entity.Restaurant;
import com.taj.service.OrderService;
import com.taj.service.ProductService;

public class TestHomepageController {

	@Mock
	private OrderService orderService;

	@Mock
	private ProductService productService;

	@InjectMocks
	private HomepageController homepageController;

	
	//@Autowired
    //private WebApplicationContext webApplicationContext;
	
	private MockMvc mockMvc;

	
	@Before
	public void setup() throws Exception 
	{
		//Mockito.reset(this.postService);
		//Mockito.reset(this.commentService);
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(homepageController).build();
		// mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
	}
	
	@Test
	public void testLoadingPageUrl() throws Exception 
	{
		MvcResult result = this.mockMvc.perform(get("/")).andReturn();
		System.out.println(result.getResponse().getForwardedUrl());
	    yakshaAssert(currentTest(), 
	    		result.getResponse().getForwardedUrl()!=null && result.getResponse().getForwardedUrl().contentEquals("index") ? true : false, 
	    			businessTestFile);
	}
	
	@Test
	public void testRestaurantByName() throws Exception 
	{
		Restaurant restaurant = MasterData.getRestaurant();
		restaurant.setRestaurantName("Taj");
		Mockito.when(this.productService.findByRestaurant("Taj")).thenReturn(restaurant);
		MvcResult result = this.mockMvc.perform(get("/findByRestaurant/Taj")).andReturn();
		yakshaAssert(currentTest(), 
				result.getResponse().getForwardedUrl()!=null && result.getResponse().getForwardedUrl().contentEquals("restaurant-details") ? true : false, 
    			businessTestFile);
	}
	
	@Test
	public void testFindRestaurantByFood() throws Exception 
	{
		Product product = MasterData.getProduct();
		product.setProductName("Samosha");
		Restaurant restaurant = MasterData.getRestaurant();
		List<Restaurant> restaurants = new ArrayList<Restaurant>();
		restaurants.add(restaurant);
		Mockito.when(this.productService.findByFood("Samosha")).thenReturn(restaurants);
		MvcResult result = this.mockMvc.perform(get("/findByFood/Samosha")).andReturn();
		yakshaAssert(currentTest(), 
				result.getResponse().getForwardedUrl()!=null && result.getResponse().getForwardedUrl().contentEquals("food-details") ? true : false, 
    			businessTestFile);
	}

}
