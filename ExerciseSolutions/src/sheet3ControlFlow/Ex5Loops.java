
package sheet3ControlFlow;
public class Ex5Loops{
    public static void main(String [] args){
	int h = 7;
	int b = 3;
	Ex5Loops ex5 = new Ex5Loops();
	ex5.calculateArea(h, b);
    
	}
	public void calculateArea(int h, int b) {
	int getArea = h*b;
	int getPerimeter = 2*(h+b);
	System.out.println("The area is " + getArea + " and the length of the perimeter is " + getPerimeter);
	
	
	
	if(h==b){
	System.out.println("it's a square");
	}
	else {
	System.out.println("it's a rectangle ");
	
	}
	
	/*
	while(h==b){
	System.out.println("the area and perimeter of the square are: " + getArea + "and" + getPerimeter);
	}
	while(h!=b){
	System.out.println("the area and perimeter of the rectangle are: " + getArea + "and" + getPerimeter);
	b++;
	}
	}
	
	*/
	
	}
	}