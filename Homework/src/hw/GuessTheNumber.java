package hw;

import java.util.Scanner;

public class GuessTheNumber {

	public static void main(String[] args) {
		
		
		int exit;
		int playerCount;
		System.out.println("How many person?");
		Scanner sc = new Scanner(System.in);
		playerCount = sc.nextInt();
		int winCount[] = new int[playerCount]; //kaç win
		
		do {
		
		int counter[] = new int[playerCount + 1];
		int counter3 = 0; 
		
		int number = (int)(Math.random() * 100);
		//System.out.println(number);
		
		int guessNumber = 101;
		
		while (number != guessNumber) {
			
			
			System.out.print((counter3 % playerCount) + 1 + ". player is playing,  ");
			System.out.println("Enter a number:");
			Scanner sc1 = new Scanner(System.in);
			guessNumber = sc1.nextInt();
			counter[(counter3 % playerCount) + 1] += 1;
			
			if ((guessNumber < 0) || (guessNumber > 99)) {
				System.out.println("Enter a number between 0-99");
				continue;
			}
			counter3 ++;						
			if (number < guessNumber) {
				System.out.println("Too high, try again");
				continue;
			}
			else if (number > guessNumber) {
				System.out.println("Too low, try again");
				continue;
			}
			System.out.println("Player " + (((counter3 - 1) % playerCount) + 1) + "'s " + counter[((counter3 - 1) % playerCount) + 1] + ". guess is right");
			winCount[((counter3 - 1) % playerCount)] += 1;		
		}
		
		if (number == guessNumber) {
			System.out.println("Congratulations !");
			System.out.println("Number is = " + number);
		}
		
		for(int i = 0; i < playerCount; i++)
		{
			System.out.println("Player" + (i + 1) + " = " + winCount[i]);
		}
		
		System.out.println("For exit press 0, for continue press 1:");
		Scanner z = new Scanner(System.in);
		 exit = z.nextInt();
		
		 if (exit == 1) {
			 continue;
		 }
		
		}while(exit !=0);
		
	
	}

}


