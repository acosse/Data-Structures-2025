import java.util.Scanner;


public class integer_of_log{
	

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an integer");
		int n = input.nextInt();
		System.out.println("integer is given by n="+n);
		System.out.println("Computing the integer"
			+" part of log(n)... Please wait...");
		System.out.println("integer part is given by " 
			+ roundedLog(n));


	}


	public static int roundedLog(int n0){


		if (n0<2){return 0;}

		else{

			return 1 + roundedLog(n0/2);


		}


	}








}