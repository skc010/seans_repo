package com.examples.newhires.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
@Controller
@RequestMapping("/Michael")
public class HelloMichael {
 
	@RequestMapping(method = RequestMethod.GET)
	public String printWelcome(ModelMap model) {
 
		model.addAttribute("message", "Hey there Mr. West Virgina.");
		return "hello";
 
	}
 
}