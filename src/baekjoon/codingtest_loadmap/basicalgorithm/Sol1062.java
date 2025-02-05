package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.*;
import java.io.*;
public class Sol1062 {
    static int n, k, answer;
    static int[] alphabet;
    static String[] arr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        alphabet = new int[26];
        arr = new String[n];

        for (int i = 0; i < n; ++i) {
            arr[i] = br.readLine();
        }

        if (k < 5) {
            System.out.println(0);
            return;
        }
        if (k == 26) {
            System.out.println(n);
            return;
        }

        alphabet['a' - 'a'] = 1;
        alphabet['n' - 'a'] = 1;
        alphabet['t' - 'a'] = 1;
        alphabet['i' - 'a'] = 1;
        alphabet['c' - 'a'] = 1;

        dfs(k - 5, 0);
        System.out.println(answer);
    }

    public static void dfs(int count, int alpha) {
        if (count == 0) {
            int total = 0;
            for (int i = 0; i < n; ++i) {
                boolean flag = false;
                for (int j = 0; j < arr[i].length(); ++j) {
                    char tmp = arr[i].charAt(j);
                    if (alphabet[tmp - 'a'] == 0) {
                        flag = true;
                        break;
                    }
                }
                if (!flag) {
                    total++;
                }
            }
            answer = Math.max(total, answer);
        } else {
            for (int i = alpha; i < 26; ++i) {
                if (alphabet[i] == 0) {
                    alphabet[i] = 1;
                    dfs(count - 1, i);
                    alphabet[i] = 0;
                }
            }
        }
    }
}

