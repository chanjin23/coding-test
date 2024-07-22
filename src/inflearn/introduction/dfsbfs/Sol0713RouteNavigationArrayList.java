package inflearn.introduction.dfsbfs;

import java.util.*;

public class Sol0713RouteNavigationArrayList {
    //인접리스트 방식
    //입력:
//    5 9
//    1 2
//    1 3
//    1 4
//    2 1
//    2 3
//    2 5
//    3 4
//    4 2
//    4 5
    //출력: 6

    static ArrayList<ArrayList<Integer>> list;
    static int m,n;
    static int[] check;
    static int count;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();     //node
        m=sc.nextInt(); //line
        list=new ArrayList<>();
        for(int i=0;i<=n;++i){
            list.add(new ArrayList<>());    //객체 및 노드생성
        }
        for(int i=1;i<=m;++i){
            int x=sc.nextInt();
            int y= sc.nextInt();
            list.get(x).add(y);
        }
        check=new int[n+1];
        check[1]=1;
        dfs(1);
        System.out.println(count);
    }
    public static void dfs(int v){
        if(v==n) count++;
        else{
            for(int i=0;i<list.get(v).size();++i){
                int tmp = list.get(v).get(i);
                if(check[tmp]==0){
                    check[tmp]=1;
                    dfs(tmp);
                    check[tmp]=0;
                }
            }
        }
    }
}
