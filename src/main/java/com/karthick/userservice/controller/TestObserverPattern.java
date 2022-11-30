package com.karthick.userservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.karthick.userservice.ObserverPatternTest;


@RestController
public class TestObserverPattern {
	
	@Autowired
	ObserverPatternTest observerPatternTest;
	
	@PostMapping("/execute")
	public void excuteObserverPattern(@RequestBody String args) {
		System.out.println("Method called via client " + args);
		observerPatternTest.excute();
	}

}
