package com.shivam.springannotation;

import org.springframework.stereotype.Component;

@Component
public class DatabaseFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Inside DatabaseFortuneService";
	}

}
