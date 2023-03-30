package studio7;

public class Rectangle {
	private int length;
	private int width;
	
	public Rectangle(int length, int  width) {
		this.length = length;
		this.width = width;
	}
	
	public int getArea() {
		return this.length * this.width;
	}
	
	public int getPerimeter() {
		return this.length*2 + this.width*2;
	}
	
	public boolean hasSmallerArea (Rectangle other){
		if (other.getArea() > this.getArea()) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSquare() {
		if (this.length == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public static void main(String[] args) {
		Rectangle rec1 = new Rectangle (3,4);
		Rectangle rec2 = new Rectangle (4,4);
		System.out.println(rec1.getArea());
		System.out.println(rec1.hasSmallerArea(rec2));

	}

}
