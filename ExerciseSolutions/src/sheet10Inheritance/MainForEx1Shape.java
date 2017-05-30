package sheet10Inheritance;



public class MainForEx1Shape {

	public static void main(String[] args) {
		
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
		Ex1Shape[] allShapes = {r, t, c, t1, c1, r1, r2};
		printEx1Shape(allShapes);

	}
	public static void printEx1Shape(Ex1Shape[] allShapes){	
		for(Ex1Shape one:allShapes)	
			if (one instanceof Circle)
			{System.out.println("circle radius: " + ((Circle)one).getRadius());}
			else if (one instanceof Rectangle)
			{System.out.println("Rectangle area: " + ((Rectangle)one).getArea());};
			System.out.println("-------------------------");
			for(Ex1Shape one:allShapes)	
				System.out.println(one.getColour());
			System.out.println("-------------------------");
			for(Ex1Shape one:allShapes)// for draw method, don't print	
		     one.draw();
			System.out.println("-------------------------");
			System.out.println("-------------------------");
	}


}





