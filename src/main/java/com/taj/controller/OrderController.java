package com.taj.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.taj.exception.OrderException;
import com.taj.model.CustomerInfo;
import com.taj.service.OrderService;
import com.taj.validator.CustomerInfoValidator;

@Controller
public class OrderController {
	
	@Autowired
	private OrderService orderService;

	@Autowired
	private CustomerInfoValidator customerInfoValidator;

	
	@RequestMapping(value = "/checkout", method = RequestMethod.GET)
	public String checkout(HttpServletRequest httpServletRequest, Model map) {

		return null;
	}

	@RequestMapping(value = "/checkout", method = RequestMethod.POST)
	public String checkout(HttpServletRequest httpServletRequest, Model map,
			@ModelAttribute("customerForm") CustomerInfo customerForm, BindingResult bindingResult) {

		return null;
	}

	@RequestMapping(value = "/orderConfirmation", method = RequestMethod.GET)
	public String orderConfirmation(HttpServletRequest httpServletRequest, ModelMap map) {

		return null;
		
	}

	@RequestMapping(value = "placeOrder", method = RequestMethod.GET)
	public String placeOrder(HttpServletRequest httpServletRequest, Model model) {

		return null;
		
	}

	@RequestMapping(value = "/orders", method = RequestMethod.GET)
	public String findOrder(@RequestParam(value = "v", required = true) String v, Model map) {

		return null;
		
	}

	@RequestMapping(value = "/orderDetail", method = RequestMethod.GET)
	public String getOrderDetails(@RequestParam(value = "o", required = true) String id, Model map) {

	return null;
	
	}

	@ExceptionHandler(OrderException.class)
	public ModelAndView handleException(OrderException ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
	
}
