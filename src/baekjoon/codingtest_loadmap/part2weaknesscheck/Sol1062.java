package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sol1062 {
    //가르침
    static String[] input;
    static boolean[] alphabet;
    static int k, answer = 0, n;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        input = new String[n];
        alphabet = new boolean[26];
        alphabet['a' - 'a'] = true;
        alphabet['c' - 'a'] = true;
        alphabet['i' - 'a'] = true;
        alphabet['n' - 'a'] = true;
        alphabet['t' - 'a'] = true;
        for (int i = 0; i < n; ++i) {
            input[i] = br.readLine();
        }

        if (k < 5) {
            System.out.println(0);
            return;
        } else if (k == 26) {
            System.out.println(n);
            return;
        }

        dfs(0,0);
        System.out.println(answer);
    }

    public static void dfs(int alpha, int level) {
        if (level == k - 5) {
            int total = 0;
            for (int i = 0; i < n; ++i) {
                boolean flag = false;
                for (char c : input[i].toCharArray()) {
                    if (!alphabet[c - 'a']) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) total++;
            }
            answer = Math.max(total, answer);
        } else {
            for (int i = alpha; i < 26; ++i) {
                if (!alphabet[i]) {
                    alphabet[i] = true;
                    dfs(i,level + 1);
                    alphabet[i] = false;
                }
            }
        }
    }
}
