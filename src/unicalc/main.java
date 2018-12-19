package unicalc;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1, s2, s3;
		char word1[], word2[];
		int result1 = 0;
		int result2 = 0;
		int difference = 0;
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("Please enter words you want evaluated(Only first two will be evaluated).");
		s1 = scnr.next();
		s2 = scnr.next();
		
		word1 = s1.toCharArray();
		for(char letter:word1)
		{
			result1 += (int)letter;
			System.out.printf("%s:%d\n", letter, (int)letter);
		}
		
		word2 = s2.toCharArray();
		for(char letter:word2)
		{
			result2 += (int)letter;
			System.out.printf("%s:%d\n", letter, (int)letter);
		}
		
		if(result1 > result2)
			difference = result1 - result2;
		else
			difference = result2 - result1;
		
		System.out.printf("Difference (as absolute value): %d", difference);
	}

}
