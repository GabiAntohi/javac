package sheet5Classes;



public class Ex4EmailAccount {
	private String name;
	private String address;
	private String password;
	private int storage;
	public static int numberCounter = 0;
	public static final int STORAGE_255_GB=1;
	public static final int STORAGE_500_GB=2;
	public static final int STORAGE_1_T=3;

	public Ex4EmailAccount() {
		numberCounter++;

	} //how many people
	public Ex4EmailAccount(String name, String address, String password, int storage) {
		this();  
		setName(name);
		setAddress(address);//calls method!!!!!!!
		setPassword(password);
		setStorage(storage);

	}
	public void setName(String name) {
		this.name = name;
	}
	public void setAddress(String address) {
		String regex = "[\\w.]+@[\\w-]+\\.[a-zA-Z]{2,}";
		//if(address.contains("@")&&address.contains(".")&&
			//address.indexOf("@")<address.lastIndexOf("."))
			if(address.matches(regex))
		this.address = address;
		
			else {System.out.println("error");}
	}

	public void setPassword(String password) {
		password = password.trim();
		if(password.length()>=20)
			this.password = password;
	

	}
	public void setStorage(int storage) {
		this.storage = storage;

	}

	public String getName() {
		return name;
	}
	public String getAddress() {
		return address;
	}
	public String getPassword() {
		return password;
		
	}
	public int getStorage() {
		return storage;
	}
	public String getStoragesString() {
		switch (storage) {
		case STORAGE_255_GB:
			return "255 GB storage";
		case STORAGE_500_GB:
			return "500 GB storage";
		case STORAGE_1_T:
			return "1 T storage";
		default:
			return "choose a DIFFERENT SIZE";
		}
	}

	public String toString() {
		return "\n\nName: " + name + 
				"\nEmail Address: "+ address +
				"\nStorage: " +  getStoragesString() + 
				"\nPassword: " + password +
				"\nNumber of customers: " + numberCounter;

		
	}
	

}
