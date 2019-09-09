package euler;

public class TestYear{
	
	public static void main (String args[]){
	
	//Declare Year
	Year myyear = new Year(Integer.parseInt(args[0]));
	
	System.out.println(myyear.leap);
	System.out.println(myyear.days);
	System.out.println(myyear.start);
	
	
	}

}