package prac;
import java.util.*;
public class sll {
    class Node {
    int data;
    Node next;
    Node(int data) {
        this.data=data;
        this.next=null;
    }
}
    Node head = null;
    public void beg(int data){
        Node temp= new Node(data);
        if(head== null){
            head=temp;
            return;
        }
        temp.next=head;
        head=temp;
    }
    public void end(int data){
         Node temp = new Node(data);
        if(head==null){
            temp.next=head;
            head=temp;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last =last.next;
        }
        last.next =temp;
    }
    public void del(int key){
        Node temp=head;
        Node prev=null;
        if(head==null){
            System.out.println("List is empty");
        }
        if(head.data==key){
            head=head.next;
        }
        while(temp!=null &&temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        prev.next=temp.next;
    }
    public void rev(){
        Node prev=null;
        Node curr=head;
        Node next=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }
    public void mid(){
        Node temp=head;
        int c=0;
        while(head!=null){
            c++;
            head=head.next;
        }
        int avg=c/2;
        for(int i=0;i<avg;i++){
            temp=temp.next;
        }
        System.out.println(temp.data);
    }
    public void dis(){
        
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }


    }
public static void main(String[] args) {
    sll l = new sll();
    l.beg(10);
    System.out.println("begin ");
    l.dis();
    l.end(35);
    System.out.println("end ");
    l.dis();
}

}
