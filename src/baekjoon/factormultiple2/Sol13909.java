package baekjoon.factormultiple2;

import java.util.Scanner;

public class Sol13909 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int count = 0;
        for (long i = 1; i <= n; ++i) {
            if (i * i <= n) {
                count++;
            }else break;
        }
        System.out.println(count);
    }

}
