package two_D_array;

public class long_add {
    public static void main(String[] args) {
    String a="12345678901234567890";
    String b="98765432109876543210";
    String result="";
    int carry=0;
    int i=a.length()-1;
    int j=b.length()-1;
        while(i>=0||j>=0||carry>0){
            int sum=carry;
            if(i>=0){
                sum+=a.charAt(i)-'0';
                i--;
            }
            if(j>=0){
                sum+=b.charAt(j)-'0';
                j--;
            }
            carry=sum/10;
            result=(sum%10)+result;
        }
        System.out.println("sum: "+result);
    }
}
