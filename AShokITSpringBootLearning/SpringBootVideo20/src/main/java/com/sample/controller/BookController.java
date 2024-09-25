package com.sample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/book")
public class BookController {
	
	@GetMapping("/price")
	@ResponseBody
	public String getBookPrice(String isb)
	{
		String msg="The  Book Price Of"+isb +" Is : 450.00 INR";
		return msg;
	}
}
