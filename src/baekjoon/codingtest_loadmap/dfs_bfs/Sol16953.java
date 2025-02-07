package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.Scanner;

public class Sol16953 {
    //A->B
    static long a, b, answer;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        a = sc.nextLong();
        b = sc.nextLong();
        answer = Integer.MAX_VALUE;

        dfs(a, 1);

        if (answer == Integer.MAX_VALUE) System.out.println(-1);
        else System.out.println(answer);
    }

    public static void dfs(long value, int count) {
        if (value > b) return;
        if (value == b) {
            answer = Math.min(answer, count);
            return;
        }
        dfs(value * 2, count + 1);
        dfs(value * 10 + 1, count + 1);
    }
}
