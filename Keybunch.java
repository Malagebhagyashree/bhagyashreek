class Keybunch
{
    String material;
	Key key;
	
	Keybunch(String material,Key key)
	{
		this.material=material;
		this.key=key;
		System.out.println("created keybunch");
	}
  
  public void details()
  {
	  
	  System.out.println("material:" +this.material);
	  
	  key.details();
	  
  }
}