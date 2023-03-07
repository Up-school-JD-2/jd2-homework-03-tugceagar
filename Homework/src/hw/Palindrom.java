package hw;

import java.util.Scanner;

public class Palindrom {

	public static void main(String[] args) {
		String reverse = "";
		System.out.println("Bir kelime giriniz:");
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		int length = word.length();
		for(int i = length -1; i >=0; i-- ) {
			reverse += word.charAt(i);		
		}
		System.out.println("Reverse of the word = " + reverse);
		
		if(word.equals(reverse))
			System.out.println(word + " is a palindrom string");
		else
			System.out.println(word + " is not palindrom string");
	
		}
}