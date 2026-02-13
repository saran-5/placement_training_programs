public class hex_add {
    public static void main(String[] args) {
        String a="1A3";
        String b="2B4";
        String sum="";
        int carry=0;
        for(int i=a.length()-1;i>=0;i--){
            int b1=Character.digit(a.charAt(i),16);
            int b2=Character.digit(b.charAt(i),16);        
            int result=b1+b2+carry;
            sum=Integer.toHexString(result%16).toUpperCase()+sum;
            carry=result/16;
        }
        if(carry==1){
            sum="1"+sum;
        }
        

        System.out.println("sum : "+sum);
    }
}
