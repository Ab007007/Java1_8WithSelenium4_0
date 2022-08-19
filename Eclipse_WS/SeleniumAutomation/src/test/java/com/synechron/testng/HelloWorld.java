package com.synechron.testng;

import org.testng.annotations.Test;

public class HelloWorld {

	@Test
	public void launch() {
		System.out.println("Launch");
	}
	
	@Test
	public void login() {
		System.out.println("login");
	}
	
	@Test
	public void createUser() {
		System.out.println("createUser");
	}
	
	@Test
	public void logout() {
		System.out.println("logout");
	}
}
