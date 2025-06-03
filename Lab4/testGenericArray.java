import java.util.Arrays;


public class testGenericArray{
	
public static void main(String[] args) {


	int[] test_array = {2, 4, 6, 8, 10, 12};

	Integer[] ObjIntarray = new Integer[test_array.length];


	for(int kk=0; kk<test_array.length; kk++){

		ObjIntarray[kk] = (Integer) test_array[kk];


	}




	
	genericArray my_array = new genericArray<>(ObjIntarray); 

	int array_length = test_array.length;

	System.out.println("Original Array:");

	for(int kk = 0; kk<array_length; kk++){

		System.out.print(test_array[kk]);
		System.out.print(" ");

	}
	System.out.println(" ");
	System.out.println("Swapped Array:");


	my_array.Swap();
	Object[] swappedArray = new Object[array_length]; 
	swappedArray = (Integer[]) my_array.accessArray();

	for(int kk = 0; kk<array_length; kk++){

		System.out.print(swappedArray[kk]);
		System.out.print(" ");

	} 







	
}





}