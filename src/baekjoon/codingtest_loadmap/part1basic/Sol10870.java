package baekjoon.codingtest_loadmap.part1basic;

import java.util.Scanner;

public class Sol10870 {
    //피보나치 수 5
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        if(n==0) {
//            System.out.println(0);
//            return;
//        }
//        if (n == 1) {
//            System.out.println(1);
//            return;
//        }
//        int[] arr = new int[n];
//
//        arr[0] = 1;
//        arr[1] = 1;
//
//        for (int i = 2; i < n; ++i) {
//            arr[i] = arr[i - 1] + arr[i - 2];
//        }
//
//        System.out.println(arr[n-1]);
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        if(n==0) {
            System.out.println(0);
            return;
        }
        if (n == 1) {
            System.out.println(1);
            return;
        }
        if (n == 2) {
            System.out.println(1);
            return;
        }
        int[] arr = new int[n];

        int first=1;
        int second=1;
        for (int i = 2; i < n; ++i) {
            arr[i]=first+second;

            int tmp=first;
            first=second;
            second=tmp+second;
        }
        System.out.println(arr[n - 1]);
    }
}
