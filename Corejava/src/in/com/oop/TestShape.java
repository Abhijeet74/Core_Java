package in.com.oop;

public class TestShape {
	public static void main(String[] args) {
		
		Shape s1=new Shape("Black",20);
		Shape s2=new Shape();
		
		System.out.println(s1.getColor());
		System.out.println(s1.getBorderWidth());
	}

}
