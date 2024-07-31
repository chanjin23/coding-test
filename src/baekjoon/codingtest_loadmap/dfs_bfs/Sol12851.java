package baekjoon.codingtest_loadmap.dfs_bfs;

import java.util.HashMap;
import java.util.Scanner;

public class Sol12851 {
    //숨바꼭질2
    static int n, k,minCount,answer;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();

        if(n>=k){
            System.out.println(n-k);
            System.out.println(1);
            return;
        }

        int tmp=k-n;
        minCount=0;
        while(tmp!=1){
            if (tmp % 2 == 1) {
                tmp--;
            } else {
                tmp/=2;
            }
            minCount++;
        }

        if(n==0){
            minCount++;
            dfs(1, 1);
        }else{
            dfs(n, 0);
        }


        System.out.println(minCount);
        System.out.println(answer);
    }

    private static void dfs(int num, int count) {
        if(minCount <count) return;
        if (num == k &&minCount==count) {
            answer++;
            return;
        }
        if(num>k || count==0){
            dfs(num - 1, count + 1);
        }else{
            dfs(num * 2, count + 1);
            dfs(num + 1, count + 1);
        }
    }
}
