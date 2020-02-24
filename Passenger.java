
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

public Passenger(String name, int birthYear, double weight, char gender, int numCarryOn) {
	if (numCarryOn<0)
		numCarryOn = 0;
	else if (numCarryOn>2)
		numCarryOn = 2;
	
	if (weight<0)
		weight = -1.0;
	
	if (gender == 'm')
		gender = 'm';
	else if (gender == 'f')
		gender = 'f';
	else
		gender = 'u';
		
	
	this.name = name;
	this.birthYear = birthYear;
	this.weight = weight;
	this.gender = gender;
	this.numCarryOn = numCarryOn;
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
	if (weight >= 1)
		weight += 1;
}

public void gainWeight(double gainedWeight) {
	if (gainedWeight>0.0)
		weight += gainedWeight;
	
	if (weight<0)
		weight = 0;
	
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

public void loseWeight(double lostWeight) {
		weight -= lostWeight;
	
	if (weight<0)
		weight = 0;
}

public void printDetails() {
	System.out.printf("Name: %20s | Year of Birth: %4d | Weight: %10.2f | Gender: %c | NumCarryOn: %2d\n", name, birthYear, weight, gender, numCarryOn);
}

public void setGender(char newGender) {
	if (newGender == 'm')
		gender = 'm';
	else if (newGender == 'f')
		gender = 'f';
	else
		gender = 'u';
}

public void setName(String sName) {
	name = sName;
}

public void setBirthYear(int bYear) {
	birthYear = bYear;
}

public void setWeight(double newWeight) {
	if (newWeight<0)
		weight = -1;
	else
		weight = newWeight;
}

public void setNumCarryOn(int newCarryOn) {
	if (newCarryOn<0)
		numCarryOn = 0;
	else if (newCarryOn>2)
		numCarryOn = 2;
}

	public static void main(String[] args) {
		Passenger p1 = new Passenger();
		System.out.println(p1.name);

	}

}
