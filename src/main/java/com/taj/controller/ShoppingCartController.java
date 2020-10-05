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

import com.taj.exception.ShoppingCartException;
import com.taj.model.HotnessInfo;
import com.taj.service.ProductService;
import com.taj.validator.HotnessValidator;

@Controller
public class ShoppingCartController {

	@Autowired
	private ProductService productService;

	@Autowired
	private HotnessValidator hotnessValidator;

	@RequestMapping(value = "/addToCart", method = RequestMethod.GET)
	public String addToCart(@RequestParam(value = "productId", required = true) int productId,
			HttpServletRequest httpServletRequest) {

		return null;
		
	}

	@RequestMapping(value = "/shoppingCart", method = RequestMethod.GET)
	public String shoppingCart(HttpServletRequest httpServletRequest, ModelMap map) {
		return null;
	
	}

	public String updateCart(HttpServletRequest httpServletRequest, ModelMap map) {
		return null;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.GET)
	public String delete(@RequestParam(value = "code", required = true) String code,
			HttpServletRequest httpServletRequest) {

		return null;
	}

	@RequestMapping(value = "/hotness", method = RequestMethod.GET)
	public String hotnessLevel(HttpServletRequest httpServletRequest, Model map) {

		return null;
		
	}

	@RequestMapping(value = "/hotness", method = RequestMethod.POST)
	public String hotnessLevel(HttpServletRequest httpServletRequest, Model map,
			@ModelAttribute("hotnessInfo") HotnessInfo hotnessInfo, BindingResult bindingResult) {

		return null;
		
	}

	@ExceptionHandler(ShoppingCartException.class)
	public ModelAndView handleException(ShoppingCartException ex) {
		ModelAndView mv = new ModelAndView("error");
		mv.addObject("exception", ex);
		return mv;
	}
}
