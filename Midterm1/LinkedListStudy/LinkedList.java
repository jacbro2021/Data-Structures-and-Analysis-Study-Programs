package Midterm1.LinkedListStudy;

public class LinkedList implements LinkedListInt{
    Node head;
    @Override
    public void insert(int data){
        Node node = new Node();
        node._data = data;
        node._nextNode = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n._nextNode != null) {
                n = n._nextNode;
            }
            n._nextNode = node;
        }
    }

    @Override
    public void show(){
        Node n = head;
        while (n._nextNode != null) {
            System.out.println(n._data);
            n = n._nextNode;
        }
        System.out.println(n._data);
    }

    @Override
    public void search(int value){
        Node n = head;
        while (n._nextNode != null) {
            if (n._data == value) {
                System.out.println("value " + value + " has been found in Linked List!");
                return;
            } else {
                n = n._nextNode;
            }
        }
        if (n._data == value) {
            System.out.println("value " + value + " has been found in linked list!");
        } else {
            System.out.println("value " + value + " was not found in Linked list!");
        }
    }

    @Override
    public void delete(int value){
        Node n = head;
    while (n._nextNode != null) {
        if (n._nextNode._data == value) {
            n._nextNode = n._nextNode._nextNode;
        }
        n = n._nextNode;
    }
    }

}
