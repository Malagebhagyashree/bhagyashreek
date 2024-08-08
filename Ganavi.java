class Ganavi
{
    String email;
	Clip clip;
	
	Ganavi(String email,Clip clip)
	{
		this.email=email;
		this.clip=clip;
		System.out.println("created Ganavi");
	}
	
	public void details()
	{
		System.out.println("Email:" +this.email);
		
		clip.details();
	}

}