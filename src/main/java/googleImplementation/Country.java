package googleImplementation;

import java.util.ArrayList;
import java.util.List;

public class Country {
	
	private String CountryName;
	private String population;
	/**
	 * @param countryName
	 * @param population
	 */
	public Country(String countryName, String population) {
		
		
		CountryName = countryName;
		this.population = population;
	}
	
	public String getCountryName() {
		return CountryName;
	}
	
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	
	public String getPopulation() {
		return population;
	}
	
	public void setPopulation(String population) {
		this.population = population;
	}
	
	
	public List<String> getCountryList() {
		
		List<String> countryList = new ArrayList<String>();	
		
		countryList.add("Azerbaycan");
		countryList.add("Turkey");
		countryList.add("USA");
		countryList.add("India");
		countryList.add("Canada");
		countryList.add("Germany");
		countryList.add("Sweden");
		countryList.add("Italy");
	
		return countryList;
		
		
		
		
		
		
	}
	
	
	
	

}
