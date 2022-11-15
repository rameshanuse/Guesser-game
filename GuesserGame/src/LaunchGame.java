import java.util.Scanner;

class Guesser
{
	int guessNum;
	
	int guessNum()
	{
		int[] ar= {1,2,3,4,5,6,7,8,9,10};
		System.out.println("Guesser kindely guess the number in range of 1 to 10"); 
		Scanner scan=new Scanner(System.in);
		guessNum=scan.nextInt();
		boolean flag=false;
		
		for(int i=0; i<ar.length; i++)
			{
				if(guessNum==ar[i])
				{
					System.out.println("Number" +" "+guessNum +" found within the Range");
					flag=true;
					break;
					
				}
			
			}
		
			if(flag==false)
			{
				System.out.println("Number out of range, try again!");
				return -1;
			}
			else 
			{
				return guessNum;
			}
	}
}

class Player1
{
	int guessNum;
	int guessNum()
	{
		int[] ar= {1,2,3,4,5,6,7,8,9,10};
		Scanner scan=new Scanner(System.in);
		System.out.println("Player1 guess the number in range of 1 to 10 ");
		guessNum=scan.nextInt();
		boolean flag=false;
		
		for(int i=0; i<ar.length; i++)
			{
				if(guessNum==ar[i])
				{
					//System.out.println("Number" +" "+guessNum +" found within the Range");
					flag=true;	
					break;
				}
			
			}
		
			if(flag==false)
			{
				System.out.println("Number out of range, try again!");
				flag=true;
			}
		return guessNum;
	}
}

class Player2
{
	int guessNum;
	int guessNum()
	{
		int[] ar= {1,2,3,4,5,6,7,8,9,10};
		Scanner scan=new Scanner(System.in);
		System.out.println("Player2 guess the number in range of 1 to 10 ");
		guessNum=scan.nextInt();
		boolean flag=false;
		
		for(int i=0; i<ar.length; i++)
			{
				if(guessNum==ar[i])
				{
					//System.out.println("Number" +" "+guessNum +" found within the Range");
					flag=true;	
					break;
				}
			
			}
		
			if(flag==false)
			{
				System.out.println("Number out of range, try again!");
				flag=true;
			}
		return guessNum;
	}
}

class Player3
{
	int guessNum;
	int guessNum()
	{
		int[] ar= {1,2,3,4,5,6,7,8,9,10};
		Scanner scan=new Scanner(System.in);
		System.out.println("Player3 guess the number in range of 1 to 10 ");
		guessNum=scan.nextInt();
		boolean flag=false;
		
		for(int i=0; i<ar.length; i++)
			{
				if(guessNum==ar[i])
				{
					//System.out.println("Number" +" "+guessNum +" found within the Range");
					flag=true;	
					break;
				}
			
			}
		
			if(flag==false)
			{
				System.out.println("Number out of range, try again!");
				flag=true;
			}
		
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
		
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	
	void collectNumFromPlayer1()
	{
		Player1 p1=new Player1();
		numFromPlayer1=p1.guessNum();
	}
	
	void collectNumFromPlayer2()
	{
		Player2 p2=new Player2();
		numFromPlayer2=p2.guessNum();
	}
	
	void collectNumFromPlayer3()
	{
		Player3 p3=new Player3();
		numFromPlayer3=p3.guessNum();
	}
	
	void compaire()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("Match tied");
				System.out.println();
				System.out.println("Next round");
			}
			
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Match tied between Player1 and Player2 ");
				System.out.println();
				System.out.println("Next round");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Match tied between Player1 and Player3 ");
				System.out.println();
				System.out.println("Next round");
			}
			else
			{
				System.out.println("Player1 won the game");
			}
			
		}

		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Match tied between Player2 and Player3");
				System.out.println();
				System.out.println("Next round");
			}
			else
			{
				System.out.println("Player2 won the game");
			}
		}
		
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player3 won the game");
		}
		else
		{
			System.out.println("Game lost try again!");
		}
	}
}
public class LaunchGame 
{

	public static void main(String[] args) 
	{
		Umpire u=new Umpire();
		u.collectNumFromGuesser();
		if(u.numFromGuesser !=-1) 
		{
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer2();
			u.collectNumFromPlayer3();
			u.compaire();
		if(u.numFromGuesser==u.numFromPlayer1 && u.numFromGuesser==u.numFromPlayer2 
				&& u.numFromGuesser==u.numFromPlayer3)
		{
			u.collectNumFromGuesser();
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer2();
			u.collectNumFromPlayer3();
			u.compaire();
			
		}
		if(u.numFromGuesser==u.numFromPlayer1 && u.numFromGuesser==u.numFromPlayer2)
		{
			u.collectNumFromGuesser();
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer2();
			u.compaire();
		}
		if(u.numFromGuesser==u.numFromPlayer1 && u.numFromGuesser==u.numFromPlayer3)
		{
			u.collectNumFromGuesser();
			u.collectNumFromPlayer1();
			u.collectNumFromPlayer3();
			u.compaire();
		}
		if(u.numFromGuesser==u.numFromPlayer2 && u.numFromGuesser==u.numFromPlayer3)
		{
			u.collectNumFromGuesser();
			u.collectNumFromPlayer2();
			u.collectNumFromPlayer3();
			u.compaire();
		}
	
		}
	}
	

}

