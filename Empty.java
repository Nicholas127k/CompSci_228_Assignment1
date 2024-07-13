package src.edu.iastate.cs228.hw1;

public class Empty extends TownCell{

	public Empty(Town p, int r, int c) {
		super(p, r, c);
		// TODO Auto-generated constructor stub
	}

	@Override
	public State who() {
		// TODO Auto-generated method stub
		return State.EMPTY;
	}

	@Override
	public TownCell next(Town tNew) {
		// TODO Auto-generated method stubint casualcounter = 0;
		/**
		int casualcounter = 0;
		int EmptyorOutagecounter = 0;
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
		
		
		if(tNew.grid[row][col-1].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row][col+1].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row-1][col-1].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row-1][col+1].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row+1][col-1].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row+1][col+1].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row-1][col].getClass() == Empty.class) {
			EmptyorOutagecounter =+1;
		}
		
		if(tNew.grid[row][col-1].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row][col+1].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row-1][col-1].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row-1][col+1].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row+1][col-1].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row+1][col+1].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		if(tNew.grid[row-1][col].getClass() == Outage.class) {
			EmptyorOutagecounter =+1;
		}
		**/
		if((nCensus[EMPTY] + nCensus[OUTAGE]) <= 1) {
			return tNew.grid[row][col] = new Reseller(tNew, row, col);
		}
		else if(nCensus[CASUAL] > 4) {
			return tNew.grid[row][col] = new Streamer(tNew, row, col);
		}
		else {
			return tNew.grid[row][col] = new Casual(tNew, row, col);
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
