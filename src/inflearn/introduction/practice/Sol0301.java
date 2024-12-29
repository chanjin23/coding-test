package inflearn.introduction.practice;

import java.util.Scanner;

public class Sol0301 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr1 = new int[n];

        for (int i = 0; i < n; ++i) {
            arr1[i] = sc.nextInt();
        }

        int m = sc.nextInt();
        int[] arr2 = new int[m];

        for (int i = 0; i < m; ++i) {
            arr2[i] = sc.nextInt();
        }

        int[] answer = new int[n + m];

        int idx1 = 0;
        int idx2 = 0;
        int answerIdx = 0;

        while (answerIdx < n + m) {
            if (idx1 >= n) {
                answer[answerIdx] = arr2[idx2];
                idx2++;
            } else if (idx2 >= m) {
                answer[answerIdx] = arr1[idx1];
                idx1++;
            } else if (arr1[idx1] >= arr2[idx2]) {
                answer[answerIdx] = arr2[idx2];
                idx2++;
            } else {
                answer[answerIdx] = arr1[idx1];
                idx1++;
            }
            answerIdx++;
        }

        for (int i : answer) {
            System.out.print(i + " ");
        }
    }
}
