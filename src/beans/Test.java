package beans;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	private List fruits;
	private Set cricketers;
	private Map Capital_Country;
	public List getFruits() {
		return fruits;
	}
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public Set getCricketers() {
		return cricketers;
	}
	public void setCricketers(Set cricketers) {
		this.cricketers = cricketers;
	}
	public Map getCapital_Country() {
		return Capital_Country;
	}
	public void setCapital_Country(Map capital_Country) {
		Capital_Country = capital_Country;
	}
	
	public void displayFruits_Cricketers_CapitalCountries() {
		System.out.println("                Fruits: ");
		System.out.println("===================");
		for(Object fruit:fruits)
			System.out.println(fruit);
		System.out.println("                  Cricketers: ");
		System.out.println("===================");
		for(Object cricketer:cricketers)
			System.out.println(cricketer);
		System.out.println("                        Country                            Capital");
		System.out.println("==========================================");
		Set keys=Capital_Country.keySet();
		for(Object key:keys)
			System.out.println(key+"                      "+Capital_Country.get(key));
			
	}
}
