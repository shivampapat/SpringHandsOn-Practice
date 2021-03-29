package com.shivam.springdemo;

public class HappyFortuneService implements FortuneService {

	@Override
	public String getFortune() {
		return "Today is a lucky day for you";
	}

}
