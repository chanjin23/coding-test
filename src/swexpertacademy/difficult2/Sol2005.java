package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol2005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int[][] arr = new int[n][n];
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if (k == 0) {
                        arr[j][k]=1;
                        continue;
                    }
                    if(j==0) break;
                    arr[j][k]=arr[j-1][k-1]+arr[j-1][k];
                }
            }
            System.out.println("#" + (i + 1));
            for (int j = 0; j < n; ++j) {
                for (int k = 0; k < n; ++k) {
                    if(arr[j][k]==0) break;
                    System.out.print(arr[j][k]+" ");
                }
                System.out.println();
            }
        }

    }
}
