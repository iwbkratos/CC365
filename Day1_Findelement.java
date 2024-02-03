package cc365;

public class Arrays {
	public static void main(String[] args) {
		System.out.println(findElement(2));
	}

	private static int findElement(int ele) {
	  int [] arr= {5,6,4,3,2,3,67};
	  for(int i=0;i<arr.length;i++)
	  {
		  if(arr[i]==ele)
		  {
			  return i;
		  }
	  }
	  return -1;
	}
}
