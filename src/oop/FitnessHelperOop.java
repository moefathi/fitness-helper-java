package oop;

import java.util.Scanner;

public class FitnessHelperOop {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("----- Welcome To The Fitness Helper -----");
		System.out.println("Enter height in cm: ");
		double height = scanner.nextDouble();
		System.out.println("Enter weight in kg: ");
		double weight = scanner.nextDouble();
		System.out.println("Enter age: ");
		double age = scanner.nextDouble();
		System.out.println("Enter gender (M for Male & F for Female): ");
		char gender = scanner.next().charAt(0);

		FitnessCalculatorOop trainer = new FitnessCalculatorOop(height, weight, age, gender);
		trainer.displayInfo();

		System.out.println("Recommended daily Calories Intake: " + trainer.recommendedCalorieIntake() + " Calorie");
		System.out.println("Recommended daily Protien Intake: " + trainer.recommendedProteinIntake() + " Grams");
		System.out.println("Recommended daily Water Intake: " + trainer.recommendedWaterIntake() + " Litres");

		System.err.println("Note: these calculations are general guideline and may vary depending\n"
				+ "on individual factors such as activity level, climate, and overall health.");
	}
}
