package in.com.rays;

public class ReverseNumber {
	public static void main(String[] args) {
		int number=234,a=0,n=number,sum=0;
		
		while(n>0) {
			a=n%10;
			sum=(sum*10)+a;
			n=n/10;
			
		}
	  System.out.println("reverse number is "+sum);
	}
}
