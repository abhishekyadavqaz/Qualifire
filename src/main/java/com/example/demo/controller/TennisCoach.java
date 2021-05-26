package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.FortuneService;

@RestController
public class TennisCoach implements Coach {

	@Autowired
	@Qualifier("HappyFortuneService")
	private FortuneService fortuneService;

	@Autowired
	@Qualifier("SadFortuneService")
	private FortuneService fortuneService2;

	@GetMapping("/work")
	@Override
	public String getDailyWorkout() {
		return "Practice your backhand ";
	}

	@GetMapping("/fortune")
	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@GetMapping("/fortune2")
	@Override
	public String getDailyFortune2() {
		return fortuneService2.getFortune();
	}

}
