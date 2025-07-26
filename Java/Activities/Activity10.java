package Activities;

import java.util.HashSet;
import java.util.Set;

public class Activity10 {
	
	public static void main(String[] args) {
	Set<String> hs=new HashSet<>();
	hs.add("a");
	hs.add("b");
	hs.add("c");
	hs.add("d");
	hs.add("e");
	hs.add("f");
	System.out.println("Size of the set:"+ hs.size());
    boolean s = hs.remove("d");
    //System.out.println("s");
	if (hs.contains("Z"))
			{
		boolean yes= hs.remove("Z");
				{
				System.out.println("Z has to be removed");}
	}
	else {
		System.out.println("Z does not exist");}
	
	
	
	//if(hs.remove("x")) {
	//	System.out.println("Z has to be removed");}
	//else {
	//	System.out.println("Z does not exist");}
	}
    
}
