class DVDPlayerTestDrive 
{
	public static void main(String [] args) 
	{
		DVDPlayer d = new DVDPlayer();
		d.canRecord = true;
		d.playDVD();
		if (d.canRecord == true) 
		{
			d.recordDVD();
		}
	}
}
class DVDPlayer 
{
	boolean canRecord = false;
	void recordDVD() 
	{
		System.out.println("DVD recording");
	}
	void playDVD()   // added method 
	{
		System.out.println("DVD playing");
	}

}
