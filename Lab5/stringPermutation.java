
import java.util.Scanner;


public class stringPermutation{
	


	public static void main(String[] args) {
	

		System.out.println("Please enter a string");
		Scanner input = new Scanner(System.in);
		String s = input.next();


		int l = s.length();

		int num_permutations = factorial(l);


		String[] my_permutations = new String[num_permutations];

		my_permutations = MySPermutations(s);


		for(int i_perm=0; i_perm<num_permutations; i_perm++){


			System.out.println(my_permutations[i_perm]);


		}





		}

	public static int factorial(int n){

		if(n==0){return 1; }

		return n*factorial(n-1);

	}	



	public static String[] MySPermutations(String ss){


		int l = ss.length();
		int num_permutations_s = factorial(l);
		String[] sList = new String[num_permutations_s];

		if(l==1){

			sList[0] = ss;
			return sList;

		}
		else if(ss.isEmpty()){

			sList = null;
			return sList;

		}

		
		char c0 = ss.charAt(0);

		String ssnext = ss.substring(1);
		int l2 = ssnext.length();
		int num_permutations_ss = factorial(l2);

		String[] ss_perm = new String[num_permutations_ss];
		ss_perm = MySPermutations(ssnext);

		if(ss_perm != null){


		for(int k=0; k<l; k++){

			for(int p = 0; p<num_permutations_ss; p++){

			char[] permutation0 = new char[l]; 
			permutation0[k] = c0;

			int i=0;
			for(int kk=0; kk<l; kk++){

				if(kk!=k){
				permutation0[kk] = ss_perm[p].charAt(i);
				i++;}
			

			}
			sList[k*num_permutations_ss+p] = String.valueOf(permutation0); 
		}
			
		


		}}


		return sList;


	} 







}