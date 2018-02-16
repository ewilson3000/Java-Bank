package pkgMain;

public class stats {

	String name;
	private int AB;
	private int Hits;
	private int dbls;
	private int trips;
	private int HRs;
	private int Runs;
	private int BB;
	private int HBP;
	private int SF;
	
	
	public stats(String name, int aB, int hits, int dbls, int trips, int hRs, int runs, int bB, int hBP, int sF) {
		super();
		this.name = name;
		AB = aB;
		Hits = hits;
		this.dbls = dbls;
		this.trips = trips;
		HRs = hRs;
		Runs = runs;
		BB = bB;
		HBP = hBP;
		SF = sF;
	}

	public int Singles()
	{
	    return this.Hits - this.dbls - this.trips - this.HRs;
	}
	
	public int Doubles()
	{
		return this.dbls;
	}
	
	public int Triples()
	{
		return this.trips;
	}
	
	public double avg()
	{
		return stats.avg(this.Hits, this.AB);
	}
	
	public static double avg(int Hits, int AB)
	{
		return (double) Hits/AB;
	}
	
	public int Batting averg
	
	
	
	

}