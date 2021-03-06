package com.udemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/example2")
public class Example2Controller {
	private static final String EXAMPLE2_VIEW = "example2";

	// nm=text
	@GetMapping("/request1")
	public ModelAndView request1(@RequestParam(name = "nm", required = false, defaultValue = "NULL") String name) {
		ModelAndView mv = new ModelAndView(EXAMPLE2_VIEW);
		mv.addObject("nm_in_model", name);
		return mv;
	}

	// /name/
	@GetMapping("/request2/{nm}")
	public ModelAndView request2(@PathVariable("nm") String name) {
		ModelAndView mv = new ModelAndView(EXAMPLE2_VIEW);
		mv.addObject("nm_in_model", name);
		return mv;
	}

}
