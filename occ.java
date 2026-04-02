public class occ {
    public static void main(String[] args) {
        String s1="helloworld";
        String s2="do";
        int count=0;
        for(int i=0;i<s2.length();i++){
            char c= s2.charAt(i);
            boolean a=false;
            for(int j=0;j<i;j++){
                if(c==s2.charAt(j)){
                    a=true;
                    break;
                }            
            }
            if(!a){
            for(int k=0;k<s1.length();k++){
                if(c==s1.charAt(k)){
                    count++;
                }
            }
            }
        }
        System.out.println(count);
    }
}

