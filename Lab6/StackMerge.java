public class StackMerge{
	

	


	public static void transfer(LinkedStack<Integer> Stack1, LinkedStack<Integer> Stack2){


		while(!Stack1.isEmpty()){

			Stack2.push(Stack1.pop());

		}


		
	}

	public static LinkedStack<Integer> S = new LinkedStack<>();
	public static LinkedStack<Integer> T = new LinkedStack<>();
	
	public static LinkedStack<Integer> U = new LinkedStack<>();


	public static void main(String[] args) {


		

		T.push(8);
		T.push(5);
		T.push(11);
		T.push(9);

		

		S.push(2);
		S.push(4);
		S.push(7);
		S.push(2);

		System.out.println("Displaying the elements of S");

		while(!S.isEmpty()){

			System.out.println(S.pop());


		}

		System.out.println("Displaying the elements of T");

		while(!T.isEmpty()){

			System.out.println(T.pop());


		}

		T.push(8);
		T.push(5);
		T.push(11);
		T.push(9);

		

		S.push(2);
		S.push(4);
		S.push(7);
		S.push(2);


		transfer(S, T);

		System.out.println("Checking merging");

		while(!T.isEmpty()){

			System.out.println(T.pop());


		}



	}





	}