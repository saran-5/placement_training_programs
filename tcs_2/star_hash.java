package tcs_2;

public class star_hash {
    public static void main(String[] args) {
        String s="***###";
        int st=0,hash=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='*'){
                st++;
            }
            else if(s.charAt(i)=='#'){
                hash++;
            }
        }
        int res=st-hash;
        System.out.println(res);
    }
}
