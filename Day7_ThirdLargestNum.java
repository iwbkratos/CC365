package cc365;

public class Day7_ThirdLargestNum {
	 public static int thirdMax(int[] nums) {
		 long fmax=Long.MIN_VALUE;
	        long smax=Long.MIN_VALUE;
	        long tmax=Long.MIN_VALUE;
	        if(nums.length==1)
	        	return nums[0];
	        for(int i=0;i<nums.length;i++)
	        {
	            if(fmax<nums[i])
	            { 
	              tmax=smax;
	              smax=fmax;
	              fmax=nums[i];
	            }
	            else if(nums[i]<fmax&&nums[i]>smax)
	            {
	               tmax=smax;
	               smax=nums[i];
	            }
	            else if(nums[i]<fmax&&nums[i]<smax&&nums[i]>tmax)
	            {
	                tmax=nums[i];
	            }
	            
	        }
	        if(tmax==Long.MIN_VALUE)
	        { return (int)fmax;}
	        return (int)tmax;
	    }
	 public static void main(String[] args) {
		int arr[]= {1,2};
		 int num=thirdMax(arr);
		 System.out.println(num);
	}
}
