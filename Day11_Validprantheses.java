package cc365;

import java.util.Stack;

public class Day11_Validprantheses {
		 public static boolean isValid(String s) {
		      if(s.length()%2!=0)return false;
		      Stack<Character> st=new Stack<>();
		      for(int i=0;i<s.length();i++)
		      {
		          char ch=s.charAt(i);
		         if(ch=='{'||ch=='('||ch=='[')
		         {
		             st.push(ch);
		             continue;
		         }
		         if(st.isEmpty())return false;
		         if((st.peek()=='{'&&ch=='}')||(st.peek()=='('&&ch==')')||(st.peek()=='['&& ch==']'))
		         st.pop();
		         else{
		             return false;
		         }
		        
		      }
		      return st.isEmpty();
	}
		 public static void main(String[] args) {
			String s="[}";
			System.out.println(isValid(s));
		}
}
