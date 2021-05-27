public class Runner {

	public static void main(String[] args) {
		Shape[] Object = new Shape[3];
		Object[0] = new Circle(6.9);
		Object[1] = new Rectangle(21, 13);
		Object[2] = new Triangle(15, 3);
		double totalArea[] = CalculateArea.totalArea(Object);
		for (double area : totalArea) {
			System.out.println(area);
		}

	}
        

}