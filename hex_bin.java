// public class hex_bin {
//     public static void main(String[] args) {
//         String n ="F12";
//         String bin="";
//         for(int i=0;i<n.length();i++){
//             char ch=n.charAt(i);
//             switch(ch){
//                 case '0': bin=bin+"0000"; break;
//                 case '1': bin=bin+"0001"; break;
//                 case '2': bin=bin+"0010"; break;
//                 case '3': bin=bin+"0011"; break;
//                 case '4': bin=bin+"0100"; break;
//                 case '5': bin=bin+"0101"; break;
//                 case '6': bin=bin+"0110"; break;
//                 case '7': bin=bin+"0111"; break;
//                 case '8': bin=bin+"1000"; break;
//                 case '9': bin=bin+"1001"; break;
//                 case 'A': bin=bin+"1010"; break;
//                 case 'B': bin=bin+"1011"; break;
//                 case 'C': bin=bin+"1100"; break;
//                 case 'D': bin=bin+"1101"; break;
//                 case 'E': bin=bin+"1110"; break;
//                 case 'F': bin=bin+"1111"; break;
//             }
//         }        System.out.println("bin : " + bin);

//     }
// }
public class hex_bin {
     public static void main(String[] args) {
         String n ="F12";
         String bin="";
         for(int i=0;i<n.length();i++){
            int value=0;
            if(n.charAt(i) >='0' && n.charAt(i)<='9'){
                value = n.charAt(i) - '0';
            }
            else if(n.charAt(i) >='A'&& n.charAt(i)<='F'){
                value=n.charAt(i)-'A'+10;
            }
            for(int j=3;j>=0;j--){
                int r=value>>j&1;
                bin=bin+r;
            }
        }   System.out.println("bin : " + bin);
    }
}