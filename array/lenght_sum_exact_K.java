package array;

public class lenght_sum_exact_K {
    public static void main(String[] args) {
        int []a={1,1,1,1,1,1};
        int b=2;
        int sum=0,len=0,l=0;
        for(int i=0;i<a.length;i++){
            sum=0;
            for(int j=i;j<a.length;j++){
                sum+=a[j];
                if(sum>=b){
                    if(sum==b){
                        l=j-i+1;
                    }
                    break;
                }
            }
            if(l>len){
                len=l;
            }
        }
        System.out.println(len);
    }
            
}
