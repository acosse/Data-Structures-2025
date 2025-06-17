public class tryArrayQueue{



	public static void main(String[] args) {
		
	ArrayQueue<String> queue1 = new ArrayQueue<>();


	queue1.enqueue("New York");
	queue1.enqueue("Paris");
	queue1.enqueue("London");
	queue1.enqueue("Milan");
	queue1.enqueue("Berlin");

	ArrayQueue<String> queue2 = new ArrayQueue<>();


	queue2 = queue1.clone();

	System.out.println("NYU campuses");

	while(!queue1.isEmpty()){

		System.out.println(queue1.dequeue());
	}

	System.out.println("Checking state of original queue");
	while(!queue1.isEmpty()){

		System.out.println(queue1.dequeue());
	}

	System.out.println("Checking state of clone");
	
	while(!queue2.isEmpty()){

		System.out.println(queue2.dequeue());
	}









	}
	


	

	



}