package arrays;

public class Average {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[]{20, 30, 25, 35, -16, 60, -100};
	       //calculate sum of all array elements
	    
		int sum = 0;
	       for(int i=0; i < numbers.length ; i++)
	        sum = sum + numbers[i];
	       //calculate average value
	        double average = sum / numbers.length;
	        System.out.println("Average value of the array of integers is : " + average); 
	   }
	}


