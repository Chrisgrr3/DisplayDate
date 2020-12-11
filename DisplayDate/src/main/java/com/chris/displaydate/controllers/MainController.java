package com.chris.displaydate.controllers;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MainController {
	
	@RequestMapping("/")
	public String index() {
		return "dashboard.jsp";
	}
	@RequestMapping("/date")
	public String date(Model model) {
		LocalDate date = LocalDate.of(2028, Month.JANUARY, 22);
		DayOfWeek day = DayOfWeek.from(date);
	
		model.addAttribute("year", date.getYear());
		model.addAttribute("day", day.name());
		model.addAttribute("month", date.getMonth());
		model.addAttribute("date", date.getDayOfMonth());
		return "date.jsp";	
	}
	@RequestMapping("/time")
	public String time(Model model) {
		Date time = new Date(2028, 1, 22, 11, 30);
		model.addAttribute("hour", time.getHours());
		model.addAttribute("minute", time.getMinutes());
		return "time.jsp";
	}
	
}
