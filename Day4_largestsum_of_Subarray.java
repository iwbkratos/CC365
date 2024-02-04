package cc365;

public class Day4_largestsum_of_Subarray {

//Kadane's algorithm
	public static int LargestsumOfSubarray(int []arr)
	{
		int largestsum=Integer.MIN_VALUE;
        int sum=0;
		for(int i=0;i<arr.length;i++)
		{
		      if(sum<=0)sum=0;
		      sum+=arr[i];
		      if(sum>largestsum)
		      {
		    	  largestsum=sum;
		      }
		}
		
		return largestsum;
	}
	public static void main(String[] args) {
		
      int [] arr= {-2,1,-3,4,-1,2,1,-5,4};
      System.out.println(LargestsumOfSubarray(arr));
	}

}
