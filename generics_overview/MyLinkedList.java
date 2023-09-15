//package generics_overview;

// import java.util.List
// import java.util.LinkedList

public class MyLinkedList<E>{
    private class Node{
        Node next;
        E val;

        Node(E val){
            this.val = val;
            next = null;
        }

        Node(E val, Node next){
            this.val = val;
            this.next = next;
        }
    }

    private int size;
    private Node head;

    public MyLinkedList(){
        size = 0;
        head = null;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    /*public void insert(int index, E item){
        if(index == size){
            add(item);
        } else if(index == 0) {
            head = new Node(item, head);
        } else{

        }
        size++;
    }*/

    public E get(int index){
        if(index >= size){
            throw new IndexOutOfBoundsException(index);
        }
        Node dummy = head;
        while(index > 0){
            dummy = dummy.next;
            index--;
        }
        return dummy.val;
    }

    public void add(E item){
        Node node = new Node(item);
        if(head == null){
            head = node;
        } else{
            Node dummy = head;
            while(dummy.next != null){
                dummy = dummy.next;
            }
            dummy.next = node;
        }
        size++;
    }
}
