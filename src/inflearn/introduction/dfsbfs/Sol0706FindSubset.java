package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0706FindSubset {
    //자연수 N이 주어지면 1부터 n까지의 원소를 갖는 집합의 부분집합을 모두 출력하라
    //입력 1<=n<=10
    //출력 첫 번째부터 각 줄에 하나씩 부분집합을 아래와 출력예제와 같은 순서로 출력한다.
    //input : 3
    //output : 1 2 3, 1 2, 1 3, 1 , 2 3, 2, 3
    static int n;
    static boolean[] flag;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        flag=new boolean[n+1];
        dfs(1);
    }
    public static void dfs(int node){
        if(node==n+1){
            String tmp="";
            for(int i=1;i<=n;++i){
                if(flag[i]) tmp+=(i+" ");
            }
            System.out.println(tmp);
        }else{
            flag[node]=true;
            dfs(node+1);    //o
            flag[node]=false;
            dfs(node+1);    //x
        }
    }
}
