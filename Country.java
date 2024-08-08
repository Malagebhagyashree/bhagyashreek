class Country
{
    String name="India";
	String continent="Asia";
	
	 Country country=new Country("karnataka","kannada");
	
	Country()
	{
		 System.out.println("no arguements...");
	}
	
	public void details()
	{
		System.out.println("Name:" +this.name);
		System.out.println("continent:" +this.continent);
		
		this.capitalCity.Country.details();
	}

}