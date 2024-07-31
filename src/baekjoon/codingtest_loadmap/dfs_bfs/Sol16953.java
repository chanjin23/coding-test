package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.Scanner;

public class Sol16953 {
    //A->B
    static long a, b,min;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();

        min = Integer.MAX_VALUE;

        dfs(a, 1);

        if(min==Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(min);
    }

    private static void dfs(long num, int count) {
        if (num > b) return;
        if (num == b) {
            min = Math.min(min, count);
        }
        dfs(num * 2, count + 1);
        dfs(num * 10 + 1, count + 1);
    }

}
