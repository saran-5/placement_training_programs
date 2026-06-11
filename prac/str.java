package prac;

public class str {
    public static void main(String[] args) {
        String n="wow i take";
        System.out.println(n.length());
        System.out.println(n.toUpperCase());
        System.out.println(n.toLowerCase());
        int c=0;
        int cons=0;
        for(int i=0;i<n.length();i++){
            char ch = n.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
            else{
                cons++;
            }
        }
        System.out.println("vowels "+c);
        System.out.println("constants "+cons);
        String rev="";

        for(int i=n.length()-1;i>=0;i--) {
            rev+=n.charAt(i);
        }
        System.out.println(rev);
        if(n.equals(rev)) {
        System.out.println("Palindrome");
        } 
        else {
            System.out.println("Not Palindrome");
        }
        int cc=0;
        for(int i=0;i<n.length();i++){
            char ch=n.charAt(i);
            if(ch==' '){
                cc++;
            }
        }
        System.out.println(cc);
        String s=n.replace(" ","");
        System.out.println(s);
        
}
}
