package random;


 interface Jumpable {
	 void jump();
 }
 
 
public class Mammal {
void eat(){}
	
	public static void main(String[] args) {
	Mammal c = new Cat();
	Jumpable d = new Dog();
	//Whale m = new Mammal(); backwards
	//Jumpable w = new Whale(); does not implement Jumpable
	Mammal w1 = new Whale();
	Mammal m1 = new Mammal();
	Dog d1 = new Dog();
	
	//c.jump(); jump not in mammal
	d.jump();
	//m1.jump(); no jump();
	//w1.jump(); no jump();
	c.eat();
	m1.eat();
	//w.eat(); the line above does not compile
	
	((Dog)d).eat();
	((Jumpable)w1).jump();
	
	}

}

class Dog extends Mammal implements Jumpable {
	public void jump(){}
}

class Cat extends Mammal implements Jumpable {
	public void jump(){}
}
class Whale extends Mammal{}