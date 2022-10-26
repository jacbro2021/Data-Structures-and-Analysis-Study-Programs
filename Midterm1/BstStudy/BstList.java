package Midterm1.BstStudy;

public class BstList implements BstInt{
    Node _root;

    BstList(int data){
         _root = new Node(data);
    }

    @Override
    public void insert(int data){
        Node n = new Node(data);
        Node focus = _root;
        Node parent;
        while(true){
            parent = focus;
            if (data > focus._data) {
                focus = focus._rightChild;
                if (focus == null) {
                    parent._rightChild = n;
                    break;
                }
            } else {
                focus = focus._leftChild;
                if (focus == null) {
                    parent._leftChild = n;
                    break;
                }
            }
        }
    }

    @Override
    public void search(int data) {
        Node focus = _root;
        while (true) {
            if (data == focus._data) {
                System.out.println("Value found in BST");
                return;
            } else {
                if (data > focus._data) {
                    focus = focus._rightChild;
                    if (focus == null) {
                        break;
                    }
                } else {
                    focus = focus._leftChild;
                    if (focus == null) {
                        break;
                    }
                }
            }
        }
        System.out.println("Value not found in BST");
    }
}
