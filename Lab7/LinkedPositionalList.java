 

public class LinkedPositionalList<E>
                          implements PositionalList<E> {
// Nested Node Part I
  private static class Node<E> implements Position<E> {
    private E element;
    private Node<E> prev;
    private Node<E> next;
    public Node(E e, Node<E> p, Node<E> n) {
      element = e;
      prev = p;
      next = n;}
    public E getElement( ) throws IllegalStateException {
    if (next == null) // convention for defunct node
    throw new IllegalStateException
           ("Position no longer valid");
    return element;}

    // Nested Node Part II
    public Node<E> getPrev( ) {
    return prev;}
    public Node<E> getNext( ) {
    return next;}
    public void setElement(E e) {
    element = e;}
    public void setPrev(Node<E> p) {
    prev = p;}
    public void setNext(Node<E> n) {
    next = n;}
  }

    private Node<E> header; // header sentinel
    private Node<E> trailer; // trailer sentinel
    private int size = 0; // number of elements in the list
    /** Constructs a new empty list. */
    public LinkedPositionalList( ) {
    header = new Node<>(null, null, null); // create header
    trailer = new Node<>(null, header, null);
    // trailer is preceded by header
    header.setNext(trailer);
  }


    private Node<E> validate(Position<E> p) throws 
    IllegalArgumentException {
      if (!(p instanceof Node)) throw new
                          IllegalArgumentException("Invalid p");
      Node<E> node = (Node<E>) p; // safe cast
      if (node.getNext( ) == null) // defunct node
        throw new IllegalArgumentException
                           ("p is no longer in the list");
      return node;
    }
    private Position<E> position(Node<E> node) {
      if (node == header || node == trailer)
        return null; // do not expose user to the sentinels
      return node;}



  public int size( ) { return size; }
  public boolean isEmpty( ) { return size == 0; }
  /** Returns the first Position (null if empty). */
  public Position<E> first( ) {
  return position(header.getNext( ));}
  /** Returns the last Position (null if empty). */
  public Position<E> last( ) {
  return position(trailer.getPrev( ));}
  /** Returns Position before p (null, if p is first). */
  public Position<E> before(Position<E> p)
                throws IllegalArgumentException {
  Node<E> node = validate(p);
  return position(node.getPrev( ));}

  public Position<E> after(Position<E> p)
           throws IllegalArgumentException {
  Node<E> node = validate(p);
  return position(node.getNext( ));}



  private Position<E> addBetween
                    (E e, Node<E> pred, Node<E> succ) {
  Node<E> newest = new Node<>(e, pred, succ);
  pred.setNext(newest);
  succ.setPrev(newest);
  size++;
  return newest;}
  // public update methods
  /** Inserts e at the front/ returns new Position. */
  public Position<E> addFirst(E e) {
    return addBetween(e, header, header.getNext( )); }
  /** Inserts e at the back and returns new Position. */
  public Position<E> addLast(E e) {
    return addBetween(e, trailer.getPrev( ), trailer); }



  public Position<E> addBefore(Position<E> p, E e)
           throws IllegalArgumentException {
    Node<E> node = validate(p);
    return addBetween(e, node.getPrev( ), node); }
/** Inserts e after p, and returns new Position. */
  public Position<E> addAfter(Position<E> p, E e)
    throws IllegalArgumentException {
    Node<E> node = validate(p);
    return addBetween(e, node, node.getNext( ));}
/** Replaces the element at Position p
    and returns the replaced element. */
  public E set(Position<E> p, E e) throws
                         IllegalArgumentException {
    Node<E> node = validate(p);
    E answer = node.getElement( );
    node.setElement(e);
    return answer;
  }


  public E remove(Position<E> p) throws
                               IllegalArgumentException {
    Node<E> node = validate(p);
    Node<E> predecessor = node.getPrev( );
    Node<E> successor = node.getNext( );
    predecessor.setNext(successor);
    successor.setPrev(predecessor);
    size--;
    E answer = node.getElement( );
    node.setElement(null); // help with garbage collection
    node.setNext(null); // and convention for defunct node
    node.setPrev(null);
    return answer;
  }


  public int indexOf(Position<E> p)throws
                               IllegalArgumentException {

    boolean find_node = false;

    if(p == this.first()){

      find_node = true;
      return 0;


    }
    else if(p == this.last()){
      find_node = true;
      return this.size()-1;}
    else{

      int counter = 0;
      Position<E> f = this.first();
      while(this.after(f)!=this.last()){

        f = this.after(f);
        counter+=1;
        if(f==p){
          find_node = true;
          return counter;
        }


      }
      if(find_node == false){ 
        throw new IllegalArgumentException("position does not exist");

      }
      return counter;




    }              

}

private class PositionIterator implements Iterator<Position<E>>{


  private Position<E> cursor = first();
  private Position<E> recent = null;

  public boolean hasNext() {return  (cursor != null); }

  public Position<E> next() throws NullPointerException{

    //
    if (cursor == null) throw new NullPointerException("nothing left");

    recent = cursor;
    cursor = after(cursor);
    return recent;}

  public void remove() throws IllegalStateException{
    if(recent == null) throw new IllegalStateException("nothing to remove");
    LinkedPositionalList.this.remove(recent);
    recent = null;

  }}

  private class PositionIterable implements Iterable<Position<E>>{

    public Iterator<Position<E>> iterator(){

      return new PositionIterator();
    }


  }

  public Iterable<Position<E>> positions(){

    return new PositionIterable();

  }


  private class ElementIterator implements Iterator<E>{

    Iterator<Position<E>> posIterator = new PositionIterator();
    public boolean hasNext() {return posIterator.hasNext();}
    public E next() {
      return posIterator.next().getElement();

    }
    public void remove() { posIterator.remove(); }
}

public Iterator<E> iterator(){

  return new ElementIterator();

}





}
 




