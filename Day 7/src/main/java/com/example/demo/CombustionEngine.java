package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Primary
@Component
public class CombustionEngine implements Engine {
	private Crankshaft crankshaft;

	@Autowired // Constructor injection
	public CombustionEngine(Crankshaft crankshaft) {
		super();
		this.crankshaft = crankshaft;
	}

	@Override
	public void turnOn() {
		System.out.println("Started combustion engine");
	}
}