package inflearn.introduction.utilizingdfsbfs;

import java.util.Scanner;

public class Sol0807Combination {
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        arr = new int[n+1][m+1];
        System.out.println(dfs(n, m));
    }

    public static int dfs(int n,int m) {
        if (arr[n][m] > 0) return arr[n][m];
        if (n == m || m == 0) {
            return 1;
        } else {
            return arr[n][m]=dfs(n - 1, m - 1) + dfs(n - 1, m);
        }
    }
}
