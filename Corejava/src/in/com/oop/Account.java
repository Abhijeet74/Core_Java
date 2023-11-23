package in.com.oop;

public class Account {
	
	private int Number;
	private String Name;
	private int Balance;
	private int Withdrwal;
	public static final int DEPOSIT_BALANCE=2000;
	
	public void setNumber(int Number) {
		this.Number=Number;
	}
	public int getNumber() {
		return Number;
	}
	public void setName(String Name) {
		this.Name=Name;
	}
	public String getName() {
		return Name;
	}
	public void setBalance(int Balance) {
		this.Balance=Balance;
	}
	public int getBalance() {
		return Balance;
	}
	public void setWithdrwal(int Withdrwal) {
		this.Withdrwal=Withdrwal;
	}
	public int getWithdrwal() {
		return Withdrwal;
		
	}
	

}
