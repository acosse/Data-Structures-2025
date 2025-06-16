
import java.util.Scanner;


public class firstPrimes{

	
	

	public static void main(String[] args) {

		System.out.println("Please enter a maximum"
		+" number of primes to be displayed");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();


		primeStack myPStack = new primeStack();

		myPStack.push(1);
		myPStack.push(2);

		int counter = 2;
		int i = 3;
		while(counter<n){

			boolean is_prime = true;
			for(int j=2; j<i; j++){

				if(i%j == 0){
					is_prime = false;
				}	

			}


	

			if(is_prime ==true){

				myPStack.push(i);
				counter++;	
			}

			i++;

		}

		System.out.println("list of primes stored in the stack");

		while(!myPStack.isEmpty()){

			System.out.println(myPStack.pop());

		}




		
	}





}



