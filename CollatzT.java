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

public class CollatzT{

	public static void main(String args[]){
		
		int in = Integer.parseInt(args[0]);
		
			
		//Inialise and declare loop variable
		//int i  = 1;
		
		//Intialise and declare step counter
		//int s = 0;
		
		//Initialise and declare maxsteps and start
		/*int max = 0;
		int max_start = 0;
			
		while(i<in){
			
			s  = countSteps(i);
			
			if(s > max){
				
				max = s;
				max_start = i;
			}
			
			i++;
		}*/
		
		//System.out.println("Steps: " + countSteps(in));
		
		
		//Count steps between starting number and 1
		
		//Print Max
		System.out.println("Starting number: " + in);
		System.out.println("Path has: " + countSteps(in) + " steps");
		
		
		
	}
	
	//Count Steps
	
	private static int countSteps(int n){
		
		//int r = n;
		int count = 0;
		while(n!=1){
			
			if(n%2==0){
			
				n = getNext(n);
			
			}
			
			count++;
		}
		
		return count;
		
	}
	
	
	//Get next term
	private static int getNext(int n){
		
		if(n==1){
			
			return 1; 
		}
				
		else if(n%2==0){
		
			return getNextEven(n);
		
		}
		
		else {
			
			return getNextOdd(n);
			
		}
	
	
	}
	
	
	//Get next term when passed in is even
	private static int getNextEven(int n){
	
	return (n/2);
	
	}
	
	
	//Get next term when passed in is odd
	private static int getNextOdd(int n){
	
	return ((3)*(n) + 1);
	
	}


}