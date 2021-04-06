package com.shivam.springannotation;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Inside RandomFortuneService";
	}

}
