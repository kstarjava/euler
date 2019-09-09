package euler;

import java.io.*;
import java.math.BigInteger;
import java.util.List;
import java.util.ArrayList;
public class BigSum{
	
	public static void main(String args[]) throws IOException {
		
		
		
		//Create an ArrayList of BigIntegers to hold each number
		List<BigInteger> bil = new ArrayList<BigInteger>();
		
		//List<String> bil  = new ArrayList<String>();		
		
		//Create a file object from passed in filename
		File file_in = new File(args[0]);
		
		//Create File Reader Object
		FileReader fr = new FileReader(file_in);
		
		//Create Buffered File Reader Object
		BufferedReader br = new BufferedReader(fr);
		
		String s = null;
		
		try {
		
			
		//Keep Reading Lines until null
		
		//while((BigInteger bi = new BigInteger(br.readLine()))!=null){
		while((s = br.readLine())!=null){	
			//Create biginteger to hold each number
			
			BigInteger bi = new BigInteger(s);
			bil.add(bi);
			
		}
		
		//Create BigInteger to Hold Sum
		BigInteger sum = new BigInteger("0");
		
		//Print List (Test)
		for(BigInteger n:bil){
			
			//System.out.println(n);
			
			sum = sum.add(n);
			System.out.println(n);
			//System.out.println(sum);
		}
		
		System.out.println(sum);
		
		/*for(String str:bil){
			
			System.out.println(str);
			
		}*/
		
	}
	
		catch (Exception e){
            
			e.printStackTrace();
        }
		
		finally{
			
			
			if(br.readLine()!=null){
				
				//br.flush();
				br.close();
				
			}
			
			
			
		}
		
		
	
		
		
		
	}
	
	
	
}