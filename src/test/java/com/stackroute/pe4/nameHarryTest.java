package com.stackroute.pe4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;
public class nameHarryTest {
	Nameharry n=new Nameharry();
	@Test
	public void test() 
	{
		String s1= "This is Harry";
		String s2= "This is Henry";
		assertEquals("true",n.harry(s1));
		assertNotEquals("true",n.harry(s2));
	
}
	
}
