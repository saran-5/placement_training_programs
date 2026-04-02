package data_structures;

public class scll {
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    // Insert at beginning
    public void insertatbeg(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            temp.next = head;
        }
        Node last = head;
        while(last.next != head){
        last = last.next;
        }
        temp.next=head;
        last.next=temp;
        head=temp;
        
    }
    // Insert at middle after key
    public void insertatmid(int key,int data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node prev=head;
        do{
            if(prev.data==key){
                Node temp=new Node(data);
                temp.next=prev.next;
                prev.next=temp;
                return;
            }
            prev=prev.next;
        }
        while(prev!=head);
            System.out.println("Key not found");
    }
    // Insert at end
    public void insertatend(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            temp.next=head;
            return;
        }
        Node last=head;
        while(last.next!=head){
            last=last.next;
        }
        last.next=temp;
        temp.next=head;
    }
    // Delete by key
    public void delete(int key){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==key){
            Node last=head;
            while(last.next!=head){
                last=last.next;
            }
            head=head.next;
            last.next=head;
            return;
        }
        Node temp=head;
        Node prev=null;
        while(temp.next!=head && temp.data!=key){
            prev=temp;
            temp=temp.next;
        }
        if(temp.data!=key){
            System.out.println("Key not found");
            return;
        }
        prev.next=temp.next;
    }
    // Display
    public void disp(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        do{
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        while(temp!=head);
        System.out.println();
    }
    public static void main(String[] args) {
        scll list=new scll();
        list.insertatend(10);
        list.insertatend(20);
        list.insertatend(30);
        System.out.println("List after end insertions:");
        list.disp();

        list.insertatbeg(5);
        System.out.println("List after beg insertions:");
        list.disp();

        list.insertatmid(20, 25);
        System.out.println("List after mid insertions:");
        list.disp();
        list.delete(20);
        System.out.println("List after deletion:");
        list.disp();
    }

}
