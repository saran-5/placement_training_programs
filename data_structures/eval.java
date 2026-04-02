package data_structures;
import java.util.*;
public class eval {
    public static void main(String[] args) {
        String n="53+2*2/8+7-";
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<n.length();i++){
            char c=n.charAt(i);
            if(Character.isDigit(c)){
                s.push(c-'0');
            }
            else{
            int b=s.pop();
            int a=s.pop();
            int res=0;
            switch (c) {
                case '+':
                    res=a+b;
                    break;
                case '-':
                    res = a-b;
                    break;
                case '*':
                    res=a*b;
                    break;
                case '/':
                    res=a/b;
                    break;    
                default:
                    break;
            }
            s.push(res);
        }
    }
        System.out.println("result: "+s.pop());

    }
}
