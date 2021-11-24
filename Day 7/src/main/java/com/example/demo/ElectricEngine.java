package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ElectricEngine implements Engine {
	@Autowired
	private Camshaft camshaft; // Field injection

	@Override
	public void turnOn() {
		System.out.println("Started electric engine");
	}
}