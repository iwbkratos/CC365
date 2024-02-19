package cc365;
import java.util.Arrays;
public class Day19_indexElement {

	public static int[] indexElement(int arr[])
	{
	   for(int i=0;i<arr.length;i++)
	   {
		   for(int j=0;j<arr.length;j++)
		   {
			   if(arr[j]==i)
			   {
				   int temp1=arr[i];
				   arr[i]=arr[j];
				   arr[j]=temp1;
			   }
			   else if(arr[j]>arr.length-1)
			   {
				   int temp1=arr[i];
				   arr[i]=arr[j]=-1;
				   arr[j]=temp1;
			   }
		   }
	   }
	   return arr;
	}
	public static void main(String[] args) {
		int arr[]= {2,3,4,6,7};
		System.out.println(Arrays.toString(indexElement(arr)));
	}
}
