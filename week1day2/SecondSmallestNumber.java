package week1day2;

import java.util.Arrays;

public class SecondSmallestNumber {

	public static void main(String[] args) {
		int[] num={23,45,67,32,89,22};
		Arrays.sort(num);
		
	
		System.out.println("The Sorted Array:");
		System.out.println(Arrays.toString(num));
		System.out.println("The  Second smallest number in the array "+num[1]);
			
	}		

}
