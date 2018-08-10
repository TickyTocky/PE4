package com.stackroute.pe4;

import java.util.HashSet;
import java.util.Set;

public class App 
{
	// Exercise 1
    public static final int CHAR_RANGE = 128;

    public String twoUniqueCharacters(String str, int k)
    {
        int end = 0, begin = 0;

        // Set to store distinct characters in a window
        Set<Character> st = new HashSet<Character>();

        // Count array to store frequency of characters present in current window
        int[] freq = new int[CHAR_RANGE];

        // [low..high] maintain sliding window boundaries
        for (int low = 0, high = 0; high < str.length(); high++)
        {
            st.add(str.charAt(high));
            freq[str.charAt(high)]++;

            // if window size is more than k, remove characters from the left
            while (st.size() > k)
            {
                // if the frequency of leftmost character becomes 0 after
                // removing it in the window, remove it from set as well
                if (--freq[str.charAt(low)] == 0)
                {
                    st.remove(str.charAt(low));
                }

                low++;        // reduce window size
            }

            // update maximum window size if necessary
            if (end - begin < high - low)
            {
                end = high;
                begin = low;
            }
        }

        // return longest substring found at str[begin..end]
        return str.substring(begin, end + 1);
    }
    
    // Exercise 2
    public int occurenceCharacter(String str)
    {
        int charcount = str.length() - str.replaceAll("a", "").length();
        return charcount;
    }
    
    // Exercise 3
    public String replaceStrings(String str1)
    {
    	String firstStr = str1.replace('d', 'f');
    	String finalStr = firstStr.replace('l', 't');
    	
    	
    	return finalStr;
    }
    
    // Exercise 4
    
    
}
