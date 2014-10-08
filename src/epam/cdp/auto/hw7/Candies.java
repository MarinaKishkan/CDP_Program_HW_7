package epam.cdp.auto.hw7;

public class Candies extends Sweets {
	
	private String kindOfCandies;
	
	public Candies (String name, int price, int weight, String vendor, String kindOfCandies) {
		
		super(name, price, weight, vendor);
		this.kindOfCandies = kindOfCandies;
		
	}
	
	public String getKindOfCandies() {
		
		return kindOfCandies;
		
	}
	

}
