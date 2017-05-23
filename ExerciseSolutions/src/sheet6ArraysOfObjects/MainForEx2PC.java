package sheet6ArraysOfObjects;

import sheet6ArraysOfObjects.Ex2PC;

public class MainForEx2PC {

	public static void main(String[] args) {
		
         
		Ex2PC pc1 = new Ex2PC();
	        System.out.println("pc1: "+pc1);
	         
	         
	        Ex2PC pc2 = new Ex2PC(Ex2PC.RamSize.RAM_8_GB, 
	        		Ex2PC.HardDrive.HARD_DRIVE_2_TB, 
	        		Ex2PC.OperatingSystem.MAC_LEOPARD, 
	        		Ex2PC.MonitorSize.MONITOR_22);
	        System.out.println(pc2);
	        
	       Ex2PC pc3 = new Ex2PC(Ex2PC.RamSize.RAM_16_GB, 
	        		Ex2PC.HardDrive.HARD_DRIVE_2_TB, 
	        		Ex2PC.OperatingSystem.MAC_LEOPARD, 
	        		Ex2PC.MonitorSize.MONITOR_27);
	        System.out.println(pc3);
	       Ex2PC pc4 = new Ex2PC(Ex2PC.RamSize.RAM_4_GB, 
	    	Ex2PC.HardDrive.HARD_DRIVE_1_TB, 
	    	Ex2PC.OperatingSystem.MAC_LEOPARD, 
	    	Ex2PC.MonitorSize.MONITOR_22);
	       System.out.println("pc4"+pc4);
	       
	       System.out.println("-------------------------");
	       System.out.println("-------------------------");
	       Ex2PC [] allPCs= {pc1, pc2, pc3, pc4};	
	       printEx2PC(allPCs);

	}
	public static void printEx2PC(Ex2PC[] arrayOfPCs ){
	for(Ex2PC onePC:arrayOfPCs)
		if(onePC.getCost()> 400){
			System.out.println(onePC);
		System.out.println("-------------------------");
		System.out.println("-------------------------");
		}
	}


}


