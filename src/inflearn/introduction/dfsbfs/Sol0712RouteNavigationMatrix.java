package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0712RouteNavigationMatrix {
    //인접행렬 방식
    //입력: 5 9
    //1 2
    //1 3
    //1 4
    //2 1
    //2 3
    //2 5
    //3 4
    //4 2
    //4 5
    //출력: 6

    static int n,m,answer=0;
    static int[][] graph;
    static int[] check;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        n=sc.nextInt(); //node
        m=sc.nextInt(); //간선
        graph = new int[n + 1][n + 1];
        check=new int[n+1];
        for(int i=0;i<m;++i){
            int x=sc.nextInt();
            int y=sc.nextInt();
            graph[x][y]=1;
        }
        check[1]=1;
        dfs(1);
        System.out.println(answer);
    }

    public static void dfs(int v){
        if(v==n) answer++;
        else{
            for(int i=1;i<=n;++i){
                if(graph[v][i] == 1 &&check[i]==0){
                    check[i]=1;
                    dfs(i);
                    check[i]=0;
                }
            }
        }
    }
}
