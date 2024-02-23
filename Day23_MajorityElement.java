package cc365;

public class Day23_MajorityElement {
	static public int majorityElement(int[] nums) {
        int ele=0;
        int c=0;
        for(int i : nums)
        {
            if(c==0)
            {
                ele=i;
                c=1;
            }
            else if(ele==i)
            {
                c++;
            }
            else
            {
                c--;
            }
        }
        return ele;
    }
	
	public static void main(String[] args) {
		int arr[]= {1,1,1,2,3,3,5};
		
		System.out.println(majorityElement(arr));
	}
}
