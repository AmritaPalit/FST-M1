package Activities;

public class Car {
String color;
String transmission;
String make;
int tyres;
int doors;
 
public Car (String color,String transmission,String make,int tyres,int doors) {
this.color=color;
this.transmission=transmission;
this.make=make;
this.tyres = tyres;
this.doors = doors;
}

public void accelarate() {
System.out.println("Car is moving forward.");}
public void brake() {
System.out.println("Car has stopped.");}

public void displayCharacterstics(){
	System.out.println("Color of the Car: " + color);
	System.out.println("Make of the Car: " + make);
	System.out.println("Transmission of the Car: " + transmission);
	System.out.println("Number of doors on the car: " + doors);
    	System.out.println("Number of tyres on the car: " + tyres);
    }
}

