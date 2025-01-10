package com.in28minutes.spring.learn_spring_framework.game;

import org.springframework.stereotype.Component;

@Component
public class PacManGame implements Game {
	public void up() {
		System.out.println("SuperContraGame.java up");
	}
	
	public void down() {
		System.out.println("SuperContraGame.java down");
	}
	
	public void left() {
		System.out.println("SuperContraGame.java left");
	}
	
	public void right() {
		System.out.println("SuperContraGame.java right");
	}
}