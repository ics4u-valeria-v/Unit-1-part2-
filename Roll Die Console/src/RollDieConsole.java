/*
 * Created by: Valeria Veverita
 * Created on: February-21-2019
 * This program generates a random number between 1  and MaxValue, and display it to the console
 */

import java.util.Scanner;
import java.util.Random;

public class RollDieConsole {
	
	public static void main(String[]args)
	{
		//declare variables
		int min_num;
		int max_num;
		//telling the computer to get the data from the system/console
		Scanner reader = new Scanner(System.in);
		
		try
		{
			//ask the user to insert the number of logs
			System.out.println("Please enter the min value for the random number: ");
			
			//get the number from the user
			 min_num = reader.nextInt();
			 
			 try
			 {
				//ask the user to insert the number of logs
					System.out.println("Please enter the max value for the random number: ");
					
					//get the number from the user
					 max_num = reader.nextInt();
					 
					//call the function to generate a random number
					int rnd_num = generateNumber(min_num, max_num);
						
					//display the random number
					System.out.println("The random number is " + rnd_num);
			 }
			 catch(Exception e2)
			 {
				//ask the user to insert the number of logs
				System.out.println("Invalid! Restart the program and enter a number for the maximum value ");
			 }
		}
		catch(Exception e1)
		{
			//ask the user to insert the number of logs
			System.out.println("Invalid!Restart the program and enter a number for the minimum value ");
		}
		
			
	}
	
	//Function: generateNumber
	//Input: int min, int max
	//Output: int rnd_num
	//Description: this function generates a random number between the min and max
	public static int generateNumber(int min, int max){
	    int rnd_num = (int)(Math.random()*((max-min)+1))+min;
	    return rnd_num;
	}

}
