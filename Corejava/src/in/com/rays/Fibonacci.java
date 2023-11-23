package in.com.rays;

public class Fibonacci {
	public static void main(String[] args) {
		
	
	int x=0,y=1,z;
	
	System.out.println(x+"\n"+y);
	for(int i=1;i<=10;i++) {
	  z=x+y;
	  System.out.println(""+z);
	  x = y;
	  y =z;
		
		
	}
	}

}
