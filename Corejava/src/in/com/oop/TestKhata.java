package in.com.oop;

public class TestKhata {
	public static void main(String[] args) {
		
		Khata k = new Khata();
		
		k.setBalance(5000);
		
		
		
		System.out.println(k.getBalance());
		k.deposite(2000);
		k.withdrawl(4000);
		
	}
	
	

}
