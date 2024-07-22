package inflearn.introduction.dynamicprogramming;

import java.util.*;
public class Sol1005CoinChange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coin = new int[n];
        for (int i = 0; i < n; ++i) coin[i] = sc.nextInt();
        int amount = sc.nextInt();
        int[] change = new int[amount + 1];
        Arrays.fill(change, Integer.MAX_VALUE);
        change[0]=0;
        for (int i = 0; i < n; ++i) {
            for (int j = coin[i]; j <= amount; ++j) {
                change[j] = Math.min(change[j], change[j - coin[i]] + 1);
            }
        }
        System.out.println(change[amount]);
    }

}
