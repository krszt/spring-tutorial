package com.in28minutes.spring.learn_spring_framework.controller;

import java.util.Random;

public class Player {
	private final String ID = String.valueOf(new Random().nextInt(50));
	private int point;
	
	public String getId() {
		return ID;
	}
	
	public void setPoint(int point) {
		this.point = point; 
	}
	
	public int getPoint() {
		return point;
	}

}
