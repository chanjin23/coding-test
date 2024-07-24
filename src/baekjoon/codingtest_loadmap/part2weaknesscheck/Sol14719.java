package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.Scanner;

public class Sol14719 {
    //빗물
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int[][] arr = new int[h][w];
        int total=0;

        for (int i = 0; i < w; ++i) {
            int height = sc.nextInt();
            for (int j = 0; j < height; ++j) {
                arr[j][i]=1;
            }
        }

        for (int i = 0; i < h; ++i) {
            int count=0;
            boolean check=false;
            for (int j = 0; j < w; ++j) {
                if(arr[i][j]==1) {
                    total+=count;
                    count=0;
                    check=true;
                }
                else if(check && arr[i][j]==0) count++;
            }
        }
        System.out.println(total);
    }
}
