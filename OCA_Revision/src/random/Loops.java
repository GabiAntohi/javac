package random;

public class Loops {

	public static void main(String[] args){
		int[] dat1 = {1, 2, 3, 4, 5};
		for (int i : dat1) {
			if (i < 2) { 
				continue;
			}
			System.out.print(i);

			if (i == 3){
               continue; //or nothing

			}

		}
	}
}

