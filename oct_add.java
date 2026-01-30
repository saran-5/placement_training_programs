public class oct_add {
    public static void main(String[] args) {
        String a="123";
        String b="643";
        String sum="";
        int carry=0;
        for(int i=a.length()-1;i>=0;i--){
            int b1=a.charAt(i)-'0';
            int b2=b.charAt(i)-'0';
        
            int result=b1+b2+carry;
            sum=(result%8)+sum;
            carry=result/8;
        }
        if(carry==1){
            sum="1"+sum;
        }
        

        System.out.println("sum : "+sum);
    }
}        