class KeyRunner
{
    public static void main(String [] values)
	{
		System.out.println("Start main method");
		
		Key key=new Key(40.8,"India");
		
		Keybunch keybunch=new Keybunch("wood",key);
		
		keybunch.details();
		
		
		System.out.println("end main method");
	}


}