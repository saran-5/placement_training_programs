package class_prg;
class ex{
    static int count;
    static{
        count=0;
        System.out.println("static members initialized");
    }
    ex(){
        count++;
    }
    static void disp(){
        System.out.println("count= "+count);
    }
    public static void main(String[] args){
    System.out.println("driver class started");
    ex obj1=new ex();
    ex obj2=new ex();
    ex obj3=new ex();
    ex.disp();
    }
}