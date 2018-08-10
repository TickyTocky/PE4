package com.stackroute.pe4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class tokenSortTest
{
	Token c = new Token();
	@Test
	public void test() 
	{
		String  s = "aehiimmnssty";
		String s1= "This is my name";
		assertEquals(s,c.sort(s1));
		assertNotEquals(s1,c.sort(s1));
	
	}
}
