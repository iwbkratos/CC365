package cc365;
import java.util.Arrays;
public class Day25_SelectionSort {

	public static void main(String[] args) {
		int arr[]= {23,54,232,565,234};
		System.out.println(Arrays.toString(selectionsort(arr)));
	}
	
	public static int[] selectionsort(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			int pos=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[pos]>arr[j])
				{
					pos=j;
				}
			}
			swap(arr,i,pos);
		}
		return arr;
	}
	public static void swap(int arr[],int i,int pos)
	{
		int temp=arr[pos];
		arr[pos]=arr[i];
		arr[i]=temp;
		
	}
}
