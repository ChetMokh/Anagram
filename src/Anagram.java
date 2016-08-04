/**
 * Title: Anagram.java
 * Abstract: This program gets two different strings and checks if they are anagram or not.
 * Author: Arash Aria
 * ID: 4210
 * Date: 09/25/2015 
 */

import java.util.Scanner;
import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		char[] firstWord, secondWord;
		Scanner myScanner = new Scanner(System.in);
		System.out.println("Enter First Word:");
		firstWord = myScanner.nextLine().toCharArray();
		System.out.println("Enter Second Word:");
		secondWord = myScanner.nextLine().toCharArray();
		Arrays.sort(firstWord);
		Arrays.sort(secondWord);
		if (Arrays.equals(firstWord, secondWord)) {
			
			System.out.println("ANAGRAM");	
		} else {
			System.out.println("NO ANAGRAM");
		}
		System.out.println("---DONE---");
	}
}
