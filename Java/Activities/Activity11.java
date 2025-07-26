package Activities;
import java.util.Map;
import java.util.HashMap;

public class Activity11 {
	
	//class Main {

	    public static void main(String[] args) {
	        // Creating a map using the HashMap
	        Map<Integer, String> Colors = new HashMap<>();

	        // Insert elements to the map
	        Colors.put(1,"Red");
	        Colors.put(2,"Green");
	        Colors.put(3,"Blue");
	        Colors.put(4,"Black");
	        Colors.put(5,"White");
	        System.out.println("Map: " + Colors);
String value=Colors.remove(2);
	        // Access keys of the map
	        boolean string= Colors.containsValue("Green");
	        System.out.println("Value contains Green");

	        // Access values of the map
	        System.out.println("No of colours left: " + Colors.size());

	       
	    }
	}

