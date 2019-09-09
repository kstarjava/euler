package euler;

/*This  program will find the longest Collatz sequence with a starting number  which is under  million
Collatz Description:
The following iterative sequence is defined for the set of positive integers:

n → n/2 (n is even)
n → 3n + 1 (n is odd)

Using the rule above and starting with 13, we generate the following sequence:

13 → 40 → 20 → 10 → 5 → 16 → 8 → 4 → 2 → 1

It can be seen that this sequence (starting at 13 and finishing at 1) contains 10 terms. Although it has not been proved yet (Collatz Problem), it is thought that all starting numbers finish at 1.

Which starting number, under one million, produces the longest chain?

NOTE: Once the chain starts the terms are allowed to go above one million.

*/

public class CollatzLong{

	public static void main(String args[]){
		
		long in = Long.parseLong(args[0]);
			
		//Inialise and declare loop variable
		long i = 500001L;
		
		//Intialise and declare step counter
		long s = 0L;
		
		//Initialise and declare maxsteps and start
		long max = 0L;
		long max_start = 0L;
		
		//Get current (start time)
		final long startTime = System.currentTimeMillis();
		
		while(i<in){
			
			s  = countSteps(i);
			
			if(s > max){
				
				max = s;
				max_start = i;
			}
			
			i++;
		}
		
				
		//Print Max and get end time
		final long endTime = System.currentTimeMillis();
		
		
		System.out.println("Starting number: " + max_start);
		System.out.println("Path has: " + max + " steps");
		
		System.out.println("Total execution time: " + (endTime - startTime) );
		
		
	}
	
	//Count Steps
	
	private static long countSteps(long n){
		
		long count = 0;
		
		while(n!=1){
			
			n = getNext(n);
			
			count++;
		}
		
		return count;
		
	}
	
	
	//Get next term
	private static long getNext(long n){
		
		if(n==1){
			
			return 1; 
		}
				
		else if(n%2==0){
		
			return (n/2);
		
		}
		
		else {
			
			return ((3)*(n) + 1);
			
		}
	
	
	}
	
	
	//Get next term when passed in is even
	/*private static long getNextEven(long n){
	
	return (n/2);
	
	}
	
	
	//Get next term when passed in is odd
	private static long getNextOdd(long n){
	
	return ((3)*(n) + 1);
	
	}*/


}