package sheet4Arrays;

import javax.swing.JOptionPane;

public class Ex7OrderingSystem {

	public static void main(String[] args) {
		int[]refNums = {1000, 1001, 1002, 1003, 1004};
		String[]productNames = {"Keyboard", "Mouse   ", "Monitor  ", "Mouse mat", "Speakers"};
		double[]prices = {49.99, 15.50, 124.99, 3.99, 23.50};
		System.out.println("Reference Number "+"\tProduct Name "+ "\t\tPrice" + "\n" + "----------------" + "\t-------------" + "\t\t---------");
		for(int i=0; i<refNums.length; i++){
			System.out.println( refNums[i] + "\t\t\t" + productNames[i] + "\t\t€ " + prices[i]);}

		String input = JOptionPane.showInputDialog(
				"Please enter a Reference Number");	
		int nums =Integer.parseInt(input);
		for(int i=0; i<refNums.length; i++){
			if (nums==refNums[i])
			{JOptionPane.showMessageDialog(null, "That is a  " + productNames[i] + " and it costs €"+ prices[i]);}	
		}

		String input1 = JOptionPane.showInputDialog(
				"How many would you like to order?");		
		int nums1 =Integer.parseInt(input1);
		for(int i=0; i<refNums.length; i++){
			if (nums==refNums[i])
			{JOptionPane.showMessageDialog(null, "The total cost of your order is  " +nums1*prices[i]);}	


		}

	}
}





