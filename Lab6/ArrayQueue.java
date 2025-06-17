public class ArrayQueue<E> implements Queue<E>, Cloneable{
	
	private E[] data;
	private int f = 0;
	private int sz = 0;
	public static final int CAPACITY=1000;


	public ArrayQueue() {this(CAPACITY);}
	public ArrayQueue(int capacity){
		data = (E[]) new Object[capacity];

	}



	public int size() {return sz;}
	public boolean isEmpty() {return (sz == 0);}

	public void enqueue(E e) throws IllegalStateException{

		if(sz == data.length) throw new IllegalStateException("Queue is full");

		int avail = (f + sz) % data.length;
		data[avail] = e;
		sz ++;}

	public E first() {

		if (isEmpty()) return null;
		return data[f];

	}

	public E dequeue() {

	if (isEmpty()) return null;
	E answer = data[f];
	data[f] = null;
	f = (f+1)% data.length;
	sz--;
	return answer;
	}

	public ArrayQueue<E> clone(){

		ArrayQueue<E> copy = new ArrayQueue<>();

		E[] tmp = (E[]) new Object[this.size()];

		int i = 0;
		while(!this.isEmpty()){

			tmp[i] = this.dequeue();
			i++;

		}

		for(int j=0; j<tmp.length; j++){

			this.enqueue(tmp[j]);
			copy.enqueue(tmp[j]);

		}

	return copy;



	}











}