package com.taj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.taj.exception.FoodException;
import com.taj.service.ProductService;

@Controller
public class HomepageController {

	@Autowired
	private ProductService productService;

	@RequestMapping(value = { "/", "/index", "/welcome" }, method = RequestMethod.GET)
	public String homePage(ModelMap model) {

		return null;
	}

	@RequestMapping(value = { "/findByRestaurant/{restaurantName}"}, method = RequestMethod.GET)
	public String findRestaurantByName(@PathVariable("restaurantName") String restaurantName) {

		return null;
	}
	
	@RequestMapping(value = { "/findByFood/{productName}" }, method = RequestMethod.GET)
	public String findRestaurantByFood(@PathVariable("productName") String productName) {

		return null;
		
	}

	@ExceptionHandler(FoodException.class)
	public ModelAndView handleException(FoodException ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}

	
	
}
