
import java.lang.*;
import java.util.ArrayList;

public class ArrayBinaryTree<E> {
	

private ArrayList<Node<E>> tree;
protected Node<E> root = null;
private int n = 0;

public ArrayBinaryTree(){

	tree = new ArrayList<Node<E>>();

}


private boolean isroot(Position<E> r){

		return (r == root);

	}

public boolean isEmpty(){

	return n==0;


}
public int size(){ return n; }


protected static class Node<E> implements Position<E>{

	private E element;
	int array_position;

	
	public Node(E e){

		element = e;
	}

	public E getElement(){

		return element;

	}
	
	

	public int array_position(){

		return array_position; 

	}


}

public Position<E> addRoot(E e){

	if(!isEmpty()){ 
		throw new IllegalArgumentException("Tree is not empty");
	}

	root = createRoot(e);
	tree.add(0, root);

	return root;


}

protected Node<E> createRoot(E e){

	root = new Node<E>(e);
	return root;

}



public Position<E> addLeft(Position<E> p, E e){

	Node<E> n = (Node<E>) p;
	int index_p = n.array_position;

	Node<E> left = new Node<E>(e);

	tree.add(2*index_p+1, left);

	return left;


}


public Position<E> addRight(Position<E> p, E e){

	Node<E> n = (Node<E>) p;
	int index_p = n.array_position;

	Node<E> right = new Node<E>(e);


	tree.add(2*index_p+2, right);

	return right;

	
}


public Position<E> getLeft(Position<E> p){

	Node<E> n = (Node<E>) p;
	int index_p = n.array_position;

	

	return tree.get(2*index_p+1);


}

public Position<E> getRight(Position<E> p){

	Node<E> n = (Node<E>) p;
	int index_p = n.array_position;

	

	return tree.get(2*index_p+2);


}




public Position<E> getParent(Position<E> c){

	Node<E> child = (Node<E>) c;
	int index_p = (int) Math.floor((child.array_position - 1)/2);

	

	return tree.get(index_p);


}










}

