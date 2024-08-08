class GanaviRunner
{
   public static void main(String []args)
   {
	   System.out.println("start main method");
	   
	   Clip clip=new Clip("red","fiber");
	   
	   Ganavi ganavi=new Ganavi("ganavi@gmail.com",clip);
	   
	   ganavi.details();
	   
	   System.out.println("end main method");
   }

}