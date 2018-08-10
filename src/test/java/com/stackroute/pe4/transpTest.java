package com.stackroute.pe4;
import static org.junit.Assert.assertArrayEquals;
//import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import org.junit.Test;

public class transpTest {
	Transp c = new Transp();
	@Test
	public void test() 
	{
		String[]  s = {"a", "kciuq", "nworb", "xof", "spmuj", "revo", "eht", "yzal", "god"};
		String[] s1= {"a", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
		assertArrayEquals(s,c.reverse(s));
		assertNotEquals(s,c.reverse(s1));
	}
}
