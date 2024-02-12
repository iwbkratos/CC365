package cc365;
import java.util.Arrays;
public class Day12_moveZeros {
	 public static int[] moveZeroes(int[] nums) {
	        int index=0;
	        for(int i=0;i<nums.length;i++)
	        {
	          if(nums[i]!=0)
	          {
	              nums[index]=nums[i];
	              index++;
	          }
	        } 
	        while(index<nums.length)
	        {
	            nums[index]=0;
	            index ++;
	        }
	        return nums;
	    }
	 public static void main(String[] args) {
		int arr[]= {0,1,2,4,0,0,1};
		System.out.println(Arrays.toString(moveZeroes(arr)));
	}
}
