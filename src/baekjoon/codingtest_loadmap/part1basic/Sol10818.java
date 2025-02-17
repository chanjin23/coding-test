package baekjoon.codingtest_loadmap.part1basic;

import java.util.*;
import java.io.*;

public class Sol10818 {
    //최소, 최대
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }

        System.out.println(min + " " + max);
    }
}
