package prac;
import java.util.*;
class q{
    int [] a = new int[5];
    int front = 0;
    int rear = -1;
    void enqueue(int x){
        a[++rear]=x;
    }
    void dequeue(){
        System.out.println("removed "+ a[front]);
        front++;
    }
    void dis(){
        for( int i=0;i<=rear;i++){
            System.out.println(a[i]);
        }
    }   
}
public class queue{
    public static void main(String[] args){
    q s = new q();
    
    s.enqueue(10);
    s.enqueue(20);
    s.enqueue(30);
    s.dequeue();
    s.dis();
    
    }
}