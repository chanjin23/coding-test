package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol2001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int k = 0; k < t; ++k) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            long max=-1;
            int[][] arr=new int[n][n];
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j < n; ++j) {
                    arr[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < n - m + 1; ++i) {
                for (int j = 0; j < n - m + 1; ++j) {
                    long sum=0;
                    for (int u = i; u < i + m; ++u) {
                        for (int v = j ; v < j + m; ++v) {
                            sum += arr[u][v];
                        }
                    }
                    max = Math.max(max, sum);
                }
            }
            System.out.println("#"+(k+1)+" "+max);
        }
    }
}
