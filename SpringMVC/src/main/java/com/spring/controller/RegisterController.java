package com.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.spring.model.UserReg;
import com.spring.services.UserService;

@Controller
public class RegisterController {

		
		@Autowired
		private UserService UserService;
		
		@RequestMapping("/RegisterPage")
		public String showform3() {
			return "RegisterPage";
		}
	
		@RequestMapping(path="/process3" , method = RequestMethod.POST)
		public String handleModelAttribute(@ModelAttribute("u") UserReg user, Model m)
		{
			System.out.println(user);
			int cid =this.UserService.createUser(user);
			m.addAttribute("msg","User created with id : "+cid);
			return "success";
		}

}
