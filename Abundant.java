/*
Problem 23 - Non-Ambundant Sums

A perfect number is a number for which the sum of its proper divisors is exactly equal to the number. For example, the sum of the proper divisors of 28 would be 1 + 2 + 4 + 7 + 14 = 28, which means that 28 is a perfect number.

A number n is called deficient if the sum of its proper divisors is less than n and it is called abundant if this sum exceeds n.

As 12 is the smallest abundant number, 1 + 2 + 3 + 4 + 6 = 16, the smallest number that can be written as the sum of two abundant numbers is 24. By mathematical analysis, it can be shown that all integers greater than 28123 can be written as the sum of two abundant numbers. However, this upper limit cannot be reduced any further by analysis even though it is known that the greatest number that cannot be expressed as the sum of two abundant numbers is less than this limit.

Find the sum of all the positive integers which cannot be written as the sum of two abundant numbers.
*/



package euler;

import java.math.BigInteger;

public class Abundant{

	private static int LIMIT;

	public static void main (String args []){
	LIMIT  = Integer.parseInt(args[0]);	
	//Find factors
	//Find sum
	//Check if greater than n
	
	//Find all abundant numbers
	//Sum the combinations
	//Whats left is the numbers required - sum them
	
	//Need Big Integer to hold sum 
	//int sum = 0;
	BigInteger sum = new BigInteger("0");
	BigInteger tmp = new BigInteger("0");
	
	for(int j = 1;j < LIMIT; j++){
		
		for(int k = 1; k < LIMIT; k++){
		
		if(!(isAbundant(j)&&isAbundant(k)))
		{
			tmp = new BigInteger(String.valueOf(j+k));
			
			//System.out.println(j + " + " + k + " = " + tmp);		
			sum = sum.add(tmp);
		}
		
		//System.out.println("Running Sum = " + sum);		
		
		}

			
		
	}
	
	System.out.println("Total Sum: "+sum.divide(new BigInteger("2")));
	//Test to to see if a number is abundant
	//System.out.println(isAbundant(Integer.parseInt(args[0])));
		
	}
	
	public static boolean isAbundant(int n){
		
		//sum from 1 to n and check if abundant
		int sum = 0;
		for(int i = 1;i<n;i++){
			
			if(n%i==0)
				sum += i;
		}
	
		if(sum>n)
			return true;
		
		return false;
	}

}