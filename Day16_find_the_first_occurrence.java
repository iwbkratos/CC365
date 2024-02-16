package cc365;

public class Day16_find_the_first_occurrence {

	 public int strStr(String haystack, String needle) {
	        int size=needle.length();
		        for(int i=0;i<=haystack.length()-size;i++)
	            {
	                 if(haystack.substring(i,i+size).startsWith(needle)) return i;
	            }
	            return -1; 

	    }
}
