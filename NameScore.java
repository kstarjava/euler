/*
Problem 22
Using names.txt (right click and 'Save Link/Target As...'), a 46K text file containing over five-thousand first names, begin by sorting it into alphabetical order. Then working out the alphabetical value for each name, multiply this value by its alphabetical position in the list to obtain a name score.

For example, when the list is sorted into alphabetical order, COLIN, which is worth 3 + 15 + 12 + 9 + 14 = 53, is the 938th name in the list. So, COLIN would obtain a score of 938 × 53 = 49714.

What is the total of all the name scores in the file?
*/


package euler;

public class NameScore{
	
	public static void main (String args []){
	
	
	System.out.print(nameScore(args[0]));
	
	}
	
	
	private static int nameScore(String name){
		
		//take in name and covert to lower case
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