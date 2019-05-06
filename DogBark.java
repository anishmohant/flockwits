/******************************************************************************************
Code is only implented to understand certain concepts and doesn't bear any real life meaning.
*******************************************************************************************/
import java.io.*;
public class DogBark{
	public static void main (String args [])
	{
		int size = 27;
		String name = "Fiddo";
		String num = "8";
		int barks = Integer.parseInt(num);    // to understand conversion from String to integer
		int x=size-5;


		System.out. println("Hello");
		System.out. println("Dog :"+ name);  


		Dog myDog = new Dog(size, name);
		if(x < 15)
		{
			myDog.bark(barks);	              // converted interger is used  as parameter 
		}
		while(x > 3)
		{
			myDog.play();                     // will run (27-5)-3 times
			x--;                              // to exit from infinite loop
		}
	
		
	}
	

}
public class Dog{

	int size;
	String name;
	Dog(int size, String name)
	{
		this.size = size;
	    this.name = name;
	}
	
	public void bark(int b)
	{
		for(int i=0; i<=b; i++)
		{
			System.out.println("Bark !! ");
		}
	}
	public void play()
	{
		System.out.println("Dog is playing");	
	}
}