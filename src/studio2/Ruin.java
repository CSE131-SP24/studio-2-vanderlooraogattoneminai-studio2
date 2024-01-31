package studio2;

import java.util.Scanner;

public class Ruin {


	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("What is your starting amount?");
		double startAmount = in.nextDouble();
		System.out.print("What is your win chance?");
		double winChance = in.nextDouble();
		System.out.print("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.print("How many days would you like to simulate?");
		int totalSimulations = in.nextInt();
		int count = 0;
		double betAmount = startAmount;

		for(int i=0;i<totalSimulations;i++) {
			startAmount = betAmount;
			double winOrLose =0;
			while(startAmount>0)
			{
				winOrLose= Math.random();
				if(winOrLose>winChance) {
					startAmount--;}

				if(winOrLose<winChance){
					startAmount++;}

				if(startAmount==winLimit){
					System.out.println("Good job! The bank remains intact!");
					count++;
					break;
					
				}

				if(startAmount==0)
					System.out.println("You are in financial ruin!");
				count++;

			}

		}
		// TODO Auto-generated method stub

	}

}

