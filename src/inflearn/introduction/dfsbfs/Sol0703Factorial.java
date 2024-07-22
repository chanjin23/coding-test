package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0703Factorial {
    //자연수 n이 입력되면 n!를 구하는 프로그램을 작성하라
    //예를 들어 5! =5*4*3*2*1
    //입력설명 자연수 1<=n<=100이 주어진다.
    //출력설명 팩토리얼 출력
    //input : 5
    //output : 120
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        System.out.println(dfs(n));
    }
    public static int dfs(int n){
        if(n==1) return 1;
        else return n*dfs(n-1);
    }
}
