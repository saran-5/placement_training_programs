public class check_arr {
    public static void main(String[] args) {
        int[]a={11, 1, 13, 21, 3, 7};
        int[]b={11, 3, 7, 1};
        boolean sub=true;
        for(int i=0;i<b.length;i++){
            boolean fo=false;
            for(int j=0;j<a.length;j++){
                if(b[i]==a[j]){
                    fo=true;
                    break;
                }
            }
            if(fo==false){
                sub=false;
                break;
            }

        }
        if(sub){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
