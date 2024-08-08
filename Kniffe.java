class Kniffe
{
   double weight;
   float height;
   
   Kniffe(double weight,float height)
   {
	   this.weight=weight;
	   this.height=height;
	   System.out.println("created Kniffe..");
   }
   
   public void details()
   {
	   System.out.println("Weight:" +this.weight);
	   System.out.println("Height:" +this.height);
   }

}