package data_structures;

public class stack {
    public class Node{
        int data;
        Node next=null;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node top=null;
    public void push(int data){
        Node temp=new Node(data);
        if(top==null){
            top=temp;
        }
        else{
            temp.next=top;
            top=temp;
        }
    }
    public void pop(){
        if(top==null){
            System.out.println("empty");
        }
        else{
            System.out.println("pop element :"+top.data);
            top=top.next;
        }
    }
    public void peek(){
        if(top==null){
            System.out.println("empty");
        }
        else{
            System.out.println("top element : "+top.data);
        }
    }
    public void disp(){
        Node temp=top;
        if(top==null){
            System.out.println("empty ");
        }
        else{
            while (temp!=null) {
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
    public static void main(String[] args) {
        stack l=new stack();
        l.push(5);
        l.push(10);
        l.push(15);
        l.push(20);
        System.out.println("after push :");
        l.disp();

        l.pop();
        System.out.println("after pop ");
        l.disp();

        l.peek();

        System.out.println("remain ");
        l.disp();
    }
}
