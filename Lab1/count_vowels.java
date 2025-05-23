import java.util.Scanner;  



public class count_vowels{


	public static void main(String[] args) {

		String s = args[0];

		System.out.println(s.length()); 


		// Exercise 1.1. counting the number of vowels
		int counter = 0;

		for(int k=0; k<s.length(); k++){

			switch(s.charAt(k)){
				case 'a': counter++; break;
				case 'e': counter++; break;
				case 'i': counter++; break;
				case 'o': counter++; break;
				case 'u': counter++; break;
				case 'A': counter++; break;
				case 'E': counter++; break;
				case 'I': counter++; break;
				case 'O': counter++; break;
				case 'U': counter++; break;
				}
			

		}
		System.out.println("Number of vowels is : " + counter);


}}