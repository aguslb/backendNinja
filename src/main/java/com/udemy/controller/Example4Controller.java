package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	private static final String FORM_VIEW_404 = "404";
	private static final String FORM_VIEW_500 = "500";

	@GetMapping("/404")
	public String show404() {
		return FORM_VIEW_404;
	}
	
	@GetMapping("/500")
	public String show500() {
		return FORM_VIEW_500;
	}
}
