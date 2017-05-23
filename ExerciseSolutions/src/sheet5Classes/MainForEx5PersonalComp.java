package sheet5Classes;

public class MainForEx5PersonalComp {

	public static void main(String[] args) {
		Ex5PersonalComp p4 = new Ex5PersonalComp(Ex5PersonalComp.RAM_8_GB, Ex5PersonalComp.HARD_255_GB, "win10", Ex5PersonalComp.MONITOR_10_INCH, 0);
		System.out.println(p4);  // g1.toString()	

		Ex5PersonalComp p5 = new Ex5PersonalComp(Ex5PersonalComp.RAM_8_GB, Ex5PersonalComp.HARD_500_GB, "win10", Ex5PersonalComp.MONITOR_15_INCH, 0);
		System.out.println(p5);  

		Ex5PersonalComp p6 = new Ex5PersonalComp(Ex5PersonalComp.RAM_4_GB, Ex5PersonalComp.HARD_125_GB, "win10", Ex5PersonalComp.MONITOR_10_INCH, 0);
		System.out.println(p6);  

		Ex5PersonalComp p7 = new Ex5PersonalComp(Ex5PersonalComp.RAM_8_GB, Ex5PersonalComp.HARD_1_T, "win10", Ex5PersonalComp.MONITOR_13_INCH, 0);
		System.out.println(p7);  



	}

}
