package googleImplementation;

public class Search {
	
	
	public String displayCoutryName(Country country) {
		
		if(country.getCountryList().contains(country.getCountryName())){
			
			return country.getCountryName();
			
		}else {
			return null;
		}
		
	}

}
