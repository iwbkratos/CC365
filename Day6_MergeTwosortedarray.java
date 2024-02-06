package cc365;
import java.util.Arrays;

public class Day6_MergeTwosortedarray {
public static int[] mergedarray(int a[],int []b)
{
	int size=a.length+b.length;
	int mergedarray[]=new int[size];
	int a1=0;
	int a2=0;
	int ma=0;
	if(a[a1]<b[a2])
	{
		while(a1<a.length)
		{
			mergedarray[ma]=a[a1];
			ma++;
			a1++;
		}
	}
	else
	{
		while(a2<b.length)
		{
			mergedarray[ma]=b[a2];
			ma++;
			a2++;
		}
	}
	while(a1<a.length)
	{
		mergedarray[ma]=a[a1];
		ma++;
		a1++;
	}
	while(a2<b.length)
	{
		mergedarray[ma]=b[a2];
		ma++;
		a2++;
	}
	Arrays.sort(mergedarray);
     return mergedarray;
}

 public static void main(String[] args) {
	
	 int [] a= {1,2,3,4};
	 int []b= {5,6};
	 
	System.out.println(Arrays.toString( mergedarray(a,b )));
}

}
