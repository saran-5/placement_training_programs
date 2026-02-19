package class_prg;
import java.util.Scanner;
class Circle {
        double r,area;
        private void getdata(){
            Scanner in=new Scanner(System.in);
            System.out.print("enter radius: ");
            r=in.nextDouble();
        }
        public void calc(){
            getdata();
            area=3.14*r*r;
            System.out.println("area :"+area);
            
        }   
}

class Main {
    public static void main(String[] args) {
        Circle obj=new Circle();
        obj.calc();
    }
}

