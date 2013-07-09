package com.examples.newhires.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/welcome")
public class HelloController {
 
	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String printWelcome(@PathVariable String name, ModelMap model) {
 
		model.addAttribute("message", name);
		return "hello";
 
	}
 
	

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getDefaultMovie(ModelMap model) {
 
		model.addAttribute("message", "this is default message");
		return "hello";
 
	}
 
	
}