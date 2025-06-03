public class genericArray<E>{
	

	private E[] my_array; 
	private int size = 0;

	public genericArray(E[] e){

		my_array = e;
		size = e.length;

	}

	public void Swap(){

		int ll = my_array.length-1; 

		int kk = 0;
		while(kk<=ll){

		E e_kk = my_array[kk];
		E e_ll = my_array[ll];
		my_array[kk] = e_ll;
		my_array[ll] = e_kk;
		kk++;
		ll--;

		}


	}

	public E[] accessArray(){


		return my_array;

	}



}