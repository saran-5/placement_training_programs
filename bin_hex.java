public class bin_hex {
    public static void main(String[] args) {
        String bin ="11111";
        String oct="";
        while (bin.length()%4!=0) {
            bin="0"+bin;
            
        }
        for(int i=0;i<bin.length();i=i+4){
           int value=0;
            value+=(bin.charAt(i)-'0')*8;
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i)-'0')*2;
            value+=(bin.charAt(i)-'0')*1;
            if(value>10){
                int rem=value%16;
                oct+=(char)((rem-10)+'A');
            }
            else{
                oct+=value;
            }
            
        }
        System.out.println(oct); 
    }
}