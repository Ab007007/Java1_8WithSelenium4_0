package com.synechron.testng;

import org.testng.annotations.DataProvider;

public class TestData {

	
	 @DataProvider
	  public Object[][] testData() {
	    return new Object[][] {
	    	new Object[] { "FN1" ,"LN1" ,"JT1" },
	    	new Object[] { "FN2" ,"LN2" ,"JT3" },
	    	new Object[] { "FN3" ,"LN3" ,"JT4" },
	    	new Object[] { "FN4" ,"LN4" ,"JT6" },
	    	new Object[] { "FN5" ,"LN5" ,"JT5" }
	    
	    };
	  }
}
