
public class MultidimArray {
	
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
				//display the mark to the console
				System.out.println(mark);	
			}
			System.out.println("\n");
			
		}
		
		String average = calcAverage(studMarks);
		System.out.println(average);

	}
	
	public static String calcAverage(int[][]marks)
	{
		//declare local variables
		String averDisplay = "";
		int sumAv = 0;
		//loop through the array and find the average of each row 
		for (int student = 0; student < marks.length; student++)
		{
			for (int assign = 0; assign < marks[1]. length; assign++)
			{
				//get the mark from the array
				int mark = marks[student][assign];
				System.out.println(mark);
				//add it to the sum
				sumAv = sumAv + mark;
			}
		}
	
		
		averDisplay = "The average of the class is " ;
		return averDisplay;
	}
	

}
