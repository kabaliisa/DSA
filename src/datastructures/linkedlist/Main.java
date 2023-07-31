package datastructures.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(20);
        ll.append(30);
        ll.append(50);
        ll.append(60);
        ll.removeLast();
        ll.print();


    }

}
