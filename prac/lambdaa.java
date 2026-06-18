package prac;
import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;

public class lambdaa {
    public static void main(String[] args) {
        // Function <Integer, Integer> s = n-> n*n;
        // System.out.println(s.apply(5));
        // System.out.println(s.apply(2)); 
        Predicate< Integer> pos = n -> n>0;
        System.out.println(pos.test(0));
    }
}
