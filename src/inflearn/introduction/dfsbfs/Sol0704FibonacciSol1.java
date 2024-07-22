package inflearn.introduction.dfsbfs;

import java.util.*;

public class Sol0704FibonacciSol1 {
    //피보나치 수열을 출력
    //입력설명 항수 3<=n<=45
    //피보나치 출력
    //input : 10
    //output : 1 1 2 3 5 8 13 21 34 55
    public static void main(String[] args) {
        //sol 1: 피보나치 단순구현, 하나를 수행할때마다 계속 반복 1초 -> 2초 -> 3초 -> 4초 ==10초
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; ++i) {
            System.out.print(dfs(i + 1) + " ");
        }
    }

    public static int dfs(int n) {
        if (n == 1 || n == 2) return 1;
        else return dfs(n - 1) + dfs(n - 2);
    }
}
