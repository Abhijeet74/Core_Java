package in.com.rays;

public class ArmStrong {
	public static void main(String[] args) {
		int a=153 ,r=0,b=a,sum=0;
		while(b>0) {
			r=b%10;
			sum=sum+(r*r*r);
			b=b/10;
		}
	   if(a==sum) {
		   System.out.println(a +"  it is arm strong number");
	   }
	   else {
		   System.out.println(a +"  it is not arm strong number");
	   }
	}
}
