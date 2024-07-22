package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0701RecurseFunction {
    //챕터 7은 코딩채점이 지원되지 않기때문에 말로 풀어서 설명하기
    //자연수 N이 입력되면 재귀함수를 이용하여 1부터 N까지를 출력하는 프로그램을 작성하시오.
    //input : 첫번째 줄에는 3<=n<=10이 입력
    //입력 예제 : 3
    //출력 예제 : 1 2 3
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        dfs(n);
    }
    public static void dfs(int n){
        if(n==0) return;
        else{
            dfs(n - 1);
            System.out.print(n+" ");
        }
    }
}
