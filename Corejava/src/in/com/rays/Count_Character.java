package in.com.rays;

public class Count_Character {
	public static void main(String[] args) {
		String name="abhijeet thakur";
		int count=0;
		for(int i=0;i<name.length();i++) {
			if(name.charAt(i)=='z') {
				count++;
			}
		}
		System.out.println("count = "+count);
	}

}
