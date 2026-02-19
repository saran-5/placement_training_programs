package hierarchical;
class Aaa{
    double r;
    public void get(int r){
        this.r=r;
    }
    public void calc(){
        double area=3.14*r*r;
        System.out.println("area= "+area);
    }
}
public class peri extends Aaa{
    double peri;
    public void calc(){
        peri=2*3.14*r;
        System.out.println("peri "+peri);

    }
    public static void main(String[] args) {
        Aaa o=new Aaa();
        o.get(3);
        o.calc();
        o=new peri();
        o.get(4);
        o.calc();
    }
    
}
