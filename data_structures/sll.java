package data_structures;
import java.util.*;


public class sll{
    class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
    Node head = null;

    // Insert at beginning
    public void insertatbeg(int data) {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
    // Insert at middle after key
    public void insertatmid(int key, int data) {
        Node prev = head;
        while (prev != null && prev.data != key) {
            prev = prev.next;
        }
        if (prev == null) {
            System.out.println("Key not found");
            return;
        }
        Node temp = new Node(data);
        temp.next = prev.next;
        prev.next = temp;
    }

    // Insert at end
    public void insertatend(int data) {
        Node temp = new Node(data);
        if (head == null) {
            head = temp;
            return;
        }

        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        last.next = temp;
    }

    // Delete by key
    public void delete(int key) {

        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        if (head.data == key) {
            head = head.next;
            return;
        }

        Node temp = head;
        Node prev = null;

        while (temp != null && temp.data != key) {
            prev = temp;
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Node not found");
            return;
        }

        prev.next = temp.next;
    }

    // Display
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
    // public void rev(Node head){
    //     if(head==null){
    //         return;
    //     }
    //     rev(head.next);
    //     System.out.println(head.data);
    // }

    // public void reverse(){
    //     Node  temp=head;
    //     Stack<Node> stack=new Stack<>();
    //     while(temp!=null){
    //         stack.push(temp);
    //         temp=temp.next;

    //     }
    //     while(!stack.isEmpty()){
    //         System.out.println(stack.pop().data);
    //     }
    // }
    public void reverse() {
    Node prev = null;
    Node current = head;
    Node next = null;

    while (current != null) {
        next = current.next;   // store next node
        current.next = prev;   // reverse link
        prev = current;        // move prev forward
        current = next;        // move current forward
    }

    head = prev;   // update head
}

    public static void main(String[] args) {

        sll list = new sll();

        list.insertatbeg(10);
        list.insertatbeg(20);
        list.insertatbeg(30);

        System.out.println("After insert at beginning:");
        list.display();

        list.insertatmid(20, 99);

        System.out.println("After insert at mid:");
        list.display();

        list.insertatend(40);
        list.insertatend(50);

        System.out.println("After insert at end:");
        list.display();

        list.delete(99);

        System.out.println("After deletion:");
        list.display();

        System.out.println("after reverse: ");
        list.reverse();
        list.display();
    }
}