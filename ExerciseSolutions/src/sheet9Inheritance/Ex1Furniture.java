package sheet9Inheritance;

public class Ex1Furniture {
	private String colour;
	private String materialType;
    public static final boolean IS_EXPANDABLE=true;
    public static final boolean IS_NOT_EXPANDABLE=false;
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
		return   
				"\nColour: " + colour +
				"\nMaterial: " + materialType;
	}

}
class Table extends Ex1Furniture {
	private boolean expand;
	private String shape;

	public Table() {

	}
	public Table(String colour, String materialType, boolean expand, String shape) {
		this();
		setExpand(expand);
		setShape(shape);
		setColour(colour);
		setMaterialType(materialType);
		//super(colour, materialType);
	}
	public boolean getExpand() {
		
		return expand;
		
	}
	public void setExpand(boolean expand) {
		if (expand==IS_EXPANDABLE)
		this.expand = expand;
		else {System.out.println("the table does not expand");}
	
	}
	public String getShape() {
		return shape;
	}
	public void setShape(String shape) {
		this.shape = shape;
	}
	@Override
	public String toString() {
		return super.toString() +
				"\nExpand: " + expand +
				"\nShape: " + shape;
	}
}


class Bed extends Ex1Furniture{
	private String size;
	private Headboard headboard;
	enum Headboard{YES, NO};
	//private boolean headboard;
	public Bed() {

	}
	public Bed(String colour, String materialType, String size, Headboard headboard) {
		this();
		setSize(size);
		setHeadboard(headboard);
		setColour(colour);
		setMaterialType(materialType);
	}

	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public Headboard getHeadboard() {
		return headboard;
	}
	public void setHeadboard(Headboard headboard) {
		this.headboard = headboard;
	}
	@Override
	public String toString() {
		return super.toString() + 
				"\nSize: " + size + 
				"\nHeadboard: " + headboard;
	}
	}

	class Chair extends Ex1Furniture{
		
		private String type;
		private boolean lift;
		public Chair() {

		}
		public Chair(String colour, String materialType, boolean lift, String type) {
			this();
			setLift(lift);
			setType(type);
			setColour(colour);
			setMaterialType(materialType);
		}

		public boolean getLift() {
			return lift;
		}

		public void setLift(boolean lift) {
			this.lift = lift;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		@Override
		public String toString() {
			return super.toString() +
					"\nLift: " + lift +
					"\nType: " + type;
		}
	}


