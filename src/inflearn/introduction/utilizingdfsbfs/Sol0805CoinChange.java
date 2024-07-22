package inflearn.introduction.utilizingdfsbfs;


import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sol0805CoinChange {
    static int n,m;
    static Integer[] arr;
    static int min=Integer.MAX_VALUE;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        arr = new Integer[n];
        for (int i = 0; i < n; ++i) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr, Collections.reverseOrder());
        m = sc.nextInt();
        dfs(0, 0);
        System.out.println(min);
    }

    public static void dfs(int count, int sum) {
        if(min <=count) return;
        if (m <= sum) {
            if (m == sum) {
                min = Math.min(min, count);
            }
        }
        else{
            for (int i = 0;i<n; ++i) {
                dfs(count + 1, sum + arr[i]);
            }
        }
    }
}
