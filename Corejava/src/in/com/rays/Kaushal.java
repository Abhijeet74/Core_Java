package in.com.rays;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Kaushal {
	public static void main(String[] args) throws ParseException {
		String s = "11-11-21";
		System.out.println(s);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
		
		Date d = sdf.parse(s);
		
		Calendar cal = Calendar.getInstance();
		
		cal.setTime(d);
		cal.add(Calendar.DATE,5);
		
		System.out.println(sdf.format(cal.getTime()));
		
	}

}
