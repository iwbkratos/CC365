package cc365;

public class Day20_findtheDifference {

	static public char findTheDifference(String s, String t) {
	       
		 int countOfs=0;
		 int countOft=0;
		 
		 for(char c :s.toCharArray())
		 {
			 countOfs+=c;
		 }
		 for(char c:t.toCharArray())
		 {
			 countOft+=c;
		 }
		 return (char)(countOft-countOfs);
	    }
	public static void main(String[] args) {
		String s="a";
		String t="aa";
		System.out.println(findTheDifference(s, t));
	}
}
