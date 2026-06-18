package prac;
public class throwex{
    public static void main(String[] args){
        int a=45;
        if(a >100 || a<90){
            throw new ArithmeticException("mark is lower");
        }
        System.out.println("pass");
    }
}