package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0702BinaryOutput {
    //10진수 n이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요. 재귀함수를 이용해서
    //첫 번째줄에 10진수 1<=n<1000 이 주어진다.
    //이진수를 출력
    //입력 : 11
    //출력 : 1011
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        dfs(n);
    }
    public static void dfs(int n){
        //DFS문제는 왠만하면 if-else 구문으로 이용하면 풀린다.
        if(n==0) return;
        else{
            dfs(n/2);
            System.out.print(n%2);
        }
    }
}
