package com.example.limits_service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.limits_service.configuration.LimitsConfiguration;
import com.example.limits_service.controller.beans.Limits;



@RestController
public class LimitsController {
	
	@Autowired
	private LimitsConfiguration limitsConfiguration;
	
	@GetMapping("/limits")
	public Limits retrieveLimits() {
		return new Limits(limitsConfiguration.getMinimum(),limitsConfiguration.getMaximum());
	}

}
