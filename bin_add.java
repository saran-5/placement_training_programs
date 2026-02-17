public class bin_add {
    public static void main(String[] args) {
        String a="1010";
        String b="1101";
        while (a.length()!=b.length()) {
            if(a.length()>b.length()){
                b="0"+b;
            }
            else{
                a="0"+a;
            }
        }
        String sum="";
        int carry=0;
        int result=0;
        for(int i=a.length()-1;i>=0;i--){
            int b1=a.charAt(i)-'0';
            int b2=b.charAt(i)-'0';
        
            result=b1+b2+carry;
            sum=(result%2)+sum;
            carry=result/2;
        
        if(carry==1){
            sum="1"+sum;
        }
}
        System.out.println("sum : "+sum);
    }
}        
