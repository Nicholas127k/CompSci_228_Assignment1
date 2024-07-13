package src.edu.iastate.cs228.hw1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;


/**
 *  @author <<Nicholas Kirschbaum>>
 *
 */
public class Town {
	
	private int length, width;  //Row and col (first and second indices)
	public TownCell[][] grid;
	int totalProfit = 0;
	
	/**
	 * Constructor to be used when user wants to generate grid randomly, with the given seed.
	 * This constructor does not populate each cell of the grid (but should assign a 2D array to it).
	 * @param length
	 * @param width
	 */
	public Town(int length2, int width2) {
		//TODO: Write your code here.
		length = length2;
		width = width2;
		grid = new TownCell[length2][width2];
	}
	
	/**
	 * Constructor to be used when user wants to populate grid based on a file.
	 * Please see that it simple throws FileNotFoundException exception instead of catching it.
	 * Ensure that you close any resources (like file or scanner) which is opened in this function.
	 * @param inputFileName
	 * @throws FileNotFoundException
	 */
	public Town(String inputFileName) throws FileNotFoundException {
		//TODO: Write your code here.
		//for some reason Scanner is refusing to take in my file though according to multiple T'As it looks fine
		//The Code scans the file and then declares each Letter into the array using two for loops
		File file = new File(inputFileName);
		
		Scanner scan = new Scanner(file);
		
		length = scan.nextInt();
		width = scan.nextInt();
		grid = new TownCell[length][width];
		for(int i = 0; i < length; i++) {
			scan.nextLine();
			for(int j = 0; j < width; j++) {
				if(scan.next() == "C") {
					grid[i][j] = new Casual(this, i, j);
				}
				else if (scan.next() == "O"){
					grid[i][j] = new Outage(this, i, j);
				}
				else if (scan.next() == "S"){
					grid[i][j] = new Streamer(this, i, j);
				}
				else if (scan.next() == "R"){
					grid[i][j] = new Reseller(this, i, j);
				}
				else if (scan.next() == "E"){
					grid[i][j] = new Empty(this, i, j);
				}
			}
		}
		scan.close();
		
		
	}
	
	/**
	 * Returns width of the grid.
	 * @return
	 */
	public int getWidth() {
		//TODO: Write/update your code here.
		return width;
	}
	
	/**
	 * Returns length of the grid.
	 * @return
	 */
	public int getLength() {
		//TODO: Write/update your code here.
		return length;
	}

	/**
	 * Initialize the grid by randomly assigning cell with one of the following class object:
	 * Casual, Empty, Outage, Reseller OR Streamer
	 */
	public void randomInit(int seed) {
		//for some reason Scanner is refusing to take in my file though according to multiple T'As it looks fine
			//The Code scans the file and then declares each Letter into the array using two for loops
		Random rand = new Random(seed);
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < width; j++) {
				int hello = rand.nextInt(5);
				if(hello == 0) {
					//grid[i][j] = TownCell(grid[i][j], i, j);
					grid[i][j] = new Casual(this, i, j);
				}
				else if(hello == 1) {
					grid[i][j] = new Reseller(this, i, j);
				}
				else if(hello == 2) {
					grid[i][j] = new Empty(this, i, j);
				}
				else if(hello == 3) {
					grid[i][j] = new Outage(this, i, j);
				}
				else if(hello == 4) {
					grid[i][j] = new Streamer(this, i, j);
				}
			}
			
		}
		//TODO: Write your code here.
	}
	
	/**
	 * Output the town grid. For each square, output the first letter of the cell type.
	 * Each letter should be separated either by a single space or a tab.
	 * And each row should be in a new line. There should not be any extra line between 
	 * the rows.
	 */
	@Override
	public String toString() {
		//This code prints out the array on the console
		String s = "";
		int casualcounter = 0;
		//TODO: Write your code here.
		for(int i = 0; i < length; i++) {
			for(int j = 0; j < width; j++) {
				if(grid[i][j].getClass() == Casual.class) {
					casualcounter+=1;
					System.out.print("C");
				}
				else if(grid[i][j].getClass() == Empty.class) {
					System.out.print("E");
				}
				else if(grid[i][j].getClass() == Outage.class) {
					System.out.print("O");
				}
				else if(grid[i][j].getClass() == Streamer.class) {
					System.out.print("S");
				}
				else if(grid[i][j].getClass() == Reseller.class) {
					System.out.print("R");
				}
				
				//else if(grid[i][j].equals(Casual.class)) {
					
				//}
				//System.out.print(grid[i][j]);
				//System.out.print(Town);
				System.out.print(" ");
			}
			System.out.println("");
		}
		System.out.println("");
		System.out.println("Profit:" + casualcounter);
		totalProfit += casualcounter;
		ISPBusiness.getProfit(this);
		
		return s;
	}
}
