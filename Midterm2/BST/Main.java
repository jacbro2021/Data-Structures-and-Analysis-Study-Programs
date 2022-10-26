package Midterm2.BST;

public class Main {
    public static void main(String[] args) {
        BstInt<Integer> bst = new BST<Integer>(27);
        bst = bst.insert(14);
        bst = bst.insert(53);
        bst = bst.remove(53);
        System.out.println("Done.");
    }
}
