import java.io.*;
import java.util.Scanner;
public class tictactoe{
	int [][] a = new int [3][3];
	boolean arrayFull=false;

	public static void main (String args [])
	{
		
		System.out.println("TicTacToe");
		tictactoe t= new tictactoe();
		/*for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				a[i][j]=-4;
			}
		}*/

		t.display();

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

	public void display()
	{
		System.out.println(" a  b  c");
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			System.out.print(i+1);
			for(int j=0;j<3;j++)
			{
				
				System.out.print(a[i][j]+" ");
			}
		}
	}


}

public class tictactoecore
{
	Player p1;
	Player p2;

	void startgame()
	{
		tictactoe t= new tictactoe();
		p1.symbol=1;
		p2.symbol=8;
		while(t.arrayFull!=true)
		{
			
			p1.strike();
			if(t.a[p1.row][p1.column]==0)
			{
				t.a[p1.row][p1.column]=p1.symbol;
			}
			else
			{
				System.out.print("That cell already marked");
			}
			
			p2.strike();
			if(t.a[p2.row][p2.column]==0)
			{
				t.a[p2.row][p2.column]=p2.symbol;
			}
			else
			{
				System.out.print("That cell already marked");
			}
			
		}			

	}
	public void display()
	{
		tictactoe t= new tictactoe();
		System.out.println(" 1  2  3");
		for(int i=0;i<3;i++)
		{
			System.out.println("");
			System.out.print(i+1);
			for(int j=0;j<3;j++)
			{
				
				System.out.print(t.a[i][j]+" ");
			}
		}
	}
}

public class Player
{
	int symbol;
	int row;
	int column;
 	void strike()
 	{
 		Scanner reader = new Scanner(System.in); 
 		System.out.println("Please enter the column to strike");
 		column=reader.nextInt();
 		System.out.println("Please enter the row to strike");
 		row=reader.nextInt();

 	}
}