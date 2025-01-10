package com.in28minutes.spring.learn_spring_framework.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/players")
	public List<Player> retrieveAllGames() {
		return Arrays.asList(new Player(), new Player());
	}
}
