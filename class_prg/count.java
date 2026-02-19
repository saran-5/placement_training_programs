
package class_prg;
class Example{
    static String college="HICET";
    static int count=0;
    String name;
    Example(String name){
        this.name=name;
        count++;
    }
    public void disp(){
        System.out.println(name+" studied "+college+count);
    }
}

public class count {
    public static void main(String[] args) {
        Example obj=new Example("saran");
        Example obj2=new Example("sanjay");
        Example obj3=new Example("saran");
        Example obj4=new Example("sanjay");
        obj4.disp();
        obj.disp();
        
    }
}
