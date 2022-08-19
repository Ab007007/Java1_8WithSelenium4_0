package com.synechron.testng;

import org.testng.annotations.Test;

public class PriorityDemo {

	@Test(priority = 1)
	public void launch() {
		System.out.println("Launch");
	}
	
	@Test(priority = 2)
	public void login() {
		System.out.println("login");
	}
	
	@Test(priority = 3)
	public void createUser() {
		System.out.println("createUser");
	}
	
	@Test(priority = 4)
	public void logout() {
		System.out.println("logout");
	}
}
