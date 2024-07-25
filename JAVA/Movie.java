class Movie
{
	public static void main (String [] args)
	{
		System.out.println("start main in Movie");
		
		String m1="Mission mangalayan";
		String m2="Yajamana";
		String m3="Manikya";
		String m4="Bahubali1";
		String m5="Bahubali2";
		String m6="Kalki";
		String m7="Bhajarangi";
		String m8="Rajakumar";
		String m9="Sarathi";
		String m10="Milana";
		String m11="Appu";
		String m12="Ayogya";
		String m13="Chalisuva modagalu";
		String m14="Ranna";
		String m15="Ninnindale";
		String m16="Yuva";
		String m17="Kanasugara";
		String m18="Ninagagi";
		String m19="Hudugaru";
		String m20="Vishnuvardhana";
		
		String [] Totalmovies={m1,m2,m3,m4,m5,m6,m7,m8,m9,m10,m11,m12,m13,m14,m15,m16,m17,m18,m19,m20};
		
		for(int Picture=0;Picture<20;Picture++)
		{
           System.out.println("picture:"+Totalmovies[Picture]);
		}
		System.out.println(Totalmovies.length);
      System.out.println("end main in Movie");
	}
}