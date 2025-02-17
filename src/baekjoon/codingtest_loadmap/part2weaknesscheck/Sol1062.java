package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;
import java.io.*;

public class Sol1062 {
    //가르침
    static int n, k, answer;
    static boolean[] alphabet;
    static String[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());
        alphabet = new boolean[26];
        arr = new String[n];
        answer = 0;

        alphabet['a' - 'a'] = true;
        alphabet['n' - 'a'] = true;
        alphabet['t' - 'a'] = true;
        alphabet['i' - 'a'] = true;
        alphabet['c' - 'a'] = true;

        for (int i = 0; i < n; ++i) {
            arr[i] = br.readLine();
        }

        dfs(k - 5, 0);

        System.out.println(answer);
    }

    public static void dfs(int count, int pos) {
        if (count == 0) {
            int total = 0;
            for (int i = 0; i < n; ++i) {
                boolean flag = true;
                for (char c : arr[i].toCharArray()) {
                    if (!alphabet[c - 'a']) {
                        flag = false;
                        break;
                    }
                }
                if (flag) total++;
            }
            answer = Math.max(total, answer);
            return;
        }

        for (int i = pos; i < 26; ++i) {
            if (!alphabet[i]) {
                alphabet[i] = true;
                dfs(count - 1, i);
                alphabet[i] = false;
            }
        }
    }
}
