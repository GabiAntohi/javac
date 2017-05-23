package sheet6ArraysOfObjects;

public class Ex2PC {
	private RamSize ram;
    private HardDrive hardDrive;
    private OperatingSystem os;
    private MonitorSize monitorSize;
     
    private double cost;
    
    
    enum RamSize {
        RAM_4_GB, RAM_8_GB, RAM_16_GB
    }
     
    enum HardDrive {
        HARD_DRIVE_500_GB, HARD_DRIVE_1_TB, HARD_DRIVE_2_TB
    }
     
    enum OperatingSystem {
        LINUX, SOLARIS, MAC_LEOPARD, WINDOWS_7, WINDOWS_10
    }
     
    public enum MonitorSize { MONITOR_13, MONITOR_15, MONITOR_17, MONITOR_22, 
        MONITOR_27, MONITOR_32, MONITOR_36, MONITOR_46, MONITOR_55,
        MONITOR_66, MONITOR_72, MONITOR_100 };
        
	public  Ex2PC() {
		 ram = RamSize.RAM_4_GB;
	        hardDrive = HardDrive.HARD_DRIVE_500_GB;
	        os = OperatingSystem.WINDOWS_7;
	        monitorSize = MonitorSize.MONITOR_17;
	        this.cost = 350;
		

	} //how many people

	public Ex2PC(RamSize ram, HardDrive hardDrive, 
            OperatingSystem os, MonitorSize monitorSize) {
		 this();
	        setRam(ram);
	        setHardDrive(hardDrive);
	        setOs(os);
	        setMonitorSize(monitorSize);
	       
	}
	/*public Ex2PC(double cost) {
	this.cost=cost;
	       
	       
	}*/
	
	 public RamSize getRam() {
	        return ram;
	    }
	
	
	 public void setRam(RamSize ram) {
	        this.ram = ram;
	    }
	 
	    public HardDrive getHardDrive() {
	        return hardDrive;
	    }
	 
	    public void setHardDrive(HardDrive hardDrive) { 
	        this.hardDrive = hardDrive;
	    }
	 
	    public OperatingSystem getOs() {
	        return os;
	    }
	 
	    public void setOs(OperatingSystem os) {
	        this.os = os;
	    }
	 
	    public MonitorSize getMonitorSize() {
	        return monitorSize;
	    }
	 
	    public void setMonitorSize(MonitorSize monitorSize) {
	        this.monitorSize = monitorSize;
	    }
	    public double getCost(){
	    	return this.cost;
	    }
	    public double calculateCost() {
	        double calcost=350;
	    	if (ram == RamSize.RAM_8_GB)
	            calcost += 20;
	        else if (ram == RamSize.RAM_16_GB)
	            calcost += 40;
	 
	        if (hardDrive == HardDrive.HARD_DRIVE_1_TB) 
	        	calcost += 60;
	        else if (hardDrive == HardDrive.HARD_DRIVE_2_TB) 
	        	calcost += 80;
	         
	        if (os == OperatingSystem.LINUX || os == OperatingSystem.SOLARIS)
	        	calcost -= 20;
	        else if (os == OperatingSystem.MAC_LEOPARD)
	        	calcost += 10;
	        else if (os == OperatingSystem.WINDOWS_10)
	        	calcost += 40;
	         
	        switch (monitorSize) {
	        case MONITOR_13:
	        	calcost -= 40;     break;
	        case MONITOR_15:
	        	calcost -= 20;     break;
	        case MONITOR_22:
	        	calcost += 20;     break;
	        case MONITOR_27:
	        	calcost += 40;     break;
	        case MONITOR_32:
	        	calcost += 60;     break;
	        case MONITOR_36:
	        	calcost += 80;     break;
	        case MONITOR_46:    
	        	calcost += 100;    break;
	        case MONITOR_55:
	        	calcost += 120;    break;
	        case MONITOR_66: 
	        	calcost += 140;    break;
	        case MONITOR_72:
	        	calcost += 160;    break;
	        case MONITOR_100:
	        	calcost += 180;    break;
	        default: // The default is MONITOR_17;
	        	calcost += 0;
	            System.out.println("change monitor");
	            break;
	        }
	    
	        cost=calcost;
	       return calcost;
	  
	    }

	public String toString() {
		
		return "\nPC ram=" + ram + 
                "\nhardDrive=" + hardDrive +
                "\nos=" + os + 
                "\nmonitorSize="+ 
                monitorSize.toString().toLowerCase().replace('_', ' ').
                replace('m', 'M') + "\"" + "\ntoString"+
              calculateCost();
       
        
}
                
	}

