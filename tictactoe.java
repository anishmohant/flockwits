import java.io.*;
import java.util.Scanner;
class tictactoe{
	int [][] a = new int [3][3];

	public static void main (String args [])
	{
		
		System.out.println("TicTackToe");
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
		//while the matrix in not full
		tictactoe t= new tictactoe();
		p1.strike();
		p2.strike();			

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