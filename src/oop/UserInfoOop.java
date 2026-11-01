package oop;

public class UserInfoOop {

	private double height;
	private double weight;
	private double age;
	private char gender;

	UserInfoOop() {

	}

	public UserInfoOop(double height, double weight, double age, char gender) {
		super();
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.gender = gender;
	}

	public double getHeight() {
		return height;
	}

	public double getWeight() {
		return weight;
	}

	public double getAge() {
		return age;
	}

	public char getGender() {
		return gender;
	}

	public void setHeight(double height) {
		if (height > 0 && height < 272) {
			this.height = height;
		}
	}

	public void setWeight(double weight) {
		if (weight > 0 && weight < 635) {
			this.weight = weight;
		}
	}

	public void setAge(double age) {
		if (age > 0 && age < 116) {
			this.age = age;
		}
	}

	public void setGender(char gender) {
		if (gender == 'M' || gender == 'F') {
			this.gender = gender;
		}
	}

	void displayInfo() {
		System.out.println("-------------- Fitness Helper --------------");

		if ((getGender() == 'M' || getGender() == 'F') && getAge() > 0 && getWeight() > 0 && getHeight() > 0) {
			System.out.println("Height: " + getHeight() + " cm");
			System.out.println("Weight: " + getWeight() + " kg");
			System.out.println("Age: " + getAge() + " years");

			if (getGender() == 'M') {
				System.out.println("Gender: Male");
			} else if (getGender() == 'F') {
				System.out.println("Gender: Female");
			}
		} else {
			System.err.println("Invalid Input");
		}
	}

}
