package sheet10Inheritance;

public abstract class Ex1Shape {
	private Colour colour;
enum Colour{RED, GREEN, BLUE, YELLOW, BLACK, PINK, ORANGE, WHITE, GREY};

	public Ex1Shape(){

	}

	public Ex1Shape(Colour colour) {
		this.colour = colour;
	}

	public Colour getColour() {
		return colour;
	}

	public void setColour(Colour colour) {
		this.colour = colour;
	}

	public abstract void draw();


	@Override
	public String toString() {
		return "colour: " + colour;
	}

}
class Rectangle extends Ex1Shape{
	private int height;
	private int width;
	private int area;

	public Rectangle (){


	}
	public Rectangle(int height, int width, Colour colour) {

		this.height = height;
		this.width = width;
		setColour(colour);
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void draw(){
		
		System.out.println("I am a rectangle");
	};

	public int getArea(){
		area = height*width;
		return area;

	}

	@Override
	public String toString() {
		return super.toString() + "\nheight: " + height + "\nwidth: " + width + "\narea: " + getArea();
	}


}

class Triangle extends Ex1Shape{
	
	public Triangle(){
		
	}

	public Triangle(Colour colour){
    super(colour);
	}
	public void draw(){
		
		System.out.println("I am a triangle");
	};
	
	public String toString() {
		return super.toString();
	}
}


class Circle extends Ex1Shape{
	private int radius;
	
	public Circle(){	
	}

	public Circle(int radius, Colour colour) {
		setRadius(radius);
		setColour(colour);
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void draw(){
		
		System.out.println("I am a circle");
	};

	@Override
	public String toString() {
		return super.toString() + "\nradius: " + radius;
	}
	
	
}

