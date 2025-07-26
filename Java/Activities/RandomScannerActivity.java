package Activities;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

import com.sun.tools.javac.util.List;

public class RandomScannerActivity {
public static void main(String[] args) {
Scanner scan=new Scanner(System.in);{
System.out.println("Enter the value: ");}
ArrayList<Integer> list = new ArrayList<Integer>();


while(scan.hasNextInt()) {
    list.add(scan.nextInt());
}
Random indexGen =  new Random();

Integer[] nums = list.toArray(new Integer[0]);
int index = indexGen.nextInt(nums.length);
System.out.println("Index value generated: " + index);
System.out.println("Value in arary at generated index: " + nums[index]);
}}