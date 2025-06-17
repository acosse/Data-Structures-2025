import java.io.DataInputStream;
import java.io.IOException;
import java.lang.*; 

public class ArrayStack<E> implements Stack<E>, Cloneable {


	public static final int CAPACITY=1000;
	// array capacity
	
	private E[] data; // generic array
	private int t = -1; // top index
	public ArrayStack( ) { this(CAPACITY); }
	public ArrayStack(int capacity) {
	data = (E[]) new Object[capacity];
	// safe cast; compiler may give warning
	}
	/* see next slide */

	public int size( ) { return (t + 1); }
	public boolean isEmpty( ) { return (t == -1); }
	public void push(E e) throws IllegalStateException {
	if (size( ) == data.length)
	throw new IllegalStateException("Stack is full");
	data[++t] = e;
	}
	public E top( ) {
	if (isEmpty( )) return null;
	return data[t];
	}
	public E pop( ) {
	if (isEmpty( )) return null;
	E answer = data[t];
	data[t] = null;
	t--;
	return answer;}

	public void emptyStack(){

		if(isEmpty()){}
		else{
			E popedElem = pop();
			emptyStack(); }

	}


	public ArrayStack<E> clone() {

		ArrayStack<E> copy = new ArrayStack<>();

		if (this.size()>0){
			
			E[] tmp = (E[]) new Object[this.size()];

			int i = 0;
			while(!this.isEmpty()){

				tmp[i] = this.pop();
				i++;

			}

			for(int j=tmp.length-1; j>=0; j--){

				this.push(tmp[j]);
				copy.push(tmp[j]);

			}
		}

		
		return copy;



	}



}
