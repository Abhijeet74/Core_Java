package in.com.oop;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TestMan {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Man m=new Man();
		
		m.setId(10);
		m.setName("Abhijeet Singh");
		m.setDob(sdf.parse("02/03/2004"));
		
		System.out.println(m.getId());
		System.out.println(m.getName());
		System.out.println(sdf.format(m.getDob()));
		System.out.println(Man.AVE_AGE);
	}

}
