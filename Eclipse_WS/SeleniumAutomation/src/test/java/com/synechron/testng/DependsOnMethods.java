package com.synechron.testng;

import org.testng.annotations.Test;

public class DependsOnMethods {

	@Test
	public void launch() {
		System.out.println("Launch");
	}
	
	@Test(dependsOnMethods = "launch")
	public void login() {
		System.out.println("login");
	}
	
	@Test(dependsOnMethods = {"login", "login"})
	public void createUser() {
		System.out.println("createUser");
	}
	
	@Test(dependsOnMethods = "createUser")
	public void logout() {
		System.out.println("logout");
	}
}
