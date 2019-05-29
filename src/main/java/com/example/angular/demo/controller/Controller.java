package com.example.angular.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@RequestMapping("/angular_test")
	public String getAngualrPage() {
		return "angular_test.html";
	}
}
