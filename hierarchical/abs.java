package hierarchical;
abstract class shape{
    int area;
    abstract public void calc();
}
class circle extends shape{
    int r;
    circle(int r){
        this.r=r;
    }
    public void calc(){
        double area=3.14*r*r;
        System.out.println(area);
    }
}
public class abs {
    public static void main(String[] args) {
        circle c=new circle(10);
        c.calc();
    }
}
