package com.spring.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
//@RequestMapping("/first")
public class SendDataControllerToView {
	

    //by default all request is get 
	//@RequestMapping(path = "/model", method=RequestMethod.GET)
	
	// if you write request mapping at first in controller then your sequence will be - /first/model

	/*Sending data contoller to view */
	
	
	/* Method 1 : model */
	
	@RequestMapping("/model")
	public String printname(Model model) {
		model.addAttribute("name","vijay Ingle");
		
		List<String> l = new ArrayList<String>();
		l.add("vijay");
		l.add("ajay");
		l.add("kajal");
		l.add("nikita");
		
		model.addAttribute("f",l);
		System.out.println("This is my home page");
		return "index";
	}
	
	
	/* Method 2 : ModelandView */
	

	@RequestMapping("/help")
    public ModelAndView help() {
	
	System.out.println("this help controller");
	ModelAndView m = new ModelAndView();
	m.addObject("name", "Vijay Ingle");
	m.addObject("id", 123);
	m.setViewName("help");

	List<Float> f = new ArrayList<Float>();
	f.add(12.9f);
	f.add(13.4f);
	f.add(45.6f);
	m.addObject("marks", f);

	return m;

}
	
}
