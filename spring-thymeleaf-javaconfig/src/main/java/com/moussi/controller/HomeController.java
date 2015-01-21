package com.moussi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

	@RequestMapping
	public String getHomePage(Model model) {
		model.addAttribute("user","user");
		return "users";
	}
}