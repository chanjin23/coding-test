package inflearn.introduction.dfsbfs;

import java.util.Scanner;

public class Sol0704FibonacciSol2 {
    //피보나치 수열을 출력
    //입력설명 항수 3<=n<=45
    //피보나치 출력
    //input : 10
    //output : 1 1 2 3 5 8 13 21 34 55
    static int[] fibonacci;
    public static void main(String[] args) {
        //sol 2: 전역변수 선언하여 이용하는 방법
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacci=new int[n+1]; //index 0번은 버린다.
        dfs(n);
        for (int i = 1; i < n+1; ++i) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int dfs(int n) {
        if (n == 1 || n == 2) return fibonacci[n]=1;
        else return fibonacci[n]=dfs(n - 1) + dfs(n - 2);
    }
}
