package inflearn.introduction.dfsbfs;

import java.util.Scanner;

public class Sol0704FibonacciSol3 {
    //피보나치 수열을 출력
    //입력설명 항수 3<=n<=45
    //피보나치 출력
    //input : 10
    //output : 1 1 2 3 5 8 13 21 34 55
    static int[] fibonacci;
    public static void main(String[] args) {
        //sol 3: 매모이제이션 사용
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        fibonacci=new int[n+1]; //index 0번은 버린다.
        dfs(n);
        for (int i = 1; i < n+1; ++i) {
            System.out.print(fibonacci[i] + " ");
        }
    }

    public static int dfs(int n) {
        if(fibonacci[n]>0) return fibonacci[n]; //값이 갱신되어있는지 확인
        //되어있으면 있는 값 재사용, 없으면 피보나치 dfs 수행
        if (n == 1 || n == 2) return fibonacci[n]=1;
        else return fibonacci[n]=dfs(n - 1) + dfs(n - 2);
    }
}
