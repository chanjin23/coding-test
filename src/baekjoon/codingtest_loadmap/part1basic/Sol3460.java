package baekjoon.codingtest_loadmap.part1basic;

import java.util.ArrayList;
import java.util.Scanner;

public class Sol3460 {
    //이진수
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int count=0;
            while (n > 0) {
                if (n % 2 == 1) {
                    System.out.print(count+" ");
                }
                n/=2;
                count++;
            }
            System.out.println();
        }
    }
}
