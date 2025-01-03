package baekjoon.factormultiple2;

import java.util.*;
import java.io.*;

public class Sol2485 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] tree = new int[n];
        for (int i = 0; i < n; ++i) {
            tree[i] = Integer.parseInt(br.readLine());
        }

        int gcd = 0;
        for (int i = 1; i < n; ++i) {
            gcd = gcd(tree[i] - tree[i - 1], gcd);
        }
//        System.out.println(gcd);
        System.out.println((tree[n - 1] - tree[0]) / gcd + 1 - n);
    }

    public static int gcd(int a, int b) {
        if (b == 0) return a;
        if (a % b == 0) return b;
        else return gcd(b, a % b);
    }
}
