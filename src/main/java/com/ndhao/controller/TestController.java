package com.ndhao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.ndhao.dto.TestDto;
import com.ndhao.service.TestService;

@RestController
public class TestController {
	@Autowired
	TestService testService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void test(@RequestBody TestDto test) {
		testService.test(test);
	}
	
}
