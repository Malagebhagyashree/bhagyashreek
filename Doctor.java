 class Doctor
 {
	 String name;
	 String hospital;
	 
	 Doctor(String name,String hospital)
	 {
		 this.name=name;
		 this.hospital=hospital;
		 System.out.println("Created Doctor..");
	 }
	 
	 public void details()
	 {
		 System.out.println("Name:" +this.name);
		 System.out.println("Hospital:" +this.hospital);
	 }
 }