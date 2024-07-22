package baekjoon.codingtest_loadmap.part1basic;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sol2309 {
    //일곱 난쟁이
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];

        int total=0;
        for (int i = 0; i < 9; ++i) {
            arr[i] = sc.nextInt();
            total+=arr[i];
        }
        Arrays.sort(arr);
        int idx1=0,idx2=0;

        for (int i = 0; i < 9; ++i) {
            for (int j = 1; j < 9; ++j) {
                if(i==j) continue;

                if (total - arr[i] - arr[j] == 100) {
                    for (int k = 0; k < 9; ++k) {
                        if (k == i || k == j) continue;
                        System.out.println(arr[k]);
                    }
                    return;
                }
            }
        }
    }
}
