public class branch {
    public static void main(String[] args) {
        for(int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println(i);
        }
        for(int j=1;j<=10;j++){
            if(j==5){
                continue;
            }
            System.out.println(j);
        }
        for(int k=1;k<=10;k++){
            if(k%2==0){
                return;
            }
            System.out.println(k);
        }
    }
}
