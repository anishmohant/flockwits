class BeerSong{
	public static void main (String args [])
	{
		int beerNum = 99;
		String word = "bottles";
		while (beerNum > 0)
		{
			if(beerNum == 1)
			{
				word = "bottle";
			}
			System.out.print(beerNum+" "+word+" of beer on the wall, ");  // only some minute println, print corrections
			System.out.println(beerNum+" "+word+" of beer.");
			System.out.print("Take one down.");
			System.out.print(" Pass it around, "); // added some puctuations and required spaces in strings.
			beerNum = beerNum-1;

			if (beerNum > 0)
			{
				if(beerNum == 1)                      //this code
				{									  //is added to fix
					word = "bottle";				  // so as to print "bottle" in the last	
				}									  // iteration when bottle is 1 
				System.out.println(beerNum+" "+word+" of bear on the wall");
			}
			else
			{
				System.out.println("No more bottles of bear on the wall");
			}

		}
	}
}