package in.com.oop;

public class TestAccount {
	public static void main(String[] args) {
		
		Account a = new Account();
		
		a.setNumber(385624317);
		a.setName("Abhijeet Singh Sendhav");
		a.setBalance(2550);
		a.setWithdrwal(550);
		
		System.out.println(a.getNumber());
		System.out.println("Name=="+ a.getName());
		System.out.println("Balance=="+a.getBalance());
		System.out.println("Withdrawl=="+a.getWithdrwal());
		
		
		
		
	}

}
