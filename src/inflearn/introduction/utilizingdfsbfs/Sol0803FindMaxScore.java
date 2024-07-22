package inflearn.introduction.utilizingdfsbfs;
import java.util.*;
public class Sol0803FindMaxScore {
    static int n,m,max;
    static int[][] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr = new int[n][2];
        for (int i = 0; i < n; ++i) {
            arr[i][0]=sc.nextInt(); //점수
            arr[i][1]=sc.nextInt(); //시간
        }
        max=-1;
        dfs(0, 0, 0);
        System.out.println(max);
    }

    public static void dfs(int level, int sum, int time) {
        if(time >m) return;
        if (level == n) {
            max = Math.max(max, sum);
        }else{
            dfs(level + 1, sum, time);
            dfs(level + 1, sum + arr[level][0], time+arr[level][1]);
        }
    }
}
