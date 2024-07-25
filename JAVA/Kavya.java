class Kavya{
	
	public static void sendGift(String name,double Price,String date,boolean urgent)
	{
		System.out.println("start method in Kavya");

		GiftCenter.assign(name,Price,date,urgent);
		
		System.out.println("end method in Kavya");

		
	}


}