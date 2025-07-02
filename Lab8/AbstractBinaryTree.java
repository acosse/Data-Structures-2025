 
public abstract class AbstractBinaryTree<E>
                         extends AbstractTree<E>
  implements BinaryTree<E> {
  /**  Position of p's sibling (or null). */
  public Position<E> sibling(Position<E> p) {
    Position<E> parent = parent(p);
    if (parent == null) return null; //p must be roo
    if (p == left(parent)) // p is a left child
      return right(parent);
    else // p is a right child
      return left(parent);
}// to be continued
}