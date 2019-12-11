package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Celebrite;

@Controller
public class TestController {
	
	@RequestMapping(value="/newfile")
	public String  newfile() {
		return "newfile";
	}
	
}
