package Midterm2.BST;

public class BST<T extends Comparable<T>> implements BstInt<T> {
    private T _element;
    private BstInt<T> _right;
    private BstInt<T> _left;

    public BST(T element) {
        _element = element;
        _right = new EmptyBst<>();
        _left = new EmptyBst<>();
    }

    //methods
    @Override
    public BstInt<T> insert(T element) {
        BstInt<T> focus = this;
        BstInt<T> parent = this;
        BstInt<T> child = new BST<>(element);
        boolean right = false;
        while (!focus.isEmpty()) {
            parent = focus;
            if (focus.getElement().compareTo(element) > 0) {
                focus = focus.getLeft();
                right = false;
            } else {
                focus = focus.getRight();
                right = true;
            }
        }
        if (right) {
            parent.setRight(child);
        } else {
            parent.setLeft(child);
        }
        return this;
    }

    @Override
    public BstInt<T> remove(T element) {
        BstInt<T> focus = this;
        BstInt<T> parent = this;
        while (!focus.getElement().equals(element) && (!focus.getLeft().isEmpty() || !focus.getRight().isEmpty())) {
            parent = focus;
            if (focus.getElement().compareTo(element) > 0) {
                focus = focus.getLeft();
            } else {
                focus = focus.getRight();
            }
        }
        if (!focus.getElement().equals(element)) {
            return this;
        }
        if (focus.getLeft().isEmpty() && focus.getRight().isEmpty()) {
            if (parent.getRight().equals(focus)) {
                parent.setRight(new EmptyBst<>());
            } else {
                parent.setLeft(new EmptyBst<>());
            }
        } else if (focus.getRight().isEmpty() || focus.getLeft().isEmpty()) {
            BstInt<T> child;
            if (focus.getLeft().isEmpty()) {
                child = focus.getRight();
            } else {
                child = focus.getLeft();
            }
            if (focus.equals(parent)) {
                return child;
            }
            if (focus == parent.getLeft()) {
                parent.setLeft(child);
            }
        } else {
            BstInt<T> explorer = focus.getRight();
            BstInt<T> explorerParent = new EmptyBst<>();
            while (!explorer.getLeft().isEmpty()) {
                explorerParent = explorer;
            }
            if (!explorerParent.isEmpty()) {
                explorerParent.setLeft(explorer.getRight());
            } else {
                focus.setRight(explorer.getRight());
                if (focus.equals(parent.getLeft())) {
                    parent.setLeft(explorer);
                } else {
                    parent.setRight(explorer);

                }
                if (explorerParent.getLeft().equals(explorer)) {
                    explorerParent.setLeft(new EmptyBst<>());
                } else {
                    explorerParent.setRight(new EmptyBst<>());
                }
            }
            focus.setElement(explorer.getElement());
        }
        return this;
    }

    @Override
    public boolean search(T element) {
        BstInt<T> focus = this;
        boolean found = false;
        while (!focus.getElement().equals(element)) {
            if (focus.getElement().compareTo(element) > 0) {
                focus = focus.getLeft();
            } else {
                focus = focus.getRight();
            }
        }
        if (focus.getElement().compareTo(element) == 0) {
            found = true;
        }
        return found;
    }

    //getters and setters
    @Override
    public T getElement() {
        return _element;
    }
    @Override
    public void setElement(T element) {
        _element = element;
    }
    @Override
    public BstInt<T> getRight() {
        return _right;
    }
    @Override
    public void setRight(BstInt<T> child) {
        _right = child;
    }
    @Override
    public BstInt<T> getLeft() {
        return _left;
    }
    @Override
    public void setLeft(BstInt<T> child) {
        _left = child;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }
}
