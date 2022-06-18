package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/SearchPage")
	public String showform4() {
		return "SearchPage";
	}
	
	@RequestMapping(path="/search" , method = RequestMethod.POST)
	public RedirectView SearchApp(@RequestParam("search") String query)
	{
		String url ="https://google.com/search?q="+query;
		RedirectView r = new RedirectView();
		r.setUrl(url);
		return r;

		
	}

}
