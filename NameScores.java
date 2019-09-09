/*
Names scores
Problem 22 
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?

*/


package euler;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.text.Collator;

public class NameScores {

	public static void main(String[] args) throws IOException {
		
		String FILEIN = "euler/input/names.txt";
		String FILEOUT = "euler/output/orderednames.txt";
		int count = 0;
		BufferedReader br = null;
		FileReader fr = null;
		FileWriter fw = null;
		//Collection object required so elements can be ordered as they are added and list has dynamic size
		List<String> lines = new ArrayList<String>();
		try {

			fr = new FileReader(FILEIN);
			br = new BufferedReader(fr);

			String sCurrentLine;

			br = new BufferedReader(new FileReader(FILEIN));

			while ((sCurrentLine = br.readLine()) != null) {
				lines.add(sCurrentLine.substring(1,sCurrentLine.length()-1));
				count++;
			}
			//System.out.println(" ");
			System.out.println("Lines: " + count);
			
			//Order List and write to file
			Collections.sort(lines, Collator.getInstance());
			
			//fw = new FileWriter(FILEOUT); 
			int pos = 1;
			int currTotal = 0;
			int temp = 0;
			for(String str: lines) {
				
				//fw.write(str + "\r\n");
				temp = (nameScore(str)*pos);
				currTotal += temp;
				pos++;
				System.out.println(str + " score = " + temp);
			}
			
			System.out.println("Total score = " + currTotal);

		} catch (IOException e) {

			e.printStackTrace();

		} finally {

			try {

				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
				
				//fw.close();	

			} catch (IOException ex) {

				ex.printStackTrace();

			}

		}

	}
	
	private static int nameScore(String name){
		
		//take in name and covert to lower case so same ascii value regardless of case inputted
		String lcn  = name.toLowerCase();
		
		//Convert to char array
		char [] word = lcn.toCharArray();
			
		//Get score for each letter and return sum total
		int i = 0;
		int score = 0;
		int cscore = 0;
		while(i < word.length){
		
			//System.out.println();
			cscore = (((int)word[i])-96);
			score+=cscore;
			i++;
		}
		
		return score;
	}

}