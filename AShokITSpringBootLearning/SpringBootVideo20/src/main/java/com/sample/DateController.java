package com.sample;

import java.sql.Date;
import java.time.LocalDate;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
@RequestMapping("/dt")
public class DateController {
	@GetMapping("/date")
	public ModelAndView getMethodName() {
		ModelAndView mav=new ModelAndView();
		LocalDate d=LocalDate.now();
		mav.addObject("msg","Today's date:: "+d);
		mav.setViewName("index");
		return mav;
	}
	

}
