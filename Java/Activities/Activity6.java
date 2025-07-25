package Activities;

public class Activity6 {
	public static void main(String[] args) {
        //There is a plane with max 10 passengers
        Plane plane = new Plane(10);
        plane.onboard("Amri");
        plane.onboard("abhi");
        plane.onboard("Sam");

	System.out.println("Plane took off at: " + plane.takeOff());
	  System.out.println("People on the plane: " + plane.getPassengers());
	  plane.land();
	  System.out.println("Plane landed at: " + plane.getLastTimeLanded());
      System.out.println("People on the plane after landing: " + plane.getPassengers());
  }}