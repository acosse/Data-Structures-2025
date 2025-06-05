
import java.util.Random;


public class testLinkedListEvolution{


	public static void main(String[] args) {
	


		// test for question 3.1.
		// SinglyLinkedListEvolution<Integer> my_IntegerList = 
		// new SinglyLinkedListEvolution<Integer>(); 

		// SinglyLinkedListEvolution<String> my_StringList = 
		// new SinglyLinkedListEvolution<String>();


		// Random r= new Random();
		// my_IntegerList.addFirst(2);
		// my_IntegerList.addFirst(r.nextInt(1000));
		// my_IntegerList.addFirst(r.nextInt(1000));
		// my_IntegerList.addFirst(r.nextInt(1000));
		// my_IntegerList.addFirst(r.nextInt(1000));
		// my_IntegerList.addFirst(r.nextInt(1000));


		// my_StringList.addFirst("Hanyu Wen");
		// my_StringList.addFirst("Abigail Ecarma");
		// my_StringList.addFirst("Sophie H");
		// my_StringList.addFirst("Shengyang Tao");
		// my_StringList.addFirst("Michelle Ye");
		// my_StringList.addFirst("sifan zhang");
		// my_StringList.addFirst("David Wand");


		// System.out.println(my_IntegerList.size());
		// System.out.println(my_StringList.size());


		// while(!my_IntegerList.isEmpty()){

		// 	System.out.print(my_IntegerList.removeFirst() + " ");

		// }
		// System.out.println(" ");


		// while(!my_StringList.isEmpty()){

		// 	System.out.print(my_StringList.removeFirst() + " ");

		// }


		// test for question 3.2.


		SinglyLinkedListEvolution<Integer> my_IntegerList1 = 
		new SinglyLinkedListEvolution<Integer>(); 

		SinglyLinkedListEvolution<Integer> my_IntegerList2 = 
		new SinglyLinkedListEvolution<Integer>(); 

		SinglyLinkedListEvolution<String> my_StringList1 = 
		new SinglyLinkedListEvolution<String>();

		SinglyLinkedListEvolution<String> my_StringList2 = 
		new SinglyLinkedListEvolution<String>();

		
		Random r= new Random();
		my_IntegerList1.addFirst(r.nextInt(1000));
		my_IntegerList1.addFirst(r.nextInt(1000));
		my_IntegerList1.addFirst(r.nextInt(1000));
		my_IntegerList2.addFirst(r.nextInt(1000));
		my_IntegerList2.addFirst(r.nextInt(1000));
		my_IntegerList2.addFirst(r.nextInt(1000));


		my_StringList1.addFirst("Hanyu Wen");
		my_StringList1.addFirst("Abigail Ecarma");
		my_StringList1.addFirst("Sophie H");
		my_StringList1.addFirst("Shengyang Tao");
		my_StringList2.addFirst("Michelle Ye");
		my_StringList2.addFirst("sifan zhang");
		my_StringList2.addFirst("David Wand");


		

		System.out.println(my_IntegerList1.size());
		System.out.println(my_StringList1.size());


		// System.out.println(my_IntegerList1.last());
		// System.out.println(my_StringList1.last());

		my_IntegerList1.merge(my_IntegerList2);
		my_StringList1.merge(my_StringList2);



		while(!my_IntegerList1.isEmpty()){

			System.out.print(my_IntegerList1.removeFirst() + " ");

		}
		System.out.println(" ");


		while(!my_StringList1.isEmpty()){

			System.out.print(my_StringList1.removeFirst() + " ");

		}











	}
	







}