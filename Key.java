class Key
{
   double weight;
   String brand;
   
   Key(double weight ,String brand)
   
   {
	   this.weight=weight;
	   this.brand=brand;
	   System.out.println("created key");
   }
   
     public void details()
	 {
		 System.out.println("Key weight:" +this.weight);
		 System.out.println("Key brand:" +this.brand);
	 }
}