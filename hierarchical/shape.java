package hierarchical;

import org.w3c.dom.css.Rect;

class area{
    
    int a=10;
    int l=10;
    int b=10;
    int r=10;
}
class Circle extends area{
    double Circle_area=0;
    void calculatee(){
    Circle_area=3.14*r*r;
    System.out.println("circle "+Circle_area);
}}
class square extends area{
    
    int sq_area=0;
    void calculatee(){
    sq_area=a*a;
    System.out.println("square "+sq_area);
}}
class rect extends area{
    void calculatee(){
    int rect_area=l*b;
    System.out.println("rectangle "+rect_area);
}}
public class shape {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.calculatee();
        square s = new square();
        s.calculatee();
        rect r = new rect();
        r.calculatee();
    }
}
