package programmers.lv2;

/**
 * 입력
 * 1 0 1 1 1
 * 1 0 1 0 1
 * 1 0 1 1 1
 * 1 1 1 0 1
 * 0 0 0 0 1
 *  --> 번역하면 이거 1 0 1 1 1 1 0 1 0 1 1 0 1 1 1 1 1 1 0 1 0 0 0 0 1
 * 출력 : 11
 * */

import java.util.*;
public class GameMapShortDistance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] maps = new int[5][5];

        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                maps[i][j] = sc.nextInt();
            }
        }
        System.out.println(Solution.solution(maps));
    }
    public static class Solution{
        static int[] dx={1,0,-1,0};
        static int[] dy={0,1,0,-1};
        public static int solution(int[][] maps) {
            int answer = 1;
            int maxX=maps.length;
            int maxY=maps[0].length;

            Queue<Point> q=new LinkedList<>();
            q.offer(new Point(0,0));
            maps[0][0]=0;   //지나간길은 벽으로 막기
            while(!q.isEmpty()){
                int len=q.size();
                for(int i=0;i<len;++i){
                    Point tmp=q.poll();
                    if(tmp.x==maxX-1 &&tmp.y==maxY-1) return answer;
                    for(int j=0;j<4;++j){
                        int nx=tmp.x+dx[j];
                        int ny=tmp.y+dy[j];
                        if(nx>=0 &&nx<maxX &&ny>=0 &&ny<maxY && maps[nx][ny]==1){
                            maps[nx][ny]=0;
                            q.offer(new Point(nx,ny));
                        }
                    }
                }
                answer++;
            }

            return -1;
        }
        static class Point{
            int x;
            int y;
            public Point(int x,int y){
                this.x=x;
                this.y=y;
            }
        }
    }
}
