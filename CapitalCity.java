class CapitalCity
{
   String name;
   long population;
   
   CapitalCity()
	{
		System.out.println("Created CapitalCity.....");
	}
	
	CapitalCity(String name,long population)
	{
		this.name=name;
		this.population=population;
	
		System.out.println("initialized the instance variables.....");
	}
	
	public void details()
	{
	 System.out.println("Name:" +this.name);
	 System.out.println("population:" +this.population);
	 
	}

}