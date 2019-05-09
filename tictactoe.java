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
	boolean arrayNotFull=false;
	Player p1=new Player();
	Player p2=new Player();
	boolean win;

	void startgame()
	{
		win=false;
		tictactoe t= new tictactoe();
		//tictactoecore tc= new tictactoecore();
		p1.symbol=1;
		p2.symbol=8;
		while(arrayNotFull() && win==false)
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
		while(arrayNotFull()==true && win==false)
		{
			System.out.println("Sorry no winners this time.");
		}			

	}
	public void display()
	{
		tictactoecore tc= new tictactoecore();
		System.out.print(" 1 2 3");
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
		System.out.println("");
	}
	public boolean arrayNotFull()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				if(a[i][j]==0)
				{
					return true;
				}		
			}
		}
		return false;
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
			System.out.println("Player 1 Won [1]");
			win=true;
		}
		if(r==24)
		{
			System.out.println("Player 2 Won [8]");
			win=true;
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
 		int vr=1, vc=1;
 		Scanner reader = new Scanner(System.in); 
 		while(vc==1)
 		{
 			System.out.println("Please enter the column to strike");
 			column=reader.nextInt()-1;
 			if(column<=2 && column>=0)
 			{
 				vc++;
 			}
 			else
 			{
 				System.out.println("Invalid column, Enter a number from 1 to 3");
 			}

 		}
 		while(vr==1)
 		{
 			System.out.println("Please enter the row to strike");
 			row=reader.nextInt()-1;
 			if(row<=2 && row>=0)
 			{
 				vr++;
 			}
 			else
 			{
 				System.out.println("Invalid row, Enter a number from 1 to 3");
 			}

 		}
 	}
}