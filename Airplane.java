public class Airplane{

private Passenger[] passengers = new Passenger[0];
private String airplaneName;
private int numPassengers;

public Airplane(){
	passengers = new Passenger[100];
	numPassengers = 0;
}

public Airplane(String planestring){
	passengers = new Passenger[100];
	numPassengers = 0;
}

public Airplane(int planeint){
	if (planeint > 0)
		passengers = new Passenger[planeint];
	else
		passengers = new Passenger[0];
	numPassengers = 0;
}

public Airplane(String planestring, int planeint){
	airplaneName = planestring;
	if (planeint > 0)
		passengers = new Passenger[planeint];
	else
		passengers = new Passenger[0];
}

public void resizePassengerArray() {
	Passenger[] temp = new Passenger[passengers.length];
	for (int i = 0; i < temp.length; i++) {
		temp[i] = passengers[i];}
	passengers = new Passenger[passengers.length * 2];
	for (int i = 0; i < temp.length; i++) {
		passengers[i] = temp[i];}
}

public void addPassenger(Passenger addMe){
	if (numPassengers < passengers.length)
		passengers[numPassengers++] = addMe;
	else {
		resizePassengerArray();
		passengers[numPassengers++] = addMe;}
}

public String getAirplaneName(){
	return airplaneName;
}

public Passenger getPassenger(int nthPassenger){
	if (nthPassenger > 0)
		return passengers[nthPassenger];
	else
		return null;
}

public int getNumPassengers(){
	return numPassengers;
}

public Passenger getFirstPassenger(){
	return passengers[0];
}

public Passenger getLastPassenger(){
	return passengers[passengers.length-1];
}

public Passenger[] getPassengers(){
	return passengers;
}

public void setAirplaneName(String nameOfAirplane){
	airplaneName = nameOfAirplane;
}

public void printAllDetails(){
	System.out.printf("AirplaneName: %20s | Number of Passengers: %4d | Airplane Size: %4d\n" , airplaneName, numPassengers, passengers);
	 
}

public Passenger removePassenger(int kickPassenger){
	return passengers[kickPassenger];
}

public void removeAllPassengers(){
	
}

public double getTotalWeightOfAllPassengers(){
	double totalWeight = 0;
	for (int i = 0; i < passengers.length; i++){
		totalWeight += passengers[i].getWeight();
	}
	return totalWeight;
}

public double getAverageWeightOfAllPassengers(){
	double averageWeight = 0;
	for (int i = 0; i < passengers.length; i++){
		averageWeight += passengers[i].getWeight();
	}
	return averageWeight /= passengers.length;
}



	public static void main(String[] args) {
		

	}

}