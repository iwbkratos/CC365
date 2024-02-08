package cc365;
import java.util.Arrays;
public class Day8_plusOne_Leetcode {
	public static int[] plusOne(int[] digits) {
        int [] arr=new int [(digits[digits.length-1]==9)?digits.length+1:digits.length];
        if(digits[digits.length-1]<9)
        {
        	digits[digits.length-1]+=1;	
        	return digits;
        }
        else {	
        for (int i = digits.length - 1; i >= 0; i--) {
        	if (digits[i] < 9) {
        		digits[i]+=1;
        		return digits;
        		}
        		digits[i] = 0;
        	}

        	digits = new int[digits.length + 1];
        	digits[0] = 1;
        	return digits;
     }
	}
	public static void main(String[] args) {
		int arr[]= {4,3,9,9};
		System.out.println(Arrays.toString(plusOne(arr)));
	}
}
