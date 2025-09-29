
public class CricketRunsScored extends Cricket {
	
	//Constructor of this class
	public CricketRunsScored(String batsman, String stadium, int runsScored) {
		super(batsman, stadium, runsScored);
	}
	
	//Method to print the report
	public static void printReport() {
		System.out.println("BATSMAN RUNS SCORED REPORT\n*****************");
		System.out.println("CRICKET PLAYER: " + batsman);
		System.out.println("STADIUM: " + stadium);
		System.out.println("TOTAL RUNS SCORED: " + runsScored);
	}

}
