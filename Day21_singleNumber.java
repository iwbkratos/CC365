package cc365;

public class Day21_singleNumber {
	static public int singleNumber(int[] nums) {
	       int num=0;
		  for(int i:nums)
		  {
			  num^=i;
		  }
		  return num;
	    }
	 
	 public static void main(String[] args) {
		int arr[]= {2,2,1};
		System.out.println(singleNumber(arr));
	}
}
