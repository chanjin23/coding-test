package baekjoon.factormultiple2;

import java.util.Scanner;

public class Sol1934 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int bcd = bcd(a, b);
            System.out.println(a * b / bcd);
        }
    }

    public static int bcd(int a, int b) {
        if(a%b==0) return b;
        else return bcd(b,a%b);
    }
}
