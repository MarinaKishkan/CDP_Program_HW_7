package epam.cdp.auto.hw7;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.List;
import java.io.*;


public class Runner {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		List<Sweets> present = Presents.getPresent();
		
		//add different sweets to present
		present.add(new Candies("Bilochka", 15, 150, "Roshen", "Chocolate"));
		present.add(new Candies("Syauvo", 55, 250, "AVK", "Caramel"));
		present.add(new Candies("Kyiv Vechirniu", 67, 345, "Konti", "Truffile"));
		present.add(new Cookies("Pechenko", 55, 154, "Roshen", "Chocolate"));
		present.add(new Cookies("Ukrainske", 20, 100, "Konti", "Oatmeal"));
		present.add(new Marmalade("Vostochniu", 55, 140, "AVK", "Cube", "Orange"));
		present.add(new Marmalade("Esmeralda", 60, 160, "AVK", "Ball", "Apple"));

	int weight;
	weight = Presents.calculatePresentWeight(present);
		System.out.println("Weight of present is "+weight+" gramm");
	
	//Enter price
	System. out.println("Enter price");
	BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	String str = reader.readLine();
	int price = Integer.parseInt(str);
	//Enter vendor
	System. out.println("Enter vendor");
	String vendor = reader.readLine();
	
	
	String results = "";
	
	try {
		results = Presents.searchByPriceAndVendor(present, price, vendor);
	}
	
	catch(SearchException e) {
		System.out.println("You have entered invalid values: Price should be > 0, Vendor should not be empty");
	}
	
	System.out.println(results);
	
	

}

}