class Queue{
	
	public static String accecpt(String name,String msg,double quantity)
	{
		boolean ref2=ServiceProvider.send(name,msg);
		System.out.println("Ref2:"+ref2);

		
		return "sent";
	}
	
}