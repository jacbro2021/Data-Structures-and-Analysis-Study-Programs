package Midterm2.BST;

public class EmptyBst<T extends Comparable<T>> implements BstInt<T> {

    @Override
    public BST<T> insert(T element) {
        return new BST(element);
    }

    @Override
    public BST<T> remove(T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean search(T element) {
        throw new UnsupportedOperationException();
    }

    @Override
    public T getElement() {
       throw new UnsupportedOperationException();
    }
    @Override
    public void setElement(T element) {
       throw new UnsupportedOperationException();
    }
    @Override
    public BstInt<T> getRight() {
        throw new UnsupportedOperationException();
    }
    @Override
    public void setRight(BstInt<T> child) {
        throw new UnsupportedOperationException();
    }
    @Override
    public BstInt<T> getLeft() {
        throw new UnsupportedOperationException();
    }
    @Override
    public void setLeft(BstInt<T> child) {
        throw new UnsupportedOperationException();
    }
    @Override
    public boolean isEmpty() {
        return true;
    }
}
