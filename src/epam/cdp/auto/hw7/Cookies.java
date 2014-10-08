package epam.cdp.auto.hw7;

public class Cookies extends Sweets {
	
	private String kindOfCookies;
	
	public Cookies (String name, int price, int weight, String vendor, String kindOfCookies) {
		
		super(name, price, weight, vendor);
		this.kindOfCookies = kindOfCookies;
		
	}
	
	public String getKindOfCookies() {
		
		return kindOfCookies;
		
	}

}
