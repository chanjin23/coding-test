package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Sol1062 {
    //가르침
    static int k,max=0;
    static boolean[] alphabet;
    static String[] word;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        alphabet = new boolean[26];
        word = new String[n];
        for (int i = 0; i < n; ++i) {
            String tmp = br.readLine();
            word[i] = tmp;
        }

        alphabet['a' - 'a'] = true;
        alphabet['c' - 'a'] = true;
        alphabet['i' - 'a'] = true;
        alphabet['n' - 'a'] = true;
        alphabet['t' - 'a'] = true;

        if(k<5) {
            System.out.println(0);
            return;
        }
        dfs(0);

        System.out.println(max);
    }

    private static void dfs(int level) {
        if (k - 5 == level) {
            int count =0;
            for (int i = 0; i < word.length; ++i) {
                boolean check=false;
                for (char c : word[i].toCharArray()) {
                    if(!alphabet[c-'a']) check=true;
                }
                if(!check) count++;
            }
            max = Math.max(max, count);
        } else {
            for (int i = 0; i < word.length; ++i) {
                for (char c : word[i].toCharArray()) {
                    if (alphabet[c - 'a']) continue;

                    alphabet[c-'a']=true;
                    dfs(level + 1);
                    alphabet[c-'a']=false;
                }
            }
        }
    }
}
