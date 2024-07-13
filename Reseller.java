package src.edu.iastate.cs228.hw1;

public class Reseller extends TownCell{

	public Reseller(Town p, int r, int c) {
		super(p, r, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public State who() {
		// TODO Auto-generated method stub
		return State.RESELLER;
	}

	@Override
	public TownCell next(Town tNew) {
		// TODO Auto-generated method stub
		/**
		int casualcounter = 0;
		//Counts the amount of casuals for final else if case
		if(tNew.grid[row][col-1].getClass() == Casual.class) {
			casualcounter =+1;
		}
		if(tNew.grid[row][col+1].getClass() == Casual.class) {
			casualcounter =+1;
		}
		if(tNew.grid[row-1][col-1].getClass() == Casual.class) {
			casualcounter =+1;
		}
		if(tNew.grid[row-1][col+1].getClass() == Casual.class) {
			casualcounter =+1;
		}
		if(tNew.grid[row+1][col-1].getClass() == Casual.class) {
			casualcounter =+1;
		}
		if(tNew.grid[row+1][col+1].getClass() == Casual.class) {
			casualcounter =+1;
		}
		if(tNew.grid[row-1][col].getClass() == Casual.class) {
			casualcounter =+1;
		}
		
		
		
		
		
		
		int counter2 = 0;
		//counts the amount of Empty grids in the neighborhood
		if(tNew.grid[row][col-1].getClass() == Empty.class) {
			counter2 =+1;
		}
		if(tNew.grid[row][col+1].getClass() == Empty.class) {
			counter2 =+1;
		}
		if(tNew.grid[row-1][col-1].getClass() == Empty.class) {
			counter2 =+1;
		}
		if(tNew.grid[row-1][col+1].getClass() == Empty.class) {
			counter2 =+1;
		}
		if(tNew.grid[row+1][col-1].getClass() == Empty.class) {
			counter2 =+1;
		}
		if(tNew.grid[row+1][col+1].getClass() == Empty.class) {
			counter2 =+1;
		}
		if(tNew.grid[row-1][col].getClass() == Empty.class) {
			counter2 =+1;
		}
		**/
		if(nCensus[CASUAL] <= 3) {
			return tNew.grid[row][col] = new Empty(tNew, row, col);
		}
		else if(nCensus[EMPTY] >= 3) {
		//the middle
			return tNew.grid[row][col] = new Empty(tNew, row, col);
		}
		else if(nCensus[CASUAL] >= 5) {
			return tNew.grid[row][col] = new Streamer(tNew, row, col);
		}
		else {
			return tNew.grid[row][col] = new  Reseller(tNew, row, col);
		}
		//return null;
	}

}
