package tcs_2;

import java.util.*;
public class traine {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] oxy = new int[3][3];

        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                oxy[i][j] = sc.nextInt();

                if(oxy[i][j] < 1 || oxy[i][j] > 100){
                    System.out.println("INVALID INPUT");
                    return;
                }
            }
        }

        int[] avg = new int[3];

        for(int i=0;i<3;i++){
            int sum = 0;
            for(int j=0;j<3;j++){
                sum += oxy[i][j];
            }
            avg[i] = Math.round(sum/3);
        }

        int max = Math.max(avg[0], Math.max(avg[1], avg[2]));

        if(max < 70){
            System.out.println("All trainees are unfit");
            return;
        }

        for(int i=0;i<3;i++){
            if(avg[i] == max){
                System.out.println("Trainee Number : " + (i+1));
            }
        }
    }
}
