/*
This program finds the number of digits in a number of the form a^n, where a is the base and n is the power

Relates to Project Euler Problem 16:
2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.

What is the sum of the digits of the number 2^1000?

Tried to split string using \\d however not working so did it the following inefficient way - still works :)
*/


package euler;

import java.math.BigInteger;
import java.util.regex.Pattern;

public class PowerSum{

	public static void main(String args[]){
	
	BigInteger holder = new BigInteger(args[0]);
	
	
	holder = holder.pow(Integer.parseInt(args[1]));
		
	String num = holder.toString();
		
	int count = 0;
	int k = 0;
	int j = 1;
	long sum = 0L;
	
	
	while(j<num.length()+1){
		
	sum = sum + Integer.parseInt(num.substring(k,j));	
	
	count++;
	k++;
	j++;
		
	}
	System.out.println("Num: " + num);
	System.out.println("Sum: " + sum);
	System.out.println("Number of digits: " + count);
	
	
	}

}