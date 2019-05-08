import java.io.*;
import java.util.Scanner;
public class tictactoe{
	

	public static void main (String args [])
	{
		
		System.out.println("TicTacToe");
		System.out.println("Player ones symbol is: 1");
		System.out.println("Player twos symbol is: 8");
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
		while(arrayFull!=true)
		{
			System.out.println("Player 1's turn");
			p1.strike();

			if(a[p1.row][p1.column]==0)
			{
				a[p1.row][p1.column]=p1.symbol;
				display();
				checkWin();

			}
			else
			{
				System.out.println("That cell already marked");
				display();

			}

			System.out.println("Player 2's turn");
			p2.strike();
			if(a[p2.row][p2.column]==0)
			{
				a[p2.row][p2.column]=p2.symbol;
				display();
				checkWin();
			}
			else
			{
				System.out.println("That cell already marked");
				display();
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
				
				System.out.print(a[i][j]+" ");
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
	void checkWin()
	{
		tictactoecore tc= new tictactoecore();
		int r=0,c=0,d=0,dx=0;
		int i,j;
		for(i=0;i<3;i++)
		{ 	
			
			for(j=0;j<3;j++)
			{
				
				r=r+a[i][j];
				c=r+a[j][i];
				tc.result(r);
				tc.result(c);



				if(i==j)
				{
					d=d+a[i][j];
					tc.result(d);

				}
				
			}
		}
		

	}
	void result(int r)
	{
		if(r==3)
		{
			System.out.println("Player 1 Won");
		}
		if(r==24)
		{
			System.out.println("Player 2 Won");
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