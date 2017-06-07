package sheet13Pets;



public class Owner {
	private String name;
	private String address;
	private String phone;
	private Pets[] pets;
	public Owner(){

	}

	public Owner(String name, String address, String phone, Pets[] pets) {
		super();
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.pets = pets;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Pets[] getPets() {
		return pets;
	}

	public void setPets(Pets[] pets) {
		this.pets = pets;
	}

	@Override
	public String toString() {
		String text = "*** Owner ***"+ 
				"\nName: " + name;
		text += "\nAddress: " + address;
		text += "\nPhone no.: " + phone;

		for (int i = 0; i < pets.length; i++) {
			text += "\n" + (i + 1) + ": " + pets[i];
		}
		return text;        
	}




}
