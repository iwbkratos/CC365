package cc365;

public class Day15_addDigit {

	public static int addDigits(int num) {
        if(num>=0&&num<=9)
        return num;
        int sum=0;
        while(num>0)
        {
          sum+=num%10;
          num/=10;
        }
       return addDigits(sum);
    }
	public static void main(String[] args) {
		
		System.out.println(addDigits(89));
	}
}
