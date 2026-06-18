package prac;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class agevalidation {
    public static void main(String[] args) {
        int age = 26;
        if (age < 23 || age > 27) {
            throw new ArithmeticException("not valid age");
        }
        System.out.println("valid age");

        
        try{
            FileReader file = new FileReader("D:\\placement\\prac\\square.java");
            System.out.println("working man");
        }
        catch(Exception e){
            System.out.println("not working baka!!!!!!!");
        }
        
        int bal=4000;
        int withdrawl=10000;
        if(withdrawl>bal ){
            throw new ArithmeticException("not that much amount fool");
        }
        System.out.println("enjoy");
    }

}
