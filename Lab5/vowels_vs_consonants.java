
import java.util.Scanner;


public class vowels_vs_consonants{
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter a string");
		String s = input.next();
		System.out.println("Comparing the number of vowels"
			+" against the number of consonants...");
		
		int[] counts_vc = total_num_vc(s);
		if(counts_vc[0]> counts_vc[1]){
			System.out.println("String contains more vowels"
				+ " than consonants");

		}
		else{
			System.out.println("String contains more consonants"
				+ " than vowels");

		}



	}


	public static int[] total_num_vc(String mystring){

		int[] vowels_vs_cons = new int[2];

		int counter_vowels = 0;
		int counter_consonants = 0;

		String vowels = "aeiouAEIOU";
		String consonants = "bcdfghjklmnpqrstvwxyz"+
		"BCDFGHJKLMNPQRSTVWXYZ";

		// base case
		if(mystring.length() ==0){return vowels_vs_cons;}



		else{

			// processing associated to recursive call
			// if not base case, we turn to a recursion

		int[] counts = total_num_vc(mystring.substring(1));


		if (vowels.indexOf(mystring.charAt(0))!=-1){

			counts[0]+=1;
		}
		else if(consonants.indexOf(mystring.charAt(0))!=-1)
		{

			counts[1]+=1;


		}else{}

				
		return counts;

	}






	}











}