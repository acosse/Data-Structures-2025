public class primeStack implements Stack<Integer>{

	private SinglyLinkedList<Integer> list = new SinglyLinkedList<>();

	public primeStack() {}


	public int size(){return list.size(); }

	public boolean isEmpty() {return list.isEmpty();}

	public void push(Integer e) {list.addFirst(e); }

	public Integer top() {return list.first(); }
	public Integer pop() {return list.removeFirst();}}
