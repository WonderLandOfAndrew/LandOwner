package LandOwner;

public class main {

	public static void main(String[] args) {
		Land rectangle = new Rectangle(2, 4);
		Land square = new Square(2);
		Land circle = new Circle(3.14, 2);
		Land triangle = new Triangle(6, 4, 2, 1);
		LandOwner John = new LandOwner();
		John.add(rectangle);
		System.out.println(John.computeTotalAria());
		John.add(triangle);
		John.add(circle);
		John.add(square);
		System.out.println(John.computeTotalAria());
		

	}

}
