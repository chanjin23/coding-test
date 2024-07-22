package inflearn.introduction.dfsbfs;

import java.util.*;
public class Sol0708FindCalf1 {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        int s=sc.nextInt();
//        int e=sc.nextInt();
//        int jump=0;
//        if(s >e){
//            System.out.println(s-e);
//            return;
//        }
//        while(s!=e){
//            if(e-s>=5){
//                jump+=(e-s)/5;
//                s+=((e-s)/5)*5;
//            }else if(e-s==4){
//                jump+=2;
//                break;
//            }else{
//                s+=1;
//                jump++;
//            }
//        }
//        System.out.println(jump);
//    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int e=sc.nextInt();
        System.out.println(bfs(s,e));
    }
    public static int bfs(int s,int e){
        int[] distance = {-1, 1, 5};
        boolean[] flag=new boolean[10001];
        Queue<Integer> q =new LinkedList<>();
        int level=0;
        q.offer(s);
        flag[s]=true;
        while(!q.isEmpty()){
            int len =q.size();
            for(int i=0;i<len;++i){
                int tmp=q.poll();
                if(tmp==e) return level;
                for(int j=0;j<3;++j){
                    int nx=tmp+distance[j];
                    if(nx>=1&&nx<=10000&&!flag[nx]){
                        q.offer(nx);
                        flag[nx]=true;
                    }
                }
            }
            level++;
        }
        return 0;
    }
}
