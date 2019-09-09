//This program counts the number of Sundays which occur on the first of the month in the 21st century
//Note:  Sundays will start on day 0

package euler;

public class FirstSunday{
	
	public static void main(String args[]){
	//Initialise array to hold value for each month - second entry (Feb) will be updated to 29 if leap year
	int [] months = {31,28,31,30,31,30,31,31,30,31,30,31};
	int WEEK = 7;
	//Variable to hold start and end years
	int start = Integer.parseInt(args[0]);
	
	
	int end = Integer.parseInt(args[1]);
	
	
	//Variable to hold the number of days in the year
	int totaldays;
	

	//Counter variable for number of Sundays
	int count = 0;	
	int tempcount = 0;
	//Loop variable
	int j;
	
	//Set start weekday to be 2 - as 1st of Jan was Tuesday in 1901
	int wday = 2;
	int yday = 1;	//Year day is set to 1
	
	//Iterate through each year
	while(start<=end){
		
		//Reset yearday month loop variable
		j = 0;
		yday = 1;
		//Check if leap and set number of days
		if(isLeap(start)){
		
			totaldays = 366;
			months[1] = 29;
		
		}
		else{
		
			totaldays = 365;
			months[1] = 28;
		
		}
		
	
		//Iterate through days of a year
		while((yday<=totaldays)&&(j<months.length)){
			
			//Increment weekday and by number of days in current month
			wday+=months[j];
			yday+=months[j];
			
			if(wday%WEEK==0){
				
				count++;
				
			}
			
			j++;
			//System.out.println(j);
			
		}
	
	//Print current year info
	System.out.println("Year: " + start);
	System.out.println("**************");
	System.out.println("Current count: " + count);
	System.out.println(" ");
	
	//Increment year
	start++;
	}
	
	System.out.println("Number of Sunday Firsts from 1901 to " + end + " is: " + count);
	
	}
	
	private static boolean isLeap(int year){
	
	if((year%4==0&&year%100!=0)||(year%400==0)){
	
	return true;
	
	}
	
	return false;
	
	}
	
	

}