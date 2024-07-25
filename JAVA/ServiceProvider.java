class ServiceProvider{

     public static boolean send(String name,String msg)
	 {
		 boolean ref3=MessageProvider.send(name,msg);
		 System.out.println("Ref3:"+ref3);

	 
	 return true;
	 }
}