package prac;

import java.util.Stack;

public class Paranthese {
    public boolean isValid(String s){
        Stack<Character> stack= new Stack<Character>();
        for ( char c: s.toCharArray()){
            if(c=='('||c=='{'||c=='['){
                stack.push(c);
            }else{ if(stack.isEmpty()) {
                return false;
            }
            char top = stack.pop();
            if(c==')' && top!='('||c=='}' && top!='{'||c==']' && top!='['){
                return false;
            }
        }}
        return stack.isEmpty();
    }
    public static void main(String[] args){
        Paranthese p = new Paranthese();
        System.out.println(p.isValid("{()}"));
    }
}
