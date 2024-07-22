package inflearn.introduction.dfsbfs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

//입력
/*6 9
1 4
1 3
2 1
2 5
3 4
4 5
4 6
6 2
6 5*/
public class Sol0714GraphShortestRouteBFSArray {
    static int n,m,level;
    static ArrayList<ArrayList<Integer>> graph;
    static int[] check;
    static int[] distance;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(); //node
        int m = sc.nextInt();   //line
        graph =new ArrayList<>();
        distance =new int[n+1];
        check=new int[n+1];
        for(int i=0;i<=n;++i){
            graph.add(new ArrayList<>());
        }   //0~n
        for(int i=0;i<m;++i){
            int x=sc.nextInt();
            int y=sc.nextInt();
            graph.get(x).add(y);
        }
        check[1]=1;
        distance[1]=0;
        bfs(1,0);

        for(int i=1;i<=n;++i){
            System.out.println(i+": "+ distance[i]);
        }
    }
    public static void bfs(int v,int level){
        Queue<Integer> q = new LinkedList<>();
        q.offer(v);
        while(!q.isEmpty()){
            int len =q.size();
            for(int i=0;i<len;++i){
                int current=q.poll();
                for (int k:graph.get(current)) {
                    if (check[k] == 0) {
                        q.offer(k);
                        check[k] = 1;
                        distance[k]=distance[current]+1;
                    }
                }
            }
            level++;
        }

    }


}
