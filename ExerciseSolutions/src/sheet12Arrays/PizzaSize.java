package sheet12Arrays;

public enum PizzaSize {
    
	SMALL(7, 1.0),   
    MEDIUM(9, 1.2),
    LARGE(12, 1.5),
    EXTRA_LARGE(16,2.0);
     
    private int basePrice;
    private double pricePerTopping;
    private int diameter;
     
    private PizzaSize(int basePrice, double pricePerTopping) {
        this.basePrice = basePrice;
        this.pricePerTopping = pricePerTopping;
    }
     
    public int getBasePrice() {
        return basePrice;
    }
     
    public double getPricePerTopping() {
        return pricePerTopping;
    }
 

}
