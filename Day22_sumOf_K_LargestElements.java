package cc365;

import java.util.PriorityQueue;

public class Day22_sumOf_K_LargestElements {
	public static int KlargestElement(int [] arr,int k)
	{
		
		PriorityQueue<Integer>heap=new PriorityQueue();
		
		for(int i=0;i<arr.length;i++)
		{
			if(i<k)
			{
				heap.add(arr[i]);
			}
			else if(arr[i]>heap.peek())
			{
				heap.poll();
				heap.add(arr[i]);
			}
		}
		int sum=0;
		while(!heap.isEmpty())
		{
			sum+=heap.poll();
		}
		return sum;
	}
	public static void main(String[] args) {
		int [] arr= {4,6,3,2};
		
		System.out.println(KlargestElement(arr, 2));
	}
}
