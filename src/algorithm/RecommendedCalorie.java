package algorithm;

public class RecommendedCalorie {

	public static void main(String[] args) {
		
		double bmi = 30.795847750865054;
		double bmr = 1680.3259999999998;

		double calories = 0;

		if (bmi < 18.5) {
			calories = bmr * 1.5;
		} else if (bmi >= 18.5 && bmi <= 24.9) {
			calories = bmr * 1.3;
		} else if (bmi > 24.9 && bmi <= 29.9) {
			calories = bmr;
		} else if (bmi > 29.9) {
			calories = bmr * 0.8;
		}
		
		System.out.println("Recommended calorie Intake: " + calories);

	}
}
