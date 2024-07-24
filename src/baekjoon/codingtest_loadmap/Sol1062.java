package baekjoon.codingtest_loadmap;

import java.util.Scanner;

public class Sol1062 {
    //가르침
    static int k,max=0;
    static boolean[] alphabet;
    static String[] word;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        k = sc.nextInt();
        sc.nextLine();

        alphabet = new boolean[26];
        word = new String[n];
        for (int i = 0; i < n; ++i) {
            String tmp = sc.nextLine();
            word[i] = tmp.substring(4, tmp.length()-4);
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
