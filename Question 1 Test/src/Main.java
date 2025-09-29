import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int j_k;
		int h_k;
		int a_k;
		int j_g;
		int h_g;
		int a_g;
		int j_w;
		int h_w;
		int a_w;

		int[][] scores = new int[3][3];
		System.out.println("SA CRICKETEER APPLICATION\n----------------------------------------");

		System.out.println("Enter the number of runs scored by Jacques Kallis at KINGSMEAD: ");
		j_k = scanner.nextInt();
		System.out.println("Enter the number of runs scored by Hashim Amla at KINGSMEAD: ");
		h_k = scanner.nextInt();
		System.out.println("Enter the number of runs scored by AB de Villiers at KINGSMEAD: ");
		a_k = scanner.nextInt();
		System.out.println("Enter the number of runs scored by Jacques Kallis at ST GEORGES: ");
		j_g = scanner.nextInt();
		System.out.println("Enter the number of runs scored by Hashim Amla at ST GEORGES: ");
		h_g = scanner.nextInt();
		System.out.println("Enter the number of runs scored by AB de Villiers at ST GEORGES: ");
		a_g = scanner.nextInt();
		System.out.println("Enter the number of runs scored by Jacques Kallis at WANDERERS: ");
		j_w = scanner.nextInt();
		System.out.println("Enter the number of runs scored by Hashim Amla at WANDERERS: ");
		h_w = scanner.nextInt();
		System.out.println("Enter the number of runs scored by AB de Viliers at WANDERERS: ");
		a_w = scanner.nextInt();

		System.out.println(
				"\n----------------------------------------RUNS SCORED REPORT\n----------------------------------------");

		System.out.println("Jacques Kallis runs scored at KINGSMEAD: " + j_k);
		System.out.println("Jacques Kallis runs scored at ST GEORGES: " + j_g);
		System.out.println("Jacques Kallis runs scored at WANDERERS: " + j_w);

		System.out.println("\nHashim Amla runs scored at KINGSMEAD: " + h_k);
		System.out.println("Hashim Amla runs scored at ST GEORGES: " + h_g);
		System.out.println("Hashim Amla runs scored at WANDERERS: " + h_w);

		System.out.println("\nAB de Villiers runs scored at KINGSMEAD: " + a_k);
		System.out.println("AB de Villiers runs scored at ST GEORGES: " + a_g);
		System.out.println("AB de Villiers runs scored at WANDERERS: " + a_w);

		System.out.println(
				"\n----------------------------------------TOTAL RUNS AT STADIUMS\n----------------------------------------");
		int result_k = j_k + h_k + a_k;
		int result_g = j_g + h_g + a_g;
		int result_w = j_w + h_w + a_w;
		System.out.println("KINGSMEAD: " + result_k);
		System.out.println("ST GEORGES: " + result_g);
		System.out.println("WANDERERS: " + result_w);

		if (result_k > result_g && result_k > result_w) {
			System.out.println("\nSTADIUM WITH THE MOST RUNS: KINGSMEAD\n----------------------------------------");
		} else if (result_g > result_k && result_g > result_w) {
			System.out.println("\nSTADIUM WITH THE MOST RUNS: ST GEORGES\n----------------------------------------");
		} else if (result_w > result_k && result_g < result_w) {
			System.out.println("\nSTADIUM WITH THE MOST RUNS: WANDERERS\n----------------------------------------");
		}

		scores[0][0] = j_k;
		scores[0][1] = h_k;
		scores[0][2] = a_k;

		scores[1][0] = j_g;
		scores[1][1] = h_g;
		scores[1][2] = a_g;

		scores[2][0] = j_w;
		scores[2][1] = h_w;
		scores[2][2] = a_w;

		System.out.println("HIGHEST RUNS SCORED PER STADIUM");

		String[] stadiums = { "Kingsmead", "St Georges", "Wanderers" };

		String[] batsmen = { "Jacques Kallis", "Hashim Amla", "AB de Villiers" };

		int[][] runs = { { 5000, 3800, 4200 }, { 3500, 3700, 3900 }, { 6200, 5000, 5200 } };

		System.out.printf("%-12s | %-15s | %-5s%n", "Stadium", "Top Batsman", "Runs");
		System.out.println("-----------------------------------------------");

		for (int i = 0; i < stadiums.length; i++) {
			int maxRuns = runs[i][0];
			String topBatsman = batsmen[0];

			for (int j = 1; j < batsmen.length; j++) {
				if (runs[i][j] > maxRuns) {
					maxRuns = runs[i][j];
					topBatsman = batsmen[j];
				}
			}

			System.out.printf("%-12s | %-15s | %-5d%n", stadiums[i], topBatsman, maxRuns);
		}

		int highestStadiumTotal = 0;
		String bestStadium = "";

		for (int i = 0; i < stadiums.length; i++) {
			int stadiumTotal = 0;
			for (int j = 0; j < batsmen.length; j++) {
				stadiumTotal += runs[i][j];
			}
			if (stadiumTotal > highestStadiumTotal) {
				highestStadiumTotal = stadiumTotal;
				bestStadium = stadiums[i];
			}
		}

		System.out.println("\nStadium with the most runs: " + bestStadium + " (" + highestStadiumTotal + ")");
	}

}
