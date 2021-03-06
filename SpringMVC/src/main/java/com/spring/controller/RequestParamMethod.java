package com.spring.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.model.User;


@Controller
public class RequestParamMethod {

	/* Accessing the jsp page */
	@RequestMapping("/contact1")
	public String showform1() {
		return "contact1";
	}

	
	/*
	 * access the form which is presnet in contact.jsp page by passing the post
	 * method
	 */	
	
	@RequestMapping(path="/process1",method=RequestMethod.POST)
	
	/*
	 * when user click on go button then how it be procced or which request should
	 * be procces?
	 * you will get data in the below request which you enter in contact.jsp form
	 */	
	
	/*	 The below method is old where we used in servlet concept by
	 *  using getparamter for take data fetch from frontend to 
	 *  backend
	*/	
	
	/*public String handleForm(HttpServletRequest request) {
		String email = request.getParameter("email");
		System.out.println("user email id is :"+email);
		return "";
		
	}*/
	
	
	/* Method 1 : Request Param */
	
	public String handleFormByUsingRequestParam(
			
			@RequestParam("name") String username,
			@RequestParam("email") String useremail,
			@RequestParam("password") String userpassword,
			Model m
			) 
	{
		
		/*
		 * this is used for access in success page use model
		 */	 
	 m.addAttribute("name",username);
	 m.addAttribute("email", useremail);
	 m.addAttribute("password", userpassword);
	 
		
		return "success";
	}

	
}
