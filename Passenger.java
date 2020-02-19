
public class Passenger {
	
	private String name;
	private int birthYear;
	private double weight;
	private char gender;
	private int numCarryOn;
	
public Passenger() {
	name = "";
	birthYear = 1900;
	weight = 0.0;
	gender = 'u';
	numCarryOn = 0;
}
	
public Passenger (String name, int birthYear, double weight, char gender, int numCarryOn) {
	
}

public int calculateAge(int currentYear) {
	int age;
	if (currentYear > birthYear)
		age = currentYear - birthYear;
	else
		age = -1;
	return age;
}

public void gainWeight() {
	weight += 1;
}

public void gainWeight(double weight) {
	weight += weight;
}

public int getBirthYear() {
	return birthYear;
}

public char getGender() {
	return gender;
}

public String getName() {
	return name;
}

public double getWeight() {
	return weight;
}

public int getNumCarryOn() {
	return numCarryOn;
}

public boolean isFemale() {
	if (gender == 'f')
		return true;
	else
		return false;
}

public boolean isMale() {
	if (gender == 'm')
		return true;
	else
		return false;
}

public void loseWeight() {
	if (weight >= 1)
		weight -= 1;
}

public void loseWeight(double weight) {
	weight -= weight;
}



	public static void main(String[] args) {
		Passenger p1 = new Passenger();
		System.out.println(p1.name);

	}

}
