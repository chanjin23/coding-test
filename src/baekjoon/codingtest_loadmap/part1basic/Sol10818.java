package baekjoon.codingtest_loadmap.part1basic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol10818 {
    //최소, 최대
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < n; ++i) {
            int value = Integer.parseInt(st.nextToken());
            max = Math.max(max, value);
            min = Math.min(min, value);
        }

        System.out.println(min + " " + max);
    }
}
