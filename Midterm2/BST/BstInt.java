package Midterm2.BST;

public interface BstInt<T extends Comparable<T>> {
   //methods
    BstInt<T> insert(T element);
    boolean search(T element);
    BstInt<T> remove(T element);

    //getters and setters
    T getElement();

    void setElement(T element);

    BstInt<T> getRight();

    void setRight(BstInt<T> child);

    BstInt<T> getLeft();

    void setLeft(BstInt<T> child);

    boolean isEmpty();
}
