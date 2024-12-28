package inflearn.introduction.practice;

import java.util.Scanner;

public class Sol0202 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int max=-1;
        int count = 0;
        for (int i : arr) {
            if (i > max) {
                count++;
                max=i;
            }
        }

        System.out.println(count);
    }
}
