package cc365;

import java.lang.module.FindException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day3_FindfactorsOftheElement {
  public static List<Integer> findFactors(int ele)
  {
	  List<Integer>Factors=new ArrayList<>();	
	  for(int i=1;i<=ele;i++)
	  {
		  if(ele%i==0)
		  {
			  Factors.add(i);
		  }
	  }
	  return Factors;
  }
  public static Map<Integer,List<Integer>>findFactors(int[] arr )
  {
	  Map<Integer,List<Integer>>ListofFactors=new HashMap<>();
	     for(int i=0;i<arr.length;i++)
	     {
	    	 int ele=arr[i];
	         ListofFactors.put(ele,findFactors(ele));
	     }
	    return ListofFactors;
  }
	public static void main(String[] args)
	{
		 int [] arr= {12,10,16};
		 System.out.println(findFactors(arr));
	}

}
