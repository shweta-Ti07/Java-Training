package com.coforge.beans;

import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component("hello")
public class HelloBean {
	
	
	public HelloBean() {
		System.out.println("1.Hello bean constructor called");
	}
	
	@PostConstruct
	public void init() {
		
		System.out.println("2.@PostConstruct init() called");
		
	}
	
	public void sayHello() {
		System.out.println("3.Hello");
	}
	
	@PreDestroy
	public void destroy() {
		
		System.out.println("4.@PreDestroy destroy() is called");
		
	}
	
	

}
