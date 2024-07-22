package inflearn.introduction.dynamicprogramming;

import java.util.*;
public class Sol1003MaximumPartialIncreasingSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }
        int[] maximumArr = new int[n];
        maximumArr[0] = 1;
        int answer=0;
        for (int i = 1; i < n; ++i) {
            int max=0;
            for (int j = i - 1; j >= 0; --j) {
                if (arr[i] > arr[j]) {
                    max = Math.max(max, maximumArr[j]);
                }
            }
            maximumArr[i] = max + 1;
            answer = Math.max(maximumArr[i], answer);
        }
        System.out.println(answer);
    }
}
