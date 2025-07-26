package Activities;

import java.util.ArrayList;

public class Activity9 {
public static void main(String[] args) {
	ArrayList<String> myList = new ArrayList<String>();
		myList.add("Amrita");
		myList.add("subham");
		myList.add("sahana");
		myList.add("krishna");
		myList.add("ajit");
		
		for(String s:myList){
            System.out.println(s);
        }
	System.out.println(" 3rd element is" + myList.get(2));
	boolean yes= myList.contains("Amrita");{
	myList.remove("Amrita");
	
	System.out.println("New size of the Arraylist is :" + myList.size());
	
}}
}
