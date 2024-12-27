package inflearn.introduction.practice;

import java.util.ArrayList;
import java.util.Scanner;

public class Sol0201 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        for (int i = 1; i < n; ++i) {
            if (arr[i - 1] < arr[i]) {
                list.add(arr[i]);
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
