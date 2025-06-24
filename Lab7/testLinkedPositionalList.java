
import java.util.Scanner;


public class testLinkedPositionalList{
	
	





	


	public static void main(String[] args) {

		LinkedPositionalList<String> my_list = new LinkedPositionalList();



		Position<String> ny = my_list.addFirst("New York");
		Position<String> paris = my_list.addFirst("Paris");
		Position<String> london = my_list.addFirst("London");
		Position<String> rome =  my_list.addFirst("Rome");


		Iterator<String> elem_iterator = my_list.iterator();
		
		while(elem_iterator.hasNext()){ 


			System.out.println(elem_iterator.next());


		}

		System.out.println(my_list.indexOf(london));
		System.out.println(my_list.indexOf(ny));

		




		
	}




}