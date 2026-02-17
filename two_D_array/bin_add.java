package two_D_array;

public class bin_add {
    public static void main(String[] args) {
        String a="1001";
        String b="1111";
        while (a.length()!=b.length()) {
            if(a.length()<b.length()){
                a="0"+a;
            }
            else{
                b="0"+b;
            }
        }
        int carry=0;
        String res =" ";
        for(int i=a.length()-1;i>=0;i--){
            int b1=a.charAt(i)-'0';
            int b2=b.charAt(i)-'0';
            int sum =b1+b2+carry;
            res=(sum%2)+res;
            carry=sum/2;

        }
        if(carry==1){
            res="1"+res;
        }System.out.println(res);
    }
}
