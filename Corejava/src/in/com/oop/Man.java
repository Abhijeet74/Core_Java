package in.com.oop;

import java.util.Date;

public class Man {
	
	 private int id;
	 private String name;
	 private Date dob;
	 public static final int AVE_AGE=18;
	 
	 public void setId(int id) {
		 this.id=id;
	 }
     public int getId() {
    	 return id;
     }
     public void setName(String name) {
    	 this.name=name;
     }
     
     public String getName() {
    	 return name;
     }
     
     public void setDob(Date dob) {
    	 this.dob=dob;
     }
     
     public Date getDob() {
    	 return dob;
     }
}
