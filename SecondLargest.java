package cc365;

public class SecondLargest {

	public static void main(String[] args) {
		int [] arr= {3,4,5,3,2,2};
    SecLargest(arr);
	}
  public static void SecLargest(int[] arr)
  {
	  int fmax=Integer.MIN_VALUE;
	  int smax=Integer.MIN_VALUE;
	  
	  for(int i=0;i<arr.length;i++)
	  {
		  if(fmax<arr[i])
		  {
			smax=fmax; 
			fmax=arr[i];
		  }
		  else if(smax<arr[i] && fmax>arr[i])
		  {
			  smax=arr[i];
		  }
		  
	  }
	  System.out.println(smax);
  }
  
}
