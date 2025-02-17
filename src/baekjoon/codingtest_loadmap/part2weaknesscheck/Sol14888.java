package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol14888 {
    //연산자 끼워넣기
    static int n, max, min;
    static int[] arr, mid;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Integer.parseInt(br.readLine());
        max = Integer.MIN_VALUE;
        min = Integer.MAX_VALUE;
        arr = new int[n];
        mid = new int[4];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 4; ++i) {
            mid[i] = Integer.parseInt(st.nextToken());
        }

        dfs(1, arr[0]);

        System.out.println(max);
        System.out.println(min);
    }

    public static void dfs(int level, int total) {
        if (level == n) {
            max = Math.max(max, total);
            min = Math.min(min, total);
            return;
        }

        for (int i = 0; i < 4; ++i) {
            if (mid[i] <= 0) continue;
            mid[i]--;
            if (i == 0) {
                dfs(level + 1, total + arr[level]);
            } else if (i == 1) {
                dfs(level + 1, total - arr[level]);
            } else if (i == 2) {
                dfs(level + 1, total * arr[level]);
            } else {
                dfs(level + 1, total / arr[level]);
            }
            mid[i]++;
        }
    }
}
