package in.com.oop;

public class TestPerson {
	public static void main(String[] args) {
		Person p= new Person();
		
		p.setId(211004);
		p.setFirstName("Abhijeet Singh");
		p.setLastName("Sendhav");
		
		System.out.println(p.getId());
		System.out.println(p.getFirstName());
		System.out.println(p.getLastName());
		System.out.println(Person.AVE_AGE);
	}

}
