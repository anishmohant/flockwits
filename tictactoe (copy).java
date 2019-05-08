import java.io.*;
import java.util.Scanner;
public class tictactoe{
	

	public static void main (String args [])
	{
		
		System.out.println("TicTacToe");
		tictactoecore tc= new tictactoecore();
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=-4;
			}
		}*/

		tc.display();
		tc.startgame();

	}
	
}

class tictactoecore
{
	int [][] a = new int [3][3];
	boolean arrayFull=false;
	Player p1=new Player();
	Player p2=new Player();

	void startgame()
	{
		tictactoe t= new tictactoe();
		//tictactoecore tc= new tictactoecore();
		p1.symbol=1;
		p2.symbol=8;
		while(tc.arrayFull!=true)
		{
			System.out.println("Player 1's turn");
			p1.strike();

			if(tc.a[p1.row][p1.column]==0)
			{
				tc.a[p1.row][p1.column]=p1.symbol;
				tc.display();

			}
			else
			{
				System.out.println("That cell already marked");
				tc.display();
			}

			System.out.println("Player 2's turn");
			p2.strike();
			if(tc.a[p2.row][p2.column]==0)
			{
				tc.a[p2.row][p2.column]=p2.symbol;
				tc.display();
			}
			else
			{
				System.out.println("That cell already marked");
				tc.display();
			}
			
		}			

	}
	public void display()
	{
		tictactoecore tc= new tictactoecore();
		System.out.println(" 1 2 3");
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			System.out.print(i+1);
			for(int j=0;j<3;j++)
			{
				
				System.out.print(tc.a[i][j]+" ");
			}
		}
		System.out.println("");
	}
	public boolean arrayFull()
	{
		int af=0;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==0)
				{

					af=af+1;	
				}
			}
		}
		if(af>0)
		{
			return false;

		}
		else
		{
			return true;
		}

	}
}
 class Player
{
	int symbol;
	int row;
	int column;
 	void strike()
 	{
 		Scanner reader = new Scanner(System.in); 
 		System.out.println("Please enter the column to strike");
 		column=reader.nextInt()-1;
 		System.out.println("Please enter the row to strike");
 		row=reader.nextInt()-1;

 	}
}