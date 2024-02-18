package cc365;

public class Day18_toLowercase {

	 public String toLowerCase(String s) {
	        String str="";
	        for(int i=0;i<s.length();i++)
	        {
	            char ch=s.charAt(i);
	          if(ch>='A' && ch<='Z')
	          {
	           ch=(char)(s.charAt(i)+32);
	          }
	          str+=ch;
	          
	        }
	        return str;
	    }
}
