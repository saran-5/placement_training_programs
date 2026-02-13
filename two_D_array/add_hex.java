// package two_D_array;
// import java.util.*;
// public class add_hex {
//     public static void main(String[] args) {
//         int decA=26;
//         int decB=15;
//         int tempA = decA;
//         String hexA = "";
//         if (tempA == 0)
//             hexA = "0";
//         else {
//             while (tempA>0) {
//                 int rem=tempA % 16;
//                 if (rem<10)
//                     hexA=rem+hexA;
//                 else
//                     hexA=(char)((rem - 10) + 'A') + hexA;
//                 tempA = tempA / 16;
//             }
//         }
//         int tempB=decB;
//         String hexB="";
//         if (tempB == 0)
//             hexB = "0";
//         else {
//             while (tempB>0) {
//                 int rem=tempB%16;
//                 if (rem <10)
//                     hexB=rem+hexB;
//                 else
//                     hexB=(char)((rem -10)+'A')+ hexB;
//                 tempB = tempB / 16;
//             }
//         }
//         int sum = decA + decB;
//         int tempSum = sum;
//         String hexSum = "";
//         if (tempSum==0)
//             hexSum="0";
//         else {
//             while (tempSum > 0) {
//                 int rem = tempSum % 16;
//                 if (rem < 10)
//                     hexSum = rem + hexSum;
//                 else
//                     hexSum = (char)((rem - 10) + 'A') + hexSum;
//                 tempSum = tempSum / 16;
//             }
//         }
//         System.out.println("Hex A: " + hexA);
//         System.out.println("Hex B: " + hexB);
//         System.out.println("Hex Sum: " + hexSum);
//         System.out.println("Decimal Sum: " + sum);
//     }
// }

package two_D_array;

public class add_hex {
    public static String decimalToHex(int dec) {
        String hex = "";
        if (dec == 0)
            return "0";
        while (dec > 0) {
            int rem = dec % 16;
            if (rem < 10)
                hex=rem+hex;
            else
                hex=(char)((rem-10)+'A')+hex;
            dec/=16;
        }
        return hex;
    }
    public static void main(String[] args) {
        int decA = 26;
        int decB = 15;
        String hexA = decimalToHex(decA);
        String hexB = decimalToHex(decB);
        int sum = decA + decB;
        String hexSum = decimalToHex(sum);
        System.out.println("Hex A: " + hexA);
        System.out.println("Hex B: " + hexB);
        System.out.println("Hex Sum: " + hexSum);
        System.out.println("Decimal Sum: " + sum);
    }
}
