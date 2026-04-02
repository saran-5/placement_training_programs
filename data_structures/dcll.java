package data_structures;

public class dcll {
    class Node{
        int data;
        Node next;
        Node prev;
        Node(int data){
            this.data=data;
            this.next=null;
            this.prev=null;
        }
    }
    Node head=null;
    // Insert at beginning
    public void insertatbeg(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        temp.next=head;
        head.prev=temp;
        head=temp;
        
    }
    // Insert at middle after key
    public void insertatmid(int key,int data){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node prev=head;
        while(prev!=null && prev.data!=key){
            prev=prev.next;
        }
        if(prev==null){
            System.out.println("Key not found");
            return;
        }
        Node temp=new Node(data);
        temp.next=prev.next;
        temp.prev=prev;
        if(prev.next!=null){
            prev.next.prev=temp;
        }
        prev.next=temp;

    }
    // Insert at end
    public void insertatend(int data){
        Node temp=new Node(data);
        if(head==null){
            head=temp;
            return;
        }
        Node last=head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=temp;
        temp.prev=last;
    }
    // Delete by key
    public void delete(int key){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        if(head.data==key){
            head=head.next;
            if(head!=null){
                head.prev=null;
            }
            return;
        }
        Node temp=head;
        while(temp!=null && temp.data!=key){
            temp=temp.next;
        }
        if(temp==null){
            System.out.println("Key not found");
            return;
        }
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        if(temp.prev!=null){
            temp.prev.next=temp.next;
        }
    }
    // Display
    public void display(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        dcll list=new dcll();
        list.insertatend(10);
        list.insertatend(20);
        list.insertatend(30);
        System.out.println("After inserting at end:");
        list.display();

        list.insertatmid(20, 25);
        System.out.println("After inserting 25 after 20:");
        list.display();

        list.insertatbeg(5);
        System.out.println("After inserting 5 at beginning:");
        list.display();

        list.delete(20);
        System.out.println("After deleting 20:");
        list.display();
    }
}
