package datastructures.linkedlist;

public class LinkedList {
    private Node head;
    private  Node tail;
    private int length;
    public LinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public int getHead() {
        return head.value;
    }

    public int getTail() {
        return tail.value;
    }

    public int getLength() {
        return length;
    }

    public void print(){
        if(head == null){
            System.out.println("List is Empty");
        }
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public int removeLast(){
        Node current = head;
        if(head == null){
            return 0;
        }
        if( head.next == null){
            Node temp = head;
            head = null;
            tail = null;
            return temp.value;
        }
        while(current.next != tail){
            current= current.next;
        }
        Node previous = current;
        previous.next = null;
        return tail.value;
    }

    public class Node{
        Node next;
        int value;
         public Node(int value){
             this.value = value;
         }
    }


}
