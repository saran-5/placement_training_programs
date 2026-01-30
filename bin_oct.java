public class bin_oct {
    public static void main(String[] args) {
        String bin ="10111111";
        String oct="";
        int val;
        while (bin.length()%3!=0) {
            bin="0"+bin;
            
        }
        for(int i=0;i<bin.length();i=i+3){
           int value=0;
            value+=(bin.charAt(i)-'0')*4;
            value+=(bin.charAt(i)-'0')*2;
            value+=(bin.charAt(i)-'0')*1;
            oct+=value;
        }
       System.out.println(oct);
    }
    
}

