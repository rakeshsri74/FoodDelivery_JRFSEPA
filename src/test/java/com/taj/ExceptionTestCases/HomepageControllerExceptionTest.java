package com.taj.ExceptionTestCases;

import static com.taj.UtilTestClass.TestUtils.exceptionTestFile;
import static com.taj.UtilTestClass.TestUtils.businessTestFile;
import static com.taj.UtilTestClass.TestUtils.currentTest;
import static com.taj.UtilTestClass.TestUtils.yakshaAssert;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.taj.controller.HomepageController;
import com.taj.service.OrderService;
import com.taj.service.ProductService;

public class HomepageControllerExceptionTest {

	@Mock
	private OrderService orderService;

	@Mock
	private ProductService productService;

	@InjectMocks
	private HomepageController homepageController;

	
	private MockMvc mockMvc;

	
	@Before
	public void setup() throws Exception 
	{
		
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(homepageController).build();
		
	}
	@Test
	public void testFindRestaurantByNameException() throws Exception 
	{
		
		Mockito.when(this.productService.findByRestaurant("Taj")).thenReturn(null);
		MvcResult result = this.mockMvc.perform(get("/findByRestaurant/Taj")).andReturn();
		yakshaAssert(currentTest(), 
				result.getResponse().getForwardedUrl()!=null && result.getResponse().getForwardedUrl().contentEquals("error") ? true : false, 
    			exceptionTestFile);
		
		
	}
	
	@Test
	public void testFindRestaurantByFoodException() throws Exception 
	{
		
		Mockito.when(this.productService.findByFood("Samosha")).thenReturn(null);
		MvcResult result = this.mockMvc.perform(get("/findByFood/Samosha")).andReturn();
		yakshaAssert(currentTest(), 
				result.getResponse().getForwardedUrl()!=null && result.getResponse().getForwardedUrl().contentEquals("error") ? true : false, 
    			exceptionTestFile);
		
		
	}

}
