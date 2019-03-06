/*
 * Multidimensional Arrays
 * Created by: Valeria V
 * Created on: March-6-2019
 */
import java.lang.reflect.Array;
import java.util.Arrays;

public class MultidimArray {
	
	public static String calcAverage(int[][]marks)
	{
		//declare local variables
		String averDisplay = "";
		int totSum = 0;

		
		for (int student = 0; student < marks.length; student++)
		{
			//second row
			for (int assignment = 0; assignment < marks[1].length; assignment++ )
			{
				//get the mark from the array
				int mark = marks[student][assignment];
				//calculate the sum of the marks
				totSum = totSum + mark;
				
			}
		}
		
		//calculate the average
		int average = totSum / 24;
		averDisplay = "The average of the class is " + average;
		
		return averDisplay;
	}
	
	
	
	public static void main(String[]args)
	{
	
		//declare local variables
		int max = 99;
		int min = 1;
		//create the 2D array
		int[][] studMarks = new int[4][6];
		
		
		//loop through the array
		//first row
		for (int student = 0; student < studMarks.length; student ++)
		{
			//second row
			for (int assignment = 0; assignment < studMarks[1].length; assignment++ )
			{
				//generate a random mark
				int mark = (int)(Math.random()*((max-min)+1))+min;
				//add the mark to the array
				studMarks[student][assignment] = mark;
				System.out.println(mark);
			}
			System.out.println("\n");
			
		}
		
		//call the calculate average function
		String dispString = calcAverage(studMarks);
		//display the average to the console
		System.out.println(dispString);
		
	}
	
}
