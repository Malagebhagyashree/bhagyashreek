class Patient
{
   String tablet;
   long id;
   Doctor doctor;
   
   Patient(String tablet,long id,Doctor doctor)
   {
	   this.tablet=tablet;
	   this.id=id;
	   this.doctor=doctor;
   }
   
   public void details()
   {
	   System.out.println("Tablet:" +this.tablet);
	   System.out.println("Id:" +this.id);
	   doctor.details();
   }
   
   
}