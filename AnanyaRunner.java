class AnanyaRunner
{
    public static void main(String [] values)
	{
		System.out.println("Start main method");
		
		Kniffe kniffe=new Kniffe(40,4.2f);
		
		Ananya ananya=new Ananya("Motorola",kniffe);
		
		ananya.details();
		
		
		System.out.println("end main method");
	}


}