import java.util.Scanner;


// solution of Lab5/Exercise 1.5



public class greatestCommonDivisor{
	

 
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int m = input.nextInt();
		System.out.println("Please enter a second integer");
		int n = input.nextInt();
		System.out.println("Computing the gcd... Please Wait");
		System.out.println("gcd is given by " + gcd(m,n));


	}
		
		public static int gcd(int m0, int n0){


		if( m0 % n0 == 0){ return n0;}

		else{

			return gcd(n0, m0 % n0);


		}	








	}



	






}





