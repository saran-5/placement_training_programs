package prac;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.TreeSet;

public class iterable {
    public static void main(String[] args){
    ArrayList<String> n = new ArrayList<>();
    ArrayList<Integer> s = new ArrayList<>();
    n.add("hello");
    n.add("world");
    s.add(10);
    s.add(23);
    s.add(20);
    s.get(1);
    s.set(1, 25);
    s.remove(0);
    for(String name : n){
        System.out.println(name);
    }
    for(Integer m : s){
        System.out.print(m+" ");
    }
    LinkedList<Integer> e =new LinkedList<>();
    e.add(12);
    e.add(13);
    e.add(14);
    e.addFirst(10);
    e.addLast(15);
    
    for( int k : e){
        System.out.println(k+" ");
    }
    LinkedHashSet<Integer> nn = new LinkedHashSet<>();// removes duplicates
    nn.add(20);
    nn.add(23);
    nn.add(20);
    for(int l : nn){
        System.out.print(l+" ");
    }
    TreeSet<Integer> d = new TreeSet<>();// gives in a sorted order
    d.add(20);
    d.add(23);
    d.add(12);
    for(int l : d){
        System.out.println(l);
    }
}
}
