package in.com.inheritance;

public class Shape {
	
	private String color;
	private int borderWidth;
	
	public String getcolor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color=color;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public void setBorderWidth(int borderWidth) {
		this.borderWidth=borderWidth;
	}
	public void area() {
		System.out.println("Shape Area Method");
	}

}
