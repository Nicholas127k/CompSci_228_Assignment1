package src.edu.iastate.cs228.hw1;
import java.io.FileNotFoundException;
import java.util.Scanner;

//protected int profit = 0;
/**
 * @author <<Nicholas Kirschbaum>>
 * *****To who ever is grading this for some reason my scanning a file is broken
 * Ive had multiple TA's look at it and not be able to figure out the problem though
 * the code is right 
 * The ISPBusiness class performs simulation over a grid 
 * plain with cells occupied by different TownCell types.
 *
 */


public class ISPBusiness {
	
	/**
	 * Returns a new Town object with updated grid value for next billing cycle.
	 * @param tOld: old/current Town object.
	 * @return: New town object.
	 */
	public static Town updatePlain(Town tOld) {
		
		//This creates a new Town object from the old using two for loops and the methods
		//next and nCensus
	
		Town tNew = new Town(tOld.getLength(), tOld.getWidth());
		for(int i = 0; i < tOld.getLength(); i++) {
			for(int j = 0; j < tOld.getWidth(); j++) {
				
				tOld.grid[i][j].census(TownCell.nCensus);
				
				tNew.grid[i][j] = tOld.grid[i][j].next(tOld);
				
				
		}
		}
		//System.out.println("The current total profit: " + getProfit(tOld));
		//TODO: Write your code here.
		return tNew;
	}
	
	/**
	 * Returns the profit for the current state in the town grid.
	 * @param town
	 * @return
	 */
	public static int getProfit(Town town) {
		//TODO: Write/update your code here.
		
		return town.totalProfit;
	}
	

	/**
	 *  Main method. Interact with the user and ask if user wants to specify elements of grid
	 *  via an input file (option: 1) or wants to generate it randomly (option: 2).
	 *  
	 *  Depending on the user choice, create the Town object using respective constructor and
	 *  if user choice is to populate it randomly, then populate the grid here.
	 *  
	 *  Finally: For 12 billing cycle calculate the profit and update town object (for each cycle).
	 *  Print the final profit in terms of %. You should print the profit percentage
	 *  with two digits after the decimal point:  Example if profit is 35.5600004, your output
	 *  should be:
	 *
	 *	35.56%
	 *  
	 * Note that this method does not throw any exception, so you need to handle all the exceptions
	 * in it.
	 * 
	 * @param args
	 * @throws FileNotFoundException 
	 * 
	 */
	public static void main(String []args) throws FileNotFoundException {
		//TODO: Write your code here.
		// This promps the user to enter the numbers 1 or 2 to choose between entering a file or randomizing a array
		Scanner scan = new Scanner(System.in);
		System.out.println("Does the user want to create the grid via input file or (option: 1) or randomly (option: 2)?");
		int oneOrtwo = scan.nextInt();
		
		if(oneOrtwo == 1) {
			// Option 1 is the the input file this is where my problem is when I run line 90
			System.out.println("Enter your input file:");
			String file = scan.next();
			//File file = new File("C:\\\\Users\\\\nickk\\\\eclipse-workspace\\\\Assignment3\\\\src\\\\test2.txt");
			System.out.println(file);
			Town tNew = new Town(file);
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 1:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 2:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 3:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 4:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 5:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 6:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 7:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 8:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 9:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 10:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 11:");
			tNew.toString();
			
		}
		else {
			// Option 2 is the the randomize it takes in the length width and seed from the user and 
			//generates a array with those values then cycles through each month.
		
			System.out.println("Enter desired length:");
			int length = scan.nextInt();
			System.out.println("Enter desired width:");
			int width = scan.nextInt();
			System.out.println("Enter the desired seed:");
			int seed = scan.nextInt();
			Town tNew = new Town(length, width);
			tNew.randomInit(seed);
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 1:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 2:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 3:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 4:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 5:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 6:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 7:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 8:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 9:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 10:");
			tNew.toString();
			updatePlain(tNew);
			System.out.println("Month 11:");
			tNew.toString();
			
			
			double total = tNew.totalProfit;
			
			total = total / (length*width*12) * 100;
			
			System.out.print("Total profit = ");
			System.out.printf("%.2f", total);
			System.out.print("%");
			
			
			
		}
		scan.close();
	}
}
