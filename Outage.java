package src.edu.iastate.cs228.hw1;

public class Outage extends TownCell{

	public Outage(Town p, int r, int c) {
		super(p, r, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public State who() {
		// TODO Auto-generated method stub
		return State.OUTAGE;
	}

	@Override
	public TownCell next(Town tNew) {
		/**
		int casualcounter = 0;
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
		**/
		// TODO Auto-generated method stub
		if (nCensus[CASUAL] > 4) {
		return tNew.grid[row][col] = new Streamer(tNew, row, col);
		}
		
		 else {
			 return tNew.grid[row][col] = new Empty(tNew, row, col);
		//this should not be an else statement it should be an if else statement
		}
	
		
	}

}
