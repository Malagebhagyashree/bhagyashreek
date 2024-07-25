class GiftCenter{
 
 public static void assign(String name,double Price,String date,boolean urgent)
 {
	System.out.println("start method in Giftcenter");
	
	Courier.delivery(name,date,urgent);
	 
	System.out.println("end method in Giftcenter");
	    
}



}