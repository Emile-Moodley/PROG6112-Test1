import java.util.Scanner;

public class Cricket {
	static Scanner scanner = new Scanner(System.in);
	
	static String batsman;
	static String stadium;
	static int runsScored;
	
	//Main method to get input
	public static void main(String[] args) {
		System.out.println("The cricketer name: ");
		batsman = scanner.nextLine();
		
		System.out.println("Enter the stadium: ");
		stadium = scanner.nextLine();
		
		System.out.println("Enter the total number of runs scored by  " + batsman + " at " + stadium + " :");
		runsScored = scanner.nextInt();
	}
	
	//Constructor
	public Cricket(String batsman, String stadium, int runsScored) {

	}
	
	//Method to get batsman name
	public String getBatsman() {
		return batsman;
	}

	//Methos to get stadium name
	public String getStadium() {
		return stadium;
	}

	//Method to get runs scored
	public int getRunsScored() {
		return runsScored;
	}
}
