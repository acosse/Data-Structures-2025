

import java.util.Random;


public class randomPhoneNumber{

	public static void main(String[] args) {
		
	

	Random myRandomNumberGenerator = new Random();

	// First sequence of 3 digits
	int[] sequence1 = myRandomNumberGenerator.ints(3, 0, 8).toArray(); 
	int r = myRandomNumberGenerator.nextInt(655);
	// Second sequence of 3 digits
	int[] sequence2 = new int[3] ;
	if(r/100<1){
		sequence2[0] = 0;

		if(r/10<1){

			sequence2[1] = 0;
		}
		else
			{ sequence2[1] = r/10; }

	}
	else{

		sequence2[0] = r/100;

	}
	sequence2[2] = r%10;
	
	// generating the third sequence

	int[] sequence3 = myRandomNumberGenerator.ints(4, 0, 10).toArray(); 




	for(int k=0; k<sequence1.length; k++){
		System.out.print(sequence1[k]);
	}
	System.out.print('-');
	for(int k=0; k<sequence2.length; k++){
		System.out.print(sequence2[k]);
	}
	System.out.print('-');
	for(int k=0; k<sequence3.length; k++){
		System.out.print(sequence3[k]);
	}
	


	
	//System.out.println("Phone number is "+n1+'-'+n1+''+n1);
	// }
}}