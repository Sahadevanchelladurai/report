package com.SRG.report.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ReportController {

	@GetMapping("/user")
	public String welcome() {
		return "Welcome User";
	}
	@GetMapping("/admin123")
	public String welcomeAdmin() {
		return "Welcome Admin ";
	}
}
