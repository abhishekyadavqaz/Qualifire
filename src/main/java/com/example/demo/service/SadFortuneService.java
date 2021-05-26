package com.example.demo.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

//@Primary
@Service
@Qualifier("SadFortuneService")
public class SadFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a sad day";
	}

}
