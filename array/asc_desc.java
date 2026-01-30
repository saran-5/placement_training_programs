package array;

public class asc_desc {
    public static void main(String[] args) {
        int[] a={10,20,5,30,40,5};
        
        for(int i=0;i<a.length;i++){
            int temp=0;
            for(int j=i+1;j<a.length;j++){
                if(a[i]<a[j]){
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.print("Descending order: ");
        for (int i=0;i<a.length;i++) {
            System.out.print(a[i]+" ");
        }
        System.out.println();
        int []a1={10,20,5,30,40,5};
        for(int i=0;i<a1.length;i++){
            int temp=0;
            for(int j=i+1;j<a1.length;j++){
                if(a1[i]>a1[j]){
                    temp=a1[i];
                    a1[i]=a1[j];
                    a1[j]=temp;
                }
            }
        }
        System.out.print("Ascending order: ");
        for (int k=0;k<a1.length;k++) {
            System.out.print(a1[k]+" ");
        }
    }
}