package com.seezoon.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value="/web")
public class WebController {

	@RequestMapping(value="/home")
	public String hello(Model model){
		model.addAttribute("name", "你好 ，freemarker.");
		return "/web/home";
	}
}
