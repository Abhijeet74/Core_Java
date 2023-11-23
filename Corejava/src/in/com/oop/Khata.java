package in.com.oop;

public class Khata {
	
	private int balance;
	
	public void setBalance(int balance) {
		this.balance=balance;
	}
	public int getBalance() {
		return balance;
	}
	public void deposite(int amount) {
		
		setBalance(getBalance() + amount);
		
		System.out.println("balance after deposite=" + getBalance());
	}
	public void withdrawl(int amount) {
		
		int total = getBalance() - amount;
	
	if(total<2000) {
		System.out.println("Low Balance...!!!");
	}else {
		
		setBalance(total);
		
		System.out.println("Balance after withdrawl=" + getBalance());
	}
  }
}
