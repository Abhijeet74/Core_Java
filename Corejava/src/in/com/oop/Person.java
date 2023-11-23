package in.com.oop;

public class Person {
	
	private int id;
	private String firstName;
	private String lastName;
	public static final int AVE_AGE=20;
	
	public void setId(int id) {
		this.id=id;
	}
	
	public int getId() {
		return id;
   }
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}
	 public String getFirstName() {
		 return firstName;
	 }
	 
	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	 public String getLastName() {
		 return lastName;
	 }
}
