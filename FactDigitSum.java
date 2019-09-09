package euler;

import java.math.BigInteger;

public class FactDigitSum{

	public static void main(String args[]){
	
	BigInteger n  = new BigInteger(args[0]);
	
	//Change to string
	String digits = fact(n).toString();
	
	//Compute sum of digits
	
	int j;
	int sum = 0;
	
	for(j=0;j<digits.length();j++){
		
		sum+=Integer.parseInt(digits.substring(j,j+1));
		
	}
	
	System.out.println(sum);
	
	}
	
	
	private static BigInteger fact(BigInteger n){
		
		
		
		if(n.equals(BigInteger.ONE))
			return BigInteger.ONE;
		else 
			return n.multiply(fact(n.subtract(BigInteger.ONE)));
		
	}
}