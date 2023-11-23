package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TestCalendar {
	public static void main(String[] args) throws ParseException {
		String s="12/10/2023";
		
		System.out.println(s);
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		
		Date d=sdf.parse(s);
		
		Calendar cal=Calendar.getInstance();
		cal.setTime(d);
		
		for(int i=1;i<=12;i++) {
			cal.add(Calendar.DATE,30);
			
		System.out.println(sdf.format(cal.getTime()));	
		}
   }

}
