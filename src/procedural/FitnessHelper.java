package procedural;

public class FitnessHelper {

	public static void main(String[] args) {
		// height in CM
		double height = defaultHeight();
		// height in M
		double heightInMeters = cmToMeters(height);
		// weight in KG
		double weight = defaultWeight();
		// age in YEARS
		double age = defaultAge();
		// M for male and F for female
		char gender = 'F';
		double bmi;
		double bmr;
		double recommendedProtien;
		double recommendedCalories;
		double recommendedWater;

		welcoming();
		displayInfo(height, weight, age, gender);

		bmi = calculateBmi(heightInMeters, weight, age);
		bmr = calculateBmr(height, weight, age, gender);

		recommendedCalories = recommendedCalorieIntake(bmi, bmr);
		recommendedProtien = recommendedProteinIntake(weight);
		recommendedWater = recommendedWaterIntake(weight);

		System.out.println("Recommended daily Calories Intake: " + recommendedCalories + " Calorie");
		System.out.println("Recommended daily Protien Intake: " + recommendedProtien + " Grams");
		System.out.println("Recommended daily Water Intake: " + recommendedWater + " Litres");

		System.err.println("Note: these calculations are general guideline and may vary depending\n"
				+ "on individual factors such as activity level, climate, and overall health.");
	}

	static void welcoming() {
		System.out.println("----- Welcome To The Fitness Helper -----");
	}

	static double defaultHeight() {
		return 170;
	}

	static double defaultWeight() {
		return 89.0;
	}

	static double defaultAge() {
		return 27.0;
	}

	static double cmToMeters(double height) {
		return height / 100;
	}

	static void displayInfo(double height, double weight, double age, char gender) {
		System.out.println("Height: " + height + " cm");
		System.out.println("Weight: " + weight + " kg");
		System.out.println("Age: " + age + " years");

		if (gender == 'M') {
			System.out.println("Gender: Male");
		} else if (gender == 'F') {
			System.out.println("Gender: Female");
		}

	}

	static double calculateBmi(double heightInMeters, double weight, double age) {
		if (heightInMeters > 0 && weight > 0 && age > 0) {
			return weight / (heightInMeters * heightInMeters);
		} else {
			System.err.println("Invalid height or weight or age");
		}
		return 0;
	}

	static double calculateBmr(double height, double weight, double age, char gender) {
		if (gender == 'M') {
			return 88.362 + (13.397 * weight) + (4.799 * height) - (5.677 * age);
		} else if (gender == 'F') {
			return 447.593 + (9.247 * weight) + (3.098 * height) - (4.330 * age);
		} else {
			System.err.println("Erorr");
		}
		return 0;
	}

	static double recommendedCalorieIntake(double bmi, double bmr) {

		if (bmi < 18.5) {
			return bmr * 1.5;
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			return bmr * 1.3;
		} else if (bmi > 24.9 && bmi <= 29.9) {
			return bmr;
		} else if (bmi > 29.9) {
			return bmr * 0.8;
		}
		return 0;
	}

	static double recommendedProteinIntake(double weight) {
		if (weight > 0) {
			return weight * 0.8;
		} else {
			System.out.println("Invalid weight");
		}
		return 0;
	}

	static double recommendedWaterIntake(double weight) {
		if (weight > 0) {
			return weight * 0.03;
		} else {
			System.out.println("Invalid weight");
		}
		return 0;
	}
}