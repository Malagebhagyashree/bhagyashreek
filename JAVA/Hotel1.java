class Hotel1{
	public static String itemname(double price)
	{
	System.out.println("start to take itemname");
	
		if(price==25)
		{
			return "idli";
		}
		if(price==35)
		{
			return "vada";
		}
System.out.println("end to take itemname");
	return "not found";
	}
	
	public static String shop(int quantity)
	{
	System.out.println("start shop in hotels");
if(quantity>1 && quantity<10)
{
	return"yes";
}	
System.out.println("end shop in hotels");
return "no";
	}
}