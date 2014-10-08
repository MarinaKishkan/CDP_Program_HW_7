package epam.cdp.auto.hw7;

public class Sweets {
	
	protected String name;
	protected int price;
	protected int weight;
	protected String vendor;
	
	public Sweets(String name, int price, int weight, String vendor) {
		
		this.name = name;
		this.price = price;
		this.weight = weight;
		this.vendor = vendor;
	}
	
   public String getName() {
		
		return name;
		
	}


	
	public int getPrice() {
		
		return price;
		
	}
	
	public int getWeight() {
		
		return weight;
		
	}
	
	public String getVendor() {
		
		return vendor;
		
	}

}
