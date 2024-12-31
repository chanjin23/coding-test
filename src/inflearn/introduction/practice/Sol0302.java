package inflearn.introduction.practice;

import java.util.*;

public class Sol0302 {
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

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        int idx1 = 0;
        int idx2 = 0;

        ArrayList<Integer> list = new ArrayList<>();
        while (idx1 < n && idx2 < m) {
            if (arr1[idx1] == arr2[idx2]) {
                list.add(arr1[idx1]);
                idx1++;
                idx2++;
            } else if (arr1[idx1] > arr2[idx2]) {
                idx2++;
            } else {
                idx1++;
            }
        }

        for (Integer i : list) {
            System.out.print(i + " ");
        }
    }
}
