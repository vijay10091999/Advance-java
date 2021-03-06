package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.User;

@Controller
public class ModelAttributeMethod {

	@RequestMapping("/contact2")
	public String showform2() {
		return "contact2";
	}

	/*
	 * without model Attribute but use 
	 * 
	 * @RequestMapping(path="/process2" , method=RequestMethod.POST) 
	 * public String handleFormByUsingModelAttribute(
	 * 
	 * @RequestParam("name") String username,
	 * 
	 * @RequestParam("email") String useremail,
	 * 
	 * @RequestParam("password") String userpassword, Model m ) { User user = new
	 * User(); user.setName(username); user.setEmail(useremail);
	 * user.setPassword(userpassword);
	 * 
	 * set the key and value where to show values on frontend - passing user value
	 * in success.jsp 
	 * 
	 * m.addAttribute("user", user);
	 * 
	 * return "success"; }
	 */
	@RequestMapping(path="/process2" , method = RequestMethod.POST)
	public String handleFormByUsingModelAttribute(@ModelAttribute("u") User u, Model m)
	{
		
		System.out.println(u);
		/* using redirect Preffix concept here */
		if(u.getName().isBlank()) {
			return "redirect:/contact2";
		}
		return "success";
	}
}
