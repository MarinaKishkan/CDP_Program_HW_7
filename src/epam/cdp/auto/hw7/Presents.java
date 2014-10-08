package epam.cdp.auto.hw7;
import java.util.ArrayList;
import java.util.List;

public class Presents {
	
	private static ArrayList<Sweets> present;
	
	
	public static List<Sweets> getPresent() {
		
		if (present == null)
		{
		present = new ArrayList<Sweets>();
		}
		return new ArrayList<Sweets>();
		
	}
	
	public static int calculatePresentWeight(List<Sweets> presents)
	{
	int presentWeight = 0;
	for(Sweets p : presents)
	{
	presentWeight += p.getWeight();
	}
	return presentWeight;
	}
	
	public static String searchByPriceAndVendor(List<Sweets> presents, int price, String vendor) throws SearchException
	{
	List<Sweets> results = new ArrayList<Sweets>();	//collection of sweets which satisfy search criteria
	for(Sweets p : presents)
	{
	if ((p.getPrice() == price)&&(p.getVendor().equals(vendor)))
	{
	results.add(p);
	}
	if ((price<0)||(vendor.equals(""))) {
		throw new SearchException("");
	}
	
	}
	
	String searchResults = "";	//this string will be returned as result of search
	if (results.size() != 0)
	{
	for(Sweets r : results)
	{
	searchResults += r.getName();
	}
	return searchResults;
	} else {	
		return "There is no sweets with price " + price + " and vendor " + vendor;
	}
	
	}

}
