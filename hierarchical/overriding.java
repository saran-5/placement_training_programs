package hierarchical;

import java.util.Scanner;

class A{
    int a;
    A(){
        a=0;
    }
    public void get(){
        System.out.println("a");
        Scanner in=new Scanner(System.in);
        a=in.nextInt();
    }
}
class overriding extends A{
    int b;
    overriding(){
        super();
        b=0;
    }
    public void get(){   
        System.out.print("b");
        super.get();
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
        System.out.println(a);
        System.out.println(b);
    }

    public static void main(String[] args) {
        overriding b= new overriding();
        b.get();
    }
}
