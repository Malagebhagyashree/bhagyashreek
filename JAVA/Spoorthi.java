class Spoorthi{

    public static String sendMsg(String name,String msg,double quantity)
	{
			   System.out.println("name: "+name+    "  msg: "+ msg +  "quantity:"+quantity);

		String ref1=Queue.accecpt(name,msg,quantity);
	   System.out.println("Ref1:"+ref1);

		
		return "sent";
	}
}