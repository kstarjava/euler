package euler;

import java.util.List;
import java.util.ArrayList;
import java.math.BigInteger;
import java.util.TreeSet;
import java.math.BigDecimal;

public class TestContainer{

	public static void main (String args[]){
	
	//List abundant numbers to limit taken in
	
	final double LIM = Double.parseDouble(args[0]);
	List<Integer> abundants = new ArrayList<Integer>();
	for(int i = 12; i <= LIM; i++){
		
		//Print if abundant
		
		if(euler.Abundant.isAbundant(i)){
			//System.out.println(i);
			//Add to list
			abundants.add(i);
			//System.out.println(i);
		}
	}
	
	BigInteger absum = new BigInteger("0");
	BigInteger tmp = new BigInteger("0");
	BigInteger BigLIM = new BigInteger(args[0]); //Lim as big int
	TreeSet<String> myset = new TreeSet<String>();
	//get sum of all abundants 
	for(Integer about:abundants){
		
		for(Integer abin:abundants){
			
			tmp = new BigInteger(String.valueOf(about + abin));
			if((tmp.compareTo(BigLIM)==-1)||(tmp.compareTo(BigLIM)==0)){
			//absum = absum.add(tmp);
			String s = tmp.toString();
			//System.out.println(about + " + " + abin + " = " + tmp);
			//if(myset.add(s)){System.out.println("Added: " + s);}
			myset.add(s);
			}
			
			//System.out.println("Current sum: " + absum);
		}
	}
	//absum = absum.divide(new BigInteger("2"));
	//System.out.println("*************************");
	//System.out.println("Abundant sum: " + absum);
	//Variable for holding total sum 1 -> n
	
	BigDecimal totalsum = new BigDecimal("0");
	//double totalsum = (LIM/2)*
	
	System.out.println("Now summing unique set contents........");
	for(String sum:myset){
		
		tmp = new BigInteger(sum);
		absum = absum.add(tmp);
		
		
	}
	
		System.out.println("Total abundant sum: " + absum);
		totalsum = new BigDecimal(String.valueOf((LIM/2)*(LIM+1)));
		System.out.println("Total sum: " + totalsum);
		BigInteger diff = totalsum.toBigInteger().subtract(absum);
		System.out.println("Difference " + diff);
	
	}
	
}