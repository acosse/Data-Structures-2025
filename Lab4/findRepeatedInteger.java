

import java.util.Scanner;

import java.util.Arrays;

public class findRepeatedInteger{




public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a sequence of integers separated by spaces:");
	String message = input.nextLine();
	


	String[] integers_sequence = message.split(" ");

	int length = integers_sequence.length;
	
	//integers_sequence = Arrays.copyOf(integers_sequence, length-2);
	int counter = 0; 
	for (int kk=0; kk<length; kk++) {

	
    System.out.println(integers_sequence[kk]);}
    

	int [] occurences = new int[length];

	int n = 1;


	int [] integerList = new int [1];


	int k = Integer.parseInt(integers_sequence[0]);
	System.out.println(k);

	integerList[0] = k;

	for(int ll=1; ll<length; ll++){

		k = Integer.parseInt(integers_sequence[ll]);
		System.out.println(k);

		//check
		int l = 0;
		boolean is_in_list = false;
		while(l<n){

			if(integerList[l]==k){ is_in_list = true;
			}
			l++;

		}

		if(is_in_list == false){

		integerList = Arrays.copyOf(integerList, n+1);
		integerList[n] = k;
		n++; }

		else{

			System.out.println("Number " + k + " appears multiple times");


		}

	}
	
}


//

}