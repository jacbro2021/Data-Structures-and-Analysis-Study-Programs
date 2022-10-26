package Midterm1.BstStudy;

public class Main {
    public static void main(String[] args) {
        BstList list = new BstList(7);
        list.insert(8);
        list.insert(15);
        list.insert(1);
        list.insert(3);

        list.search(8);
        list.search(2);
        list.search(15);
    }
}
