package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.*;
import java.io.*;

public class Sol2294 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n];
        int[] dp = new int[k + 1];

        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 1; i <= k; ++i) {
            dp[i] = Integer.MAX_VALUE - 1;
        }

        for (int i = 0; i < n; ++i) {
            for (int j = arr[i]; j <= k; ++j) {
                dp[j] = Math.min(dp[j], dp[j - arr[i]] + 1);
            }
        }

        if (dp[k] == Integer.MAX_VALUE - 1) System.out.println(-1);
        else System.out.println(dp[k]);
    }
}
