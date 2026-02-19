package hierarchical;
import java.util.*;
class Aa{
    int a;
    Aa(){
        a=0;
    }
    public void get(int a){
        this.a=a;
        System.out.println("a"+a);
    }
}
class over extends Aa{
    int b;
    over(){
        super();
        b=0;
    }
    public void get(){   
        System.out.print("b");
        super.get(5);
        Scanner in=new Scanner(System.in);
        b=in.nextInt();
    }
    public static void main(String[] args) {
        over o=new over();
        o.get();
    }
}
