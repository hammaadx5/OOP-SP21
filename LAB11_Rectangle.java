public class Rectangle implements Shape {
	public int length, width;

	public Rectangle(int length, int width) {
		this.length = length;
		this.width = width;

	}

	public double area() {
		double area = length * width;
		return area;
	}
	

}