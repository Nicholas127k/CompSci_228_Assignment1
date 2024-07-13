package src.edu.iastate.cs228.hw1;

public class Casual extends TownCell {
	

	public Casual(Town p, int r, int c) {
		super(p, r, c);
		
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public State who() {
		// TODO Auto-generated method stub
		return State.CASUAL;
	}

	@Override
	public TownCell next(Town tNew) {
		
			if(nCensus[RESELLER] >= 1) {
				return tNew.grid[row][col] = new Outage(tNew, row, col);
			}
			else if(nCensus[STREAMER] >= 1) {
				return tNew.grid[row][col] = new Streamer(tNew, row, col);
			}
			else if(nCensus[EMPTY] + nCensus[OUTAGE] <= 1) {
				return tNew.grid[row][col] = new Reseller(tNew, row, col);
			}
			else if(nCensus[CASUAL] > 4) {
				return tNew.grid[row][col] = new Streamer(tNew, row, col);
			}
			else {
				return tNew.grid[row][col] = new Casual(tNew, row, col);
			}
		
		//return null;
	}

}
