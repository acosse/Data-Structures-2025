
import java.lang.Math;
import java.util.Scanner;

public class simpleSquares{

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		int n = input.nextInt();


		int sum = 0;
		for(int k=0; k<=n; k++){

			sum+=Math.pow(k, 2);
		}

		System.out.println(sum);


}}