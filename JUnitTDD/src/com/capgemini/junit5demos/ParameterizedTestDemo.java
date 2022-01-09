package com.capgemini.junit5demos;

import static org.junit.Assert.assertNotNull;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestDemo 
{
	@ParameterizedTest
	@ValueSource(strings = { "1","2","three","4","five" } )
	
	void withValueSource(String number) 
	{
		assertNotNull(number);
	}
}
