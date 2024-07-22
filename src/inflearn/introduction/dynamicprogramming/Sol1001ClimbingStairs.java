package inflearn.introduction.dynamicprogramming;

import java.util.Scanner;

public class Sol1001ClimbingStairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        arr[0] = 1;
        arr[1] = 2;
        for (int i = 2; i < n; ++i) {
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        System.out.println(arr[n-1]);
    }
}
