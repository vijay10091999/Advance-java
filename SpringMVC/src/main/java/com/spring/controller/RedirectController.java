package com.spring.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class RedirectController {

	/* Method 1 : use redirect prefix 
	 * In this you are simply use redirect:/url_name
	 * */
	
	@RequestMapping("/one")
	public String one() {
		System.out.println("this is one handler");
		return "redirect:/two";
		
	}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("this is second handler");
		return "";
		
	}
	
	/* Method 2 : use redirectview 
	 * In this you are simply use RedirectView -> create object -> use seturl
	 * */
	
	@RequestMapping("/three")
	public RedirectView  three() {
		System.out.println("this is three handler");
		RedirectView r = new RedirectView();
		r.setUrl("four");
		return r;	
	}
	
	@RequestMapping("/four")
	public String four() {
		System.out.println("this is four handler");
		return "";
		
	}
}
