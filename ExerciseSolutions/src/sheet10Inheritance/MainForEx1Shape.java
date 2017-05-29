package sheet10Inheritance;

import sheet6ArraysOfObjects.Ex2PC;

public class MainForEx1Shape {

	public static void main(String[] args) {
		Ex1Shape shape = new Ex1Shape();
		shape.draw();
		System.out.println("--------------------");

		Rectangle r = new Rectangle(13, 18, Rectangle.Colour.BLACK );
		r.draw();
		System.out.println(r);
		System.out.println("--------------------");
		Rectangle r1 = new Rectangle(23, 15, Rectangle.Colour.BLACK);
		r1.draw();
		System.out.println(r1);
		System.out.println("--------------------");
		Rectangle r2 = new Rectangle(30, 10, Rectangle.Colour.GREY);
		r2.draw();
		System.out.println(r2);
		System.out.println("--------------------");
		System.out.println("--------------------");
		Triangle t = new Triangle(Triangle.Colour.BLUE);
		t.draw();
		System.out.println(t);
		System.out.println("--------------------");
		Triangle t1 = new Triangle(Triangle.Colour.PINK);
		t1.draw();
		System.out.println(t1);
		System.out.println("--------------------");
		System.out.println("--------------------");
		Circle c = new Circle(20, Circle.Colour.ORANGE);
		c.draw();
		System.out.println(c);
		System.out.println("--------------------");
		Circle c1 = new Circle(30, Circle.Colour.PINK);
		c1.draw();
		System.out.println(c1);
		
		System.out.println("-------------------------");
		System.out.println("-------------------------");	
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		Ex1Shape[] allShapes = {r, t, c, shape, t1, c1, r1, r2};
		printEx1Shape(allShapes);
		
	}
public static void printEx1Shape(Ex1Shape[] arrayOfShapes){
	for(Ex1Shape oneShape:arrayOfShapes)
			System.out.println(oneShape.getColour());
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		}
	
	
}
	
	
	
	

