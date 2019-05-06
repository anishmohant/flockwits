class loops{
	public static void main (String args [])
	{
		int x=4;
		System.out.println("While Loop");
		System.out.println("Initially  x is:" +x);
		while(x>3)
		{
			System.out.println("x>3");
			x=x-1;                        //to stop infinite loop
		}
		System.out.println("Finally  x is:" +x);

		while(x==11)
		{
			System.out.println("x==11");   // wont prinft because not true
		
		}

		int k=5;
		System.out.println("For Loop");
		for(int i=1; i<=k; i++)
		{
			System.out.println("Loop: " +i);
		}
		
	}
}