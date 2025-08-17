package Activities;

public class Activity4 {
public static void main(String[] args) {
int[] numbers =  {3,6,9,2,1,0,4};

 for (int i=0; i < numbers.length-1; i ++) {
	 for (int j=0;j < numbers.length-1-i;j++) {
		 if(numbers[j]>numbers[j+1]) {
			 int temp = numbers[j];
			 numbers[j]=numbers[j+1];
			 numbers[j+1]= temp;
			 
		 }
	 }
 }
 System.out.print("Sorted array:  ");
 printArray(numbers);
}

private static void printArray(int[] array) {
	// TODO Auto-generated method stub
	for (int num : array) {
		System.out.print(num + " ");
	} 
	System.out.println();
}}
