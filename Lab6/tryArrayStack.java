public class tryArrayStack{



	public static void main(String[] args) {
		
	ArrayStack<String> stack1 = new ArrayStack<>();


	stack1.push("New York");
	stack1.push("Paris");
	stack1.push("London");
	stack1.push("Milan");
	stack1.push("Berlin");

	ArrayStack<String> stack2 = new ArrayStack<>();


	stack2 = stack1.clone();

	System.out.println("NYU campuses");

	while(!stack1.isEmpty()){

		System.out.println(stack1.pop());
	}

	System.out.println("Checking state of original stack");
	while(!stack1.isEmpty()){

		System.out.println(stack1.pop());
	}

	System.out.println("Checking state of clone");
	
	while(!stack2.isEmpty()){

		System.out.println(stack2.pop());
	}









	}
	


	

	



}