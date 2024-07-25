class Laptops{

    public static void connect(int speed)
	{
		System.out.println("start method");
		
		Router.network(speed);
		
		System.out.println("end method");
	}
}