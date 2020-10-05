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
import com.taj.controller.OrderController;
import com.taj.controller.ShoppingCartController;
import com.taj.service.OrderService;
import com.taj.service.ProductService;

public class ShoppingCartControllerExceptionTest {

	@Mock
	private OrderService orderService;

	@Mock
	private ProductService productService;

	@InjectMocks
	private ShoppingCartController shoppingCartController;

	
	private MockMvc mockMvc;

	
	@Before
	public void setup() throws Exception 
	{
		
		MockitoAnnotations.initMocks(this);
		this.mockMvc = MockMvcBuilders.standaloneSetup(shoppingCartController).build();
		
	}
	
	@Test
	public void testAddToCartException() throws Exception 
	{
		
		Mockito.when(this.productService.getProductDetails(1)).thenReturn(null);
		MvcResult result = this.mockMvc.perform(get("/addToCart")).andReturn();
		yakshaAssert(currentTest(), 
				result.getResponse().getForwardedUrl()!=null && result.getResponse().getForwardedUrl().contentEquals("error") ? true : false, 
    			exceptionTestFile);
		
		
	}

}
