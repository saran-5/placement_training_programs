package prac;

public class sum {
    public static void main(String[] args) {
        int []a={1,2,4};
        int sum=0;
        for(int i=0;i<a.length;i++){
            sum+=a[i];
        }
        System.out.println(sum);
        float avg=0;
        avg=sum/2;
        System.out.println(avg);
        int max=a[0];
        for(int i=1;i<a.length;i++){        
        if(a[i]>max){
            max=a[i];
        }   
        } System.out.println(max+"is largest");
        int small=a[0];
        for(int i=1;i<a.length;i++){
        if(a[i]<small){
            small=a[i];
        }   
        } System.out.println(small+"is smallest");
        int even=0;
        int odd=0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even "+even+" odd "+odd);

        int p=0;
        int n=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>0){
                p++;
            }
            else{
                n++;
            }
        }
        System.out.println("pos "+ p+ " negative "+n);

        int k=2;
        for(int i=0;i<a.length;i++){
            if(k==a[i]){
                System.out.println("found "+i);
            }
        }

        int sl=0;
        int m=0;
        for(int i=0;i<a.length;i++){
            if(a[i]>m){
                sl=m;
                m=a[i];
            }
        }
        System.out.println(sl+"sec large");
        int sml=Integer.MAX_VALUE;
        int ss=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++) {
            if(a[i]<sml) {
                ss=sml;
                sml=a[i];
            } 
            else if(a[i]<ss&&a[i]!=sml) {
                ss=a[i];
            }
    }
    System.out.println(ss + " sec small");
    for(int i=a.length-1;i>=0;i--){
        System.out.println(a[i]);
    }
    
    }
    
}
