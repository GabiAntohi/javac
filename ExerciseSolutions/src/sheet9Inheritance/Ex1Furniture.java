package sheet9Inheritance;

public class Ex1Furniture {
private String colour;
private String materialType;

public Ex1Furniture() {
	
}
public Ex1Furniture(String colour, String materialType) {
	this();
	setColour(colour);
	setMaterialType(materialType);
}

public String getColour() {
	return colour;
}
public void setColour(String colour) {
	this.colour = colour;
}
public String getMaterialType() {
	return materialType;
}
public void setMaterialType(String materialType) {
	this.materialType = materialType;
}
@Override
public String toString() {
	return "Furniture "
			+ "\ncolour:" + colour +
			"\nmaterial: " + materialType;
}

}
