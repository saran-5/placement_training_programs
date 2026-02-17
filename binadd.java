public class binadd {
    public static void main(String[] args) {
        String a="101";
        String b="1000";
        while (a.length()!=b.length()) {
            if(a.length()<b.length()){
                a="0"+a;
            }
            else{
                b="0"+b;
            }
            
        }
        int carry=0;
        String result="";
        for(int i=a.length()-1;i>=0;i--){
            int b1=a.charAt(i)-'0';
            int b2=b.charAt(i)-'0';
            int sum=b1+b2+carry;
            result=(sum%2)+result;
            carry=sum/2;


        }
        if(carry==1){
            result="1"+result;
        }System.out.println(result);
    }
}
