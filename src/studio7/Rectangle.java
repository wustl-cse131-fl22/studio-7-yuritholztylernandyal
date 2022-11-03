package studio7;

public class Rectangle {
	
	private double length;
	private double width;
	
	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public double area() {
		return this.length * this.width;
	}
	
	public double perimeter() {
		return 2 * this.length + 2 * this.width;
	}
	
	public boolean isBigger(Rectangle rect) {
		if(this.area() > rect.area()) {
			return true;
		}
		return false;
	}
	
	public boolean isSquare() {
		if(this.length == this.width) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		Rectangle rect = new Rectangle(10,10);
		Rectangle rect2 = new Rectangle(10,20);
		System.out.println(rect.area());
		System.out.println(rect.perimeter());
		System.out.println(rect.isSquare());
		System.out.println(rect2.isSquare());
		System.out.println(rect.isBigger(rect2));
	}
}
