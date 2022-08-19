package com.synechron.testng;

import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;

public class NewTest {
  @Test(dataProvider = "dp")
  public void f(Integer n, String s, String x) 
  {
	  
  }

  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	new Object[] { 1, "a" , "C" },
        new Object[] { 2, "b" , "E"},
        new Object[] { 1, "a" , "C" },
        new Object[] { 2, "b" , "E"},
        new Object[] { 1, "a" , "C" },
        new Object[] { 2, "b" , "E"},
        new Object[] { 1, "a" , "C" },
        new Object[] { 2, "b" , "E"},
    };
  }
}
