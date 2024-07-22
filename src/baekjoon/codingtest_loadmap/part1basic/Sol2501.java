package baekjoon.codingtest_loadmap.part1basic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sol2501 {
    //약수 구하기
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int n = sc.nextInt();
        int k = sc.nextInt();
        boolean check[] = new boolean[n + 1];

        for (int i = 1; i <= n; ++i) {
            if(check[i]) continue;
            if (n % i == 0) {
                list.add(i);
                if(i!=n/i) list.add(n / i);
                check[i] = true;
                check[n / i] = true;
            }
        }

        Collections.sort(list);

        if(list.size()<k) System.out.println(0);
        else System.out.println(list.get(k-1));
    }
}
