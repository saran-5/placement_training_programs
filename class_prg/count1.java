package class_prg; 
class Exa{ 
    static int count=0; 
    Exa(){ 
        count++; 
    } 
    public void disp()
    { 
        System.out.println(count); 
    }
 }
  public class count1 {
     public static void main(String[] args) {
        Exa obj=new Exa();
        Exa obj2=new Exa();
        Exa obj3=new Exa();
        obj3.disp(); 
    } 
}