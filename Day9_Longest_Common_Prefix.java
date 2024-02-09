package cc365;
import java.util.Arrays;
public class Day9_Longest_Common_Prefix {
public static String longestCommonPrefix(String[] strs) {
       Arrays.sort(strs);
       String s1=strs[0];
       String s2=strs[strs.length-1];
       
       String s="";
       for(int i=0;i<s1.length();i++)
       {
    	   char str1=s1.charAt(i);
    	   char str2=s2.charAt(i);
    	   if(str1!=str2)break;
    	   s=s+str2;
       }
       return s;
    }

public static void main(String[] args) {
	String s[]= {"dog","racecar","car"};
	System.out.println(longestCommonPrefix(s));
}
}
