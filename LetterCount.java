/*
Project Euler: Problem 17


If the numbers 1 to 5 are written out in words: one, two, three, four, five, then there are 3 + 3 + 5 + 4 + 4 = 19 letters used in total.

If all the numbers from 1 to 1000 (one thousand) inclusive were written out in words, how many letters would be used?


NOTE: Do not count spaces or hyphens. For example, 342 (three hundred and forty-two) contains 23 letters and 115 (one hundred and fifteen) contains 20 letters. The use of "and" when writing out numbers is in compliance with British usage.


*/

package euler;


public class LetterCount{
	
	public static void main(String args[]){
		
		//Take in upper limit
		int m  = Integer.parseInt(args[0]);
		/*String main = null;
		char [] mainns;
		if (n>1000){
			
			System.err.println("Number must be 1000 or less");
		}
		
		else if (n==1000){
			
			System.err.println("one thousand");
		}
		
		else if (n==0){
			
			System.err.println("zero");
		}
		else{
		//Declare variables to hold digits, tens and hundreds
		int d,t,h;
		String td = "";
		String tens = "";
		String digit = "";
		String hdreds = "";
			
		//Get Digit
		d = n%10;
		
		//Get 10s
		t  = (n/10)%10;
		
		//Get 100s
		h = (n/100)%10;
		
	
			//Get two right most digits
			if(t<2){	
				
				td = singleD20(n%100);  
			}
			else{
				
				digit  = singleD20(d);
				tens = getT(t);
				td = tens + " " + digit;
			}
			
			//Get hundreds (left most digit) - passing in extra paramter to getH method to determine if "and" need after "hundred"
			if(h>0 && d==0 && t==0){
			hdreds = getH(h,0); 
			}			
			else if(h>0 && (d!=0 || t!=0)){
			hdreds = getH(h,1); 
			}
			
		//main = hdreds + " " + td;
		main = hdreds + " "+ td;
		
		System.out.println(main.trim());
		}		
		
		//Replace Spaces in string with empty strings and map to char array
		mainns = (main.replaceAll("\\s","")).toCharArray();
		System.out.println(mainns);
		System.out.println("Length: " + mainns.length);*/
		
		
		
	
		int i =1;
		int sum = 0;
		do{
			
			sum = sum + countLetters(convert2Word(i));
			
		}while(++i<m+1);
		
		System.out.println("Sum: " + sum);
	}
	
	
	private static String singleD20(int n){
		
		String s = "";
		switch(n){
			case 1: 
				s = "one";
				break;
			case 2: 
				s = "two";
				break;
			case 3: 
				s = "three";
				break;
			case 4: 
				s = "four";
				break;
			case 5:	
				s = "five";
				break;
			case 6: 
				s = "six";
				break;
			case 7: 
				s = "seven";
				break;
			case 8: 
				s = "eight";
				break;
			case 9: 
				s = "nine";
				break;
			case 10: 
				s = "ten";
				break;
			case 11: 
				s = "eleven";
				break;
			case 12: 
				s = "twelve";
				break;
			case 13: 
				s = "thirteen";
				break;
			case 14: 
				s = "fourteen";
				break;
			case 15:	
				s = "fifteen";
				break;
			case 16: 
				s = "sixteen";
				break;
			case 17: 
				s = "seventeen";
				break;
			case 18: 
				s = "eighteen";
				break;
			case 19: 
				s = "nineteen";
				break;	
		
		}	
			return s;
	}
	
	//Translate multiples of 10
	private static String getT(int n){
		
		String s = null;
		switch(n){
			case 2: 
				s = "twenty";
				break;
			case 3: 
				s = "thirty";
				break;
			case 4: 
				s = "forty";
				break;
			case 5:	
				s = "fifty";
				break;
			case 6: 
				s = "sixty";
				break;
			case 7: 
				s = "seventy";
				break;
			case 8: 
				s = "eighty";
				break;
			case 9: 
				s = "ninety";
				break;
			default: 
				s = "number is greater than 100";
		}	
			return s;
	}
	
	//Method takes in an extra parameter to determine whether "and" should be included in the return string
	private static String getH(int n, int ind){
	
	String app = null;
	String s = singleD20(n);
	
	switch(ind){
		case 0:
			app = " hundred";
			break;
		case 1:
			app = " hundred and";
			
		}
	
	return s + app;
	
		
	}
	
	
	private static int countLetters(String str){
		char  [] mainns;
		
		
		mainns = (str.replaceAll("\\s","")).toCharArray();
		
		return mainns.length;
			
	}
	
	private static String convert2Word(int n){
		
		if (n>1000){
			
			return "Number must be 1000 or less";
		}
		
		else if (n==1000){
			
			return "one thousand";
		}
		
		else if (n==0){
			
			return "zero";
		}
		
		else{
		//Declare variables to hold digits, tens and hundreds
		int d,t,h;
		String td = "";
		String tens = "";
		String digit = "";
		String hdreds = "";
		String main = "";
			
		//Get Digit
		d = n%10;
		
		//Get 10s
		t  = (n/10)%10;
		
		//Get 100s
		h = (n/100)%10;
		
	
			//Get two right most digits when less than 20
			if(t<2){	
				
				td = singleD20(n%100);  
			}
			else{
				
				digit  = singleD20(d);
				tens = getT(t);
				td = tens + " " + digit;
			}
			
			//Get hundreds (left most digit) - passing in extra parameter to getH method to determine if "and" need after "hundred"
			if(h>0 && d==0 && t==0){
			hdreds = getH(h,0); 
			}			
			else if(h>0 && (d!=0 || t!=0)){
			hdreds = getH(h,1); 
			}
			
		//main = hdreds + " " + td;
		main = hdreds + " " + td;
		
		return main;	
			
			
		}
		
		
	}
	
	
}