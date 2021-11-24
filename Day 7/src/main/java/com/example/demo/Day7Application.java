package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class Day7Application {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Day7Application.class, args);

		Car obj1 = context.getBean(Car.class);
		obj1.start();

		CombustionEngine obj2 = context.getBean(CombustionEngine.class);
		obj2.turnOn();

		ElectricEngine obj3 = context.getBean(ElectricEngine.class);
		obj3.turnOn();
	}
}