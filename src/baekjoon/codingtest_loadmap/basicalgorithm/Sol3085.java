package baekjoon.codingtest_loadmap.basicalgorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Sol3085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        char[][] arr = new char[n][n];
        int answer = 0;

        for (int i = 0; i < n; ++i) {
            String input = sc.nextLine();
            for (int j = 0; j < input.length(); ++j) {
                arr[i][j] = input.charAt(j);
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                char tmp = arr[i][j];
                arr[i][j] = arr[i][j + 1];
                arr[i][j + 1] = tmp;
                answer = Math.max(search(arr), answer);

                arr[i][j + 1] = arr[i][j];
                arr[i][j] = tmp;
            }
        }

        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n - 1; ++j) {
                char tmp = arr[j][i];
                arr[j][i] = arr[j + 1][i];
                arr[j + 1][i] = tmp;
                answer = Math.max(search(arr), answer);

                arr[j + 1][i] = arr[j][i];
                arr[j][i] = tmp;
            }
        }

        System.out.println(answer);
    }

    public static int search(char[][] arr) {
        int max = 0;
        for (int i = 0; i < arr.length; ++i) {
            int tmp = 1;
            for (int j = 0; j < arr[0].length - 1; ++j) {
                if (arr[i][j] == arr[i][j + 1]) {
                    tmp++;
                } else {
                    max = Math.max(max, tmp);
                    tmp = 1;
                }
            }
            max = Math.max(max, tmp);
        }

        for (int i = 0; i < arr[0].length; ++i) {
            int tmp = 1;
            for (int j = 0; j < arr.length - 1; ++j) {
                if (arr[j][i] == arr[j + 1][i]) {
                    tmp++;
                } else {
                    max = Math.max(max, tmp);
                    tmp = 1;
                }
            }
            max = Math.max(max, tmp);
        }

        return max;
    }
}
