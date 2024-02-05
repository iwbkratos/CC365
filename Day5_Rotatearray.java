package cc365;
import java.util.Arrays;
import java.util.Scanner;

public class Day5_Rotatearray {

	static Scanner scn=new Scanner(System.in);
	
	public static int [] leftRotation(int arr[])
	{
		System.out.println("Enter no of rotations : ");
		int noofRotation=scn.nextInt();
		while(noofRotation>0)
		{
    //	store the first element of the array in a temp
			int temp=arr[0];
    //Iterate from the starting position replace the next position value in the curent position(left rotation)	
			for(int i=0;i<arr.length-1;i++)
			{
				arr[i]=arr[i+1];
			}
    //  swap the last element with the temp which is arr[0]			
			arr[arr.length-1]=temp;
			noofRotation--;
		}
		return arr;
	}
	public static int [] rightRotation(int[] arr)
	{
		System.out.println("Enter no of rotations : ");
		int noofRotation=scn.nextInt();
		while(noofRotation>0)
		{
    //	store the last element of the array in a temp
			int temp=arr[arr.length-1];
    //	Iterate from ending position ,replace the previous position value in the curent position(right rotation)	
			for(int i=arr.length-1;i>0;i--)
			{
				arr[i]=arr[i-1];
			}
    //  swap the first element with the temp which is arr[arr.length-1]			
			arr[0]=temp;
			noofRotation--;
		}
		return arr;
	}
	public static  int[] rotation(int []arr)
	{
		System.out.println("-->PRESS L for LeftRotation\n-->PRESS R for RightRotation");
		String ch=scn.next();
		if(ch.equalsIgnoreCase("l"))
	    return leftRotation(arr); 
		else if(ch.equalsIgnoreCase("r"))
		return rightRotation(arr); 
		return null;
	}
	public static void main(String[] args) {
		int arr[]= {1,2,3,4,5};
		System.out.println("before"+Arrays.toString(arr));
		int [] rarr=rotation(arr);
		System.out.println("after"+Arrays.toString(rarr));
	}
}
