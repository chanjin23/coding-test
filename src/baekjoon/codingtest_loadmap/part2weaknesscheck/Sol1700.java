package baekjoon.codingtest_loadmap.part2weaknesscheck;

import java.util.*;

public class Sol1700 {
    //멀티탭 스케줄링
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < k; ++i) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < k; ++i) {
            if(map.size() <n) {
                map.put(arr[i], 0);
                continue;
            }
            if(map.containsKey(arr[i])) continue;

            Integer[] check = new Integer[k + 1];
            for (int j = i; j < i + n; ++j) {
                if(map.containsKey(arr[j])){
                    check[arr[j]]++;
                }
            }

            Arrays.sort(check);

        }
    }
}
