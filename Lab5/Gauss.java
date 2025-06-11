import java.util.Scanner;


public class Gauss{
	


	public static void main(String[] args) {

		System.out.println("Please enter an integer");
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		int result = RecursiveSum(n);

		System.out.println("Sum_{i=0}^n i = " + result); 



		
	}

	public static int RecursiveSum(int k){

		if(k==1){return 1;}

		return k +  RecursiveSum(k-1);

	}








}