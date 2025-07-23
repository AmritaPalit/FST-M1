package Activities;

import java.util.Arrays;

public class Activity2 {
	public static void main(String[] args) {
        //Initialize the array
        int[] numArr = {10, 77, 10, 54, -11, 10};
        System.out.println("Original Array: " + Arrays.toString(numArr));
        
        //Set constants
        int Num = 10;
        int Sum = 30;

        //Print result
        System.out.println("Result: " + result(numArr, Num, Sum));
}
	public static boolean result(int[] numbers, int Num, int Sum) {
        int temp_sum = 0;
        //Loop through array
        for (int number : numbers) {
            //If value is 10
            if (number == Num) {
                //Add them
                temp_sum += Num;
            }

            //Sum should not be more than 30
            if (temp_sum > Sum) {
                break;
            }
        }
        return temp_sum == Sum;
       }
   }