package arrayLists;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Ex2ArrayListOfTrainees {
private String name;
private String address;
private LocalDate dateOfBirth;
public Ex2ArrayListOfTrainees(){
	
}

public Ex2ArrayListOfTrainees(String name, String address, LocalDate dateOfBirth) {
	super();
	this.name = name;
	this.address = address;
	this.dateOfBirth = dateOfBirth;
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

public LocalDate getDateOfBirth() {
	return dateOfBirth;
}

public void setDateOfBirth(LocalDate dateOfBirth) {
	this.dateOfBirth = dateOfBirth;
}



@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ex2ArrayListOfTrainees other = (Ex2ArrayListOfTrainees) obj;
	if (address == null) {
		if (other.address != null)
			return false;
	} else if (!address.equals(other.address))
		return false;
	if (dateOfBirth == null) {
		if (other.dateOfBirth != null)
			return false;
	} else if (!dateOfBirth.equals(other.dateOfBirth))
		return false;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}

@Override
public String toString() {
	 DateTimeFormatter formatter =
             DateTimeFormatter.ofPattern("dd/MM/yyyy");
	return "\nName of Trainee:\n" + name +
     "\nAddress: " + address +
     "\nDate Of Birth: " + getDateOfBirth().format(formatter);
}





}
