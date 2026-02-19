package class_prg;
class Factorial{
    int n,fact;
    Factorial(){
        fact=1;
        n=5;
    }
    public void calc(){
        for(int i=1;i<=n;i++){
            fact*=i;
        }
        System.out.println(fact);
    }
}
public class fact {
    public static void main(String[] args) {
        int n=6;
        Factorial obj=new Factorial();
        obj.calc();
    }   
}
