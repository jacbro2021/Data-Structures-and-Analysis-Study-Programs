package Midterm1.LinkedListStudy;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insert(5);
        list.insert(2);
        list.insert(17);

        list.show();

        list.search(5);
        list.search(2);
        list.search(17);
        list.search(24);

        list.delete(2);

        list.show();
    }
}
