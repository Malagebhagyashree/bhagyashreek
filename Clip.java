class Clip
{
    String color;
	String type;
	
	Clip(String color,String type)
	{
		this.color=color;
		this.color=type;
		System.out.println("created Clip");
	}

	public void details()
	{
		System.out.println("Color:" +this.color);
		System.out.println("type:" +this.type);
		
	}
}