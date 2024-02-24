package cc365;
import java.util.Arrays;
public class Day24_Bubble_Sort {

	public static void main(String [] args)
	{
		int arr[]= {34,243,2343,34,423};
      System.out.println(Arrays.toString(bubblesort(arr)));
	}
	public static int[] bubblesort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					swap(arr,j,j+1);
				}
			}
		}
		return arr;
	}
	
	public static void swap(int arr[],int i,int j)
	{
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
}
