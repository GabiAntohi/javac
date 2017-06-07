package sheet13Pets;

public class MainForOwnerPets {

	public static void main(String[] args) {
		Cat c = new Cat("Missy", "burmese", 2, "beige", Pets.FEMALE, "8888", Dog.IS_MICRO_CHIPPED , 6);	
		System.out.println(c);
		System.out.println("---------------------------");
		Dog d = new Dog("Paul", "husky", 5, "black", Pets.MALE, "hdgyhtfyf");
		System.out.println(d);
		Dog d1 = new Dog("Lady", "cocker", 15, "red", Pets.FEMALE, "123");
		System.out.println(d1);
		System.out.println("---------------------------");
		Snake s = new Snake("Don", "python", 2, "beige", Pets.FEMALE);
		System.out.println(s);
		System.out.println("---------------------------");
		Hamster h = new Hamster("Missy", "rat", 6, "blue", Pets.FEMALE);
		System.out.println(h);
		h.sleep();
		System.out.println("---------------------------");
		System.out.println("---------------------------");

		Owner o= new Owner("Jon Jon", "45 Kildare st., Dublin 2", "098765554",
				new Pets[]{c, d} );
		System.out.println(o);

		System.out.println("---------------------------");
		System.out.println("---------------------------");


		Owner o1= new Owner("Kat Malone", "45 Kildare st., Dublin 2", "098765554",
				new Pets[]{s, h} );
		System.out.println(o1);
		
		System.out.println("---------------------------");
		System.out.println("---------------------------");
		
		Owner o2= new Owner("Jane Jon", "127 Bold st., Dublin 12", "09wrfr765554",
				new Pets[]{new Dog("Paul", "husky", 4, "red", Pets.MALE), d1} );
		System.out.println(o2);
		
		Pets[] allpets = {c, d, d1, s, h};
		for (Pets onepet:allpets)
		{
			
			if (onepet instanceof Mammal)
			((Mammal)onepet).eat();
			if (onepet instanceof Dog)
				System.out.println("Microchip no.: "+((Dog)onepet).getMicroChipNumber());
			
	
		}
	
		}
		
}

