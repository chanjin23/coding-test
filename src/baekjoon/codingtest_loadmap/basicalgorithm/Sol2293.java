package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.*;
import java.io.*;

public class Sol2293 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int[] arr = new int[n + 1];
        int[] dp = new int[k + 1];
        dp[0] = 1;  //맨처음 실행횟수

        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(br.readLine());
            for (int j = arr[i]; j <= k; ++j) {
                dp[j] += dp[j - arr[i]];
            }
        }

        System.out.println(dp[k]);

    }
}
