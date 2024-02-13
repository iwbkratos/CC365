package cc365;
import java.util.Arrays;
public class Day13_Length_of_Lastword {

	 static public int lengthOfLastWord(String s) {
	        
		 String str="";
	        for(int i=s.length()-1;i>=0;i--)
	        {
	          if(str.length()>0 && s.charAt(i)==' ')
	          {
	              return str.length();
	          }
	          if(s.charAt(i)!=' ')str+=s.charAt(i);

	        }
	        return str.length();
	    }
	 public static void main(String[] args) {
		
		 String s ="luffy is still joyboy";
		 String st="";
		 
		 System.out.println(lengthOfLastWord(s));
	}
}
