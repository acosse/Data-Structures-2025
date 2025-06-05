



public class SinglyLinkedListEvolution<E> {
//------- nested Node class --------
private static class Node<E> {
private E element;
// reference to the element stored at this node
private Node<E> next;
// reference to the subsequent node in the list
public Node(E e, Node<E> n) {
element = e;
next = n;
}
public E getElement( ) { return element; }
public Node<E> getNext( ) { return next; }
public void setNext(Node<E> n) { next = n; }
}


private Node<E> head = null; // head node
private Node<E> tail = null; // last node
private int size = 0; // number of nodes
public SinglyLinkedListEvolution( ) { } // initialize list
// access methods
public int size( ) { return size; }
public boolean isEmpty( ) { return size == 0; }
public E first( ) { // returns first element
if (isEmpty( )) return null;
return head.getElement( );
}
public E last( ) {
// returns (but does not remove) the last element
if (isEmpty( )) return null;
return tail.getElement( );
}


public void addFirst(E e) { // adds element e to the front
head = new Node<>(e, head); // create and link new node
if (size == 0)
tail = head; // special case: new node becomes tail
size++;}
public void addLast(E e) { // adds element e to the end
Node<E> newest = new Node<>(e, null);
// node will eventually be the tail
if (isEmpty( ))
head = newest; // special case: previously empty list
else
tail.setNext(newest); // new node after existing tail
tail = newest; // new node becomes the tail
size++;
}

public E removeFirst( ) { // removes and returns first element
if (isEmpty( )) return null; // nothing to remove
E answer = head.getElement( );
head = head.getNext( );
// will become null if list had only one node
size--;
if (size == 0)
tail = null; // special case as list is now empty
return answer;}


public E second2last(){

	if(isEmpty()){return null;}

	else{

		Node<E> current_node = head;

		while(current_node.getNext()!=tail){
			current_node = current_node.getNext();

		}

		return current_node.getElement();




	}




}


public void merge(SinglyLinkedListEvolution<E> l1){


	// instantiating the new list
	//SinglyLinkedListEvolution<E> l_out = new SinglyLinkedListEvolution<E>();


	E e1 = l1.removeFirst();
	this.addLast(e1);


	while(!l1.isEmpty( )){
		
			this.addLast(l1.removeFirst( ));
			
	}



	

}













}