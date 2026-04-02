public class palin {
    public static void main(String[] args) {
        String s1="maam";
        String rev="";
        for(int i=0;i<s1.length();i++){
            rev=s1.charAt(i)+rev;
        }
        if(s1.equals(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
    }
}
