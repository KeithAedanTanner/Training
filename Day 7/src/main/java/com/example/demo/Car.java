package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {
	private Engine engine;

	@Autowired // Setter injection
	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void start() {
		engine.turnOn();
	}
}