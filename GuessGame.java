/*
This is a modifiied version of whats iin the textbook.
*/
import java.io.*;
import java.util.Scanner;
public class GuessGame
{
 	public static void main(String[] args) 
 	{
 		GuessGameCore ggc = new GuessGameCore();	
 		ggc.startGame();
 	}
}
public class GuessGameCore
{
	
	Player p1;
	Player p2;
	Player p3;
	void startGame()
	{
		p1 = new Player();
		p2 = new Player();
		p3 = new Player();

		int guessp1 = 0;
		int guessp2 = 0;
		int guessp3 = 0; 

		boolean p1isRight = false;
		boolean p2isRight = false;
		boolean p3isRight = false;

		int targetNumber = (int) (Math.random() * 10);
		System.out.println("Please enter player 1's guess");
		p1.guess();
		System.out.println("Please enter player 2's guess");
		p2.guess();
		System.out.println("Please enter player 3's guess");
		p3.guess();

		System.out.println("The guessed number was: "+targetNumber);
		if(p1.guessedNumber==targetNumber)
		{
			System.out.println("Player one wins");
			
		}		
		if(p2.guessedNumber==targetNumber)
		{
			System.out.println("Player two wins");
			
		} 

		if(p3.guessedNumber==targetNumber)
		{
			System.out.println("Player Three wins");
			
		}else
		{
			System.out.println("We dont have a winner");
			
		}
		

	}	
}
public class Player
{
	int guessedNumber;
	void guess()
	{
		Scanner reader = new Scanner(System.in); 
		System.out.println("Enter the guess");
		guessedNumber=reader.nextInt();
	}
}
