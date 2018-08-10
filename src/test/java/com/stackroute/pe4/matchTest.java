package com.stackroute.pe4;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;
import org.junit.Test;

public class matchTest 
{
	Match n = new Match();
	@Test
	public void test() 
	{
		  String s="She sells seashells by the seashore";
		  String s1="se";
	      assertEquals("4-6 10-12 27-29",n.pattern(s1,s));
	      assertNotEquals("4-6 10-12 27-29",n.pattern(s,s1));
	}
}
