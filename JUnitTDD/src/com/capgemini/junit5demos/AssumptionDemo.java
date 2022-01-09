package com.capgemini.junit5demos;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

public class AssumptionDemo {
		@Test
	    void testOnDev() 
		{
			System.setProperty("ENV", "DEV");  // TRUE
	        Assumptions.assumeTrue("DEV".equals(System.getProperty("ENV"))); // TRUE
	        //remainder of test will proceed
	    }
		
		@Test
	    void testOnProd() 
		{
			System.setProperty("ENV", "PROD");// T
	        Assumptions.assumingThat("DEV".equals(System.getProperty("ENV")), AssumptionDemo::message); // T
	        //remainder of test will be aborted
	    }
		
		private static String message () {
			return "Today's TEST Execution Failed :: ";
		}
}
