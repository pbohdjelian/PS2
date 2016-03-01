package base;

import java.util.Scanner;

public class TuitionBill {
	private static double tuition;
	private static double tuitionIncrease;
	private static double apr;
	private static int term;

	public static void main(String[] args) {

		Scanner user_input = new Scanner(System.in);
		System.out.println("Total tuition:");
		double tuition = user_input.nextDouble();
		System.out.println(" Percent increase for tuition:");
		double tuitionIncrease = user_input.nextDouble();
		System.out.println(" % APR:");
		double apr = user_input.nextDouble();
		System.out.println("Loan term:");
		double term = user_input.nextDouble();
	

	}

	public static double tuitioncalculation(double tuition, double tuitionIncrease, double apr, double term) {
		double loan = 0;
		for (int x = 4; x > 0; x--) {
			double totalCost = tuition;
			tuition *= (1 + tuitionIncrease);
			loan += totalCost;

		}
		loan = loan * Math.pow((1 + apr / 12), (12 * term));

		return loan;
	}

	double monthly(double loan, double term) {
		double monthly = loan / (12 * term);
		System.out.println("Monthly payment is "+ monthly);

		return monthly;
	}


					
				
				
	}

