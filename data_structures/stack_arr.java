package data_structures;

public class stack_arr {
    int [] arr= new int[5];
    int size=5;
    int top=-1;
    public void push(int data){
        if(top==size-1){
            System.out.println("overflow");
        }
        else{
            top++;
            arr[top]=data;
        }
    }
    public void pop(){
        if(top==-1){
            System.out.println("underflow or empty");
        }
        else{
            System.out.println("pop element : "+arr[top]);
            top--;
        }
    }
    public void peek(){
        if(top==-1){
            System.out.println("empty");
        }
        else{
            System.out.println("top element : "+arr[top]);
        }
    }
    public void disp(){
        if(top==-1){
            System.out.println("empty");

        }
        else{
            for(int i=top;i>=0;i--){
                System.out.println(arr[i]);
            }
        }
    }
    public static void main(String[] args) {
        stack_arr l=new stack_arr();
        l.push(5);
        l.push(10);
        l.push(15);
        System.out.println("after push");
        l.disp();

        l.pop();
        System.out.println("after pop");
        l.disp();

        l.peek();

        System.out.println("remaining");
        l.disp();
    }
}
