package euler;

public class AmicablePair{

	public static void main (String args[]){
	
	//System.out.println(SumPDiv(Integer.parseInt(args[0])));
	
	int j,k;
	int mainsum = 0;
	
	for(j=1;j<10000;j++){
		
		for(k=1;k<10000;k++){
		
			if(j!=k)
				
				if((SumPDiv(j)==k)&&(SumPDiv(k)==j)){
				
					mainsum+=(j+k);
					System.out.println("Amicable Pair Found: " + j + " and " + k);
				}	
		}
		
	}
		
		System.out.println("Total Sum: " + mainsum);

	}
	
	private static int SumPDiv(int n){
	
	int sum = 0;
	int i;
	
	for(i = 1;i<n;i++){
	
	if(n%i==0)
		sum+=i;
	
	}
	
	return sum;
	
	}

}