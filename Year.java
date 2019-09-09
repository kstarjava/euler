package euler;

public class Year{
	
	//Store the year where 1st of Jan was a Sunday 
	public final int REF = 1899;
	public final int FIRST = 31;
	public final int WEEK = 7;
	public final int FOUR = 4;
	Boolean leap;
	int days;
	int start;
	
	public Year(int year){
	
	leap = isLeap(year);
	days = getDays();
	start = getJan1(year);
	}
	
	boolean isLeap(int year){
	
		if((year%4==0&&year%100!=0)||(year%400==0)){
	
		return true;
	
	}
	
	return false;
	
	}
	
	int getDays(){
		
		if(leap){
			
			return 366;
		}
		else{
			
			return 365;
			
		}
		
		
	}
	
	int getJan1(int year){
		
		//This date jumps a day after every leap year due to the extra day the year before 
		int diff;
		
		//Get difference between ref and current year
		diff  = (year) - (REF);
		
		
		
		return (((diff) + ((diff/FOUR)-1)%FIRST)%WEEK);
		//Working for  most but not 1989 - may be something to do with the -1 or the WEEK mod or both. 
		
	}
	
	


}