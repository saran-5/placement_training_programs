package class_prg;

import java.util.Scanner;

class A{
    protected int a;
    A(int a){
        this.a=a;
    }
}
class B extends A{
    int b;
    B(int a,int b){
        super(a);
        this.b=b;
    }
    
}
class C {
    int c;
    public void clacc(B obj){
        c=obj.a+obj.b;
        System.out.println("sum "+c);
    }

public class multi {
    public static void main(String[] args) {
            B obj1=new B(5,11);
            C obj2=new C();
            obj2.clacc(obj1);
        }
}
}
