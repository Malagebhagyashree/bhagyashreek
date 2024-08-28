class Runner
{
	public static void main(String []args)
	{
		System.out.println("Start method");
		
		Doctor doctor=new Doctor("Bhagya","BMC");
		
		Patient patient=new Patient("dolo",123456789l,doctor);
		
		patient.details();
		
		
		System.out.println("end method");
	}
}