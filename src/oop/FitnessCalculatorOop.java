package oop;

public class FitnessCalculatorOop extends UserInfoOop {

	public FitnessCalculatorOop(double height, double weight, double age, char gender) {
		super(height, weight, age, gender);
	}

	// overload for future adjustments
	public FitnessCalculatorOop(double weight) {
		super(0, weight, 0, ' ');
	}

	// override from UserInfoOop
	void displayInfo() {
		super.displayInfo();
		System.out.println("Fitness Caluclations: ");
	}

	double calculateBmi() {
		// height in meters
		// weight in kg
		double heightInMeters = getHeight() / 100;
		return getWeight() / (heightInMeters * heightInMeters);
	}

	double calculateBmr() {
		// height in cm
		// weight in kg
		if (getGender() == 'M') {
			return 88.362 + (13.397 * getWeight()) + (4.799 * getHeight()) - (5.677 * getAge());
		} else if (getGender() == 'F') {
			return 447.593 + (9.247 * getWeight()) + (3.098 * getHeight()) - (4.330 * getAge());
		}
		return 0;
	}

	double recommendedCalorieIntake() {
		double bmi = calculateBmi();
		double bmr = calculateBmr();

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

	double recommendedProteinIntake() {
		if (getWeight() > 0) {
			return getWeight() * 0.8;
		}
		return 0;
	}

	public double recommendedWaterIntake() {
		if (getWeight() > 0) {
			return getWeight() * 0.03;
		}
		return 0;
	}
}