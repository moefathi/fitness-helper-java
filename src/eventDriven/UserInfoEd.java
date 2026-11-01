package eventDriven;

public class UserInfoEd {

	private double height;
	private double weight;
	private double age;
	private char gender;

	UserInfoEd() {

	}

	public UserInfoEd(double height, double weight, double age, char gender) {
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
}
