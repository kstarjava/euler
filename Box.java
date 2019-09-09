//package euler;

public class Box{
	
	
	
	
	//Declare constructor
	public Box(int[][] in){
		
		
		this.in = new int[in.length][in[0].length];
		
		for(int i = 0;i<in.length;i++){
				
			for(int j = 0;j<in[i].length;j++){
			
			this.in[i][j] = in[i][j];
			
			//System.out.println("Check: " + this.in[i][j])
			
		}
			
			
		}
		
		
		
	}
	
	
	//Declare test array
	
	
	/*public static void main(String args[]){
		
	a[0][0] = 3;
	a[1][0] = 2;
	a[2][0] = 1;
	a[3][0] = 7;
	
	a[0][1] = 4;
	a[1][1] = 8;
	a[2][1] = 6;
	a[3][1] = 2;
	
	a[0][2] = 5;
	a[1][2] = 10;
	a[2][2] = 12;
	a[3][2] = 5;
	
	a[0][3] = 3;
	a[1][3] = 2;
	a[2][3] = 8;
	a[3][3] = 1;
	
	System.out.println("Vertical Max: " + getVertical(0,0));
	
	System.out.println("Horizontal Max: " + getHorizontal(0,0));
	
	
	System.out.println("Negative Diagonal: " + getDiagonalN(0,0));
	
	System.out.println("Positive Diagonal: " + getDiagonalP(0,0));
	
	System.out.println("Maximum Product: " + getMax(0,0));
	
	
	
	
	}*/

	
	
	private static int getVertical(int r, int c){
	
	//Initialise and Declare max and prod
	int max = 0;
	int prod = 1;
	
	//Initialise loop variables
	int i,j;
	
	for(i = c; i < 4; i++){
		
		
		for(j = r; j < 4; j++){
		
			prod  = prod*a[j][i];
			System.out.println("[" + j + "]" + "[" + i + "] = " + a[j][i]);
						
		}
		
		if(prod>max){
			
			max = prod;
			
			}
		
		//Reset Product
		prod = 1;
	
		}
		
		return max;
	}	
	
	
	private static int getHorizontal(int r, int c){
	
	//Initialise and Declare max and prod
	int max = 0;
	int prod = 1;
	
	//Initialise loop variables
	int i,j;
	
	for(i = r; i < 4; i++){
		
		
		for(j = c; j < 4; j++){
			
			prod  = prod*a[i][j];
			System.out.println("[" + i + "]" + "[" + j + "] = " + a[i][j]);
						
		}
		
		if(prod>max){
			
			max = prod;
			
			}
		
		//Reset Product
		prod = 1;
	
		}
	
	return max;
	
	}



	private static int getDiagonalN(int r, int c){
		
		int prod = 1;
		
		int i;
		
		for(i = 0; i<4; i++){
			
			
			prod = prod*a[r+i][c+i];
		}
		
		return prod;
	}

	private static int getDiagonalP(int r, int c){
		
		//Add three to row to navigate to bottom left of box
		int rn = r+3;
		int prod = 1;
		
		int i;
		
		for(i = 0; i<4; i++){
			
			
			prod = prod*a[rn-i][c+i];
		}
		
		return prod;
	}
	
	private static int getMax(int r, int c){
	
	int max = 0;
	int temp;
	
	//Check Vertical
	temp  = getVertical(r,c); 
	if(temp > max){
		
		max = temp;
	}
	
	//Check Horizontal
	temp  = getHorizontal(r,c); 
	if(temp > max){
		
		max = temp;
	}
	
	//Check Negative Diagonal
	temp  = getDiagonalN(r,c); 
	if(temp > max){
		
		max = temp;
	}
	
	//Check Positive Diagonal
	temp  = getDiagonalP(r,c); 
	if(temp > max){
		
		max = temp;
	}
	
	return max;
	
	}
	
}	

