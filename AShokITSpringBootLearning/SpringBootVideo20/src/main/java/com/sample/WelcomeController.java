package com.sample;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class WelcomeController {
	@GetMapping
	public ModelAndView displaywelcomeMsg()
	{
		ModelAndView mav=new ModelAndView();
		mav.addObject("msg","welcome to Spring web MVc");
		mav.setViewName("index");
		return mav;
	}

}
