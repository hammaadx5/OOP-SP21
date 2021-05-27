public class Circle implements Shape {
	double radius;

	Circle(double radius) {
		this.radius = radius;

	}

	public double area() {
		double area = 0.5* 3.14 * (radius * radius);
		return area;

	}
	

}