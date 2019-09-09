/*
Create Tree to solve problem 17:

By starting at the top of the triangle below and moving to adjacent numbers on the row below, the maximum total from top to bottom is 23.

3
7 4
2 4 6
8 5 9 3

That is, 3 + 7 + 4 + 9 = 23.

Find the maximum total from top to bottom of the triangle below:

75
95 64
17 47 82
18 35 87 10
20 04 82 47 65
19 01 23 75 03 34
88 02 77 73 07 63 67
99 65 04 28 06 16 70 92
41 41 26 56 83 40 80 70 33
41 48 72 33 47 32 37 16 94 29
53 71 44 65 25 43 91 52 97 51 14
70 11 33 28 77 73 17 78 39 68 17 57
91 71 52 38 17 14 91 43 58 50 27 29 48
63 66 04 68 89 53 67 30 73 16 69 87 40 31
04 62 98 27 23 09 70 98 73 93 38 53 60 04 23

NOTE: As there are only 16384 routes, it is possible to solve this problem by trying every route. However, Problem 67, is the same challenge with a triangle containing one-hundred rows; it cannot be solved by brute force, and requires a clever method! ;o)

*/

package euler;

import  java.io.*;
import java.util.Arrays;

public class MaxPath{
	
	public static void main(String args[]) throws IOException{
		
		
		//Create 2D array with elements above
		
		//Check adjacent nodes(numbers) in the next row and pick biggest
		//Adjacent numbers are the ones with the same column index as current and column index to the right.
		//Pick biggest number then go to the next row
		
	try{	
				
		File in = new File(args[0]);
		int size = Integer.parseInt(args[1]);
		
		int [] [] em = new int [size] [size];
		String [][] emstr = new String[size][size];
				
		FileReader fr = new FileReader(in);
		
		BufferedReader br = new BufferedReader(fr);
		
		String str = null;
		
		int i = 0;
		str=br.readLine();
		
	do{
	
		emstr[i] = str.split("\\s");
	
	
	}
	while((str=br.readLine())!=null&&(++i<em.length));
		
		
		
		
	
	
	//for(String n:emstr[3]){System.out.print(n+",");}
	
	for(int k = 0;k<emstr.length;k++){
		
		for(int l = 0;l<emstr[k].length;l++){
		
		em[k][l] = Integer.parseInt(emstr[k][l]);
		
		//System.out.println(em[k][l]);
		
	}
		
		
	}
	
	
	
	int col = 0;
	int row = 0;
	int rown = 0;
	int sum = 0;
	
	while(row<15){
	
	sum = sum + em[row][col];
	
	System.out.println("****************************");
	System.out.println("Added: " + em[row][col]);
	System.out.println("****************************");
	System.out.println("Current Sum:" + sum);
	System.out.println("");
	//Get next row index
	rown = row + 1;
	
	if(rown<size){
		if((em[rown][col] < em[row+1][col+1])){
		
		col = col + 1;
		
		}
	}
	 ++row;	
	}
	
	
	
	System.out.println("Total Sum:" + sum);
	
		
	}
	catch(IOException e){
		
		e.printStackTrace();
		
	}
		
		
	}
	
	

}