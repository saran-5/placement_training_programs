package prac;

public class exception {
    public static void main(String[] args){
    int a =10;
    int b =01;
    try{
        int c =a/b;
        System.out.println(c);
    }
    catch(ArithmeticException e){
        System.out.println("0 cannot be divided");
    }

    int []n = {1,2,3};
    try{
        System.out.println(n[5]);
    }
    catch(Exception e){
        System.out.println(e.getMessage()+ e.getClass());
    }
    finally{
        System.out.println("executed");
    }
    int age=10;
    if(age<28){
        throw new ArithmeticException("not eligible");
    }
    System.out.println("eligible");
}}
