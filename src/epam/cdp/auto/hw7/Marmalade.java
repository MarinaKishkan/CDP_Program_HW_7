package epam.cdp.auto.hw7;

public class Marmalade extends Sweets {
	
	private String shape;
	private String flavor;
	
	public Marmalade (String name, int price, int weight, String vendor, String shape, String flavor) {
		
		super(name, price, weight, vendor);
		this.shape = shape;
		this.flavor = flavor;
	}
	
	public String getShape() {
		
		return shape;
		
	}
	
	public String getFlavor() {
		
		return flavor;
		
	}
	

}
