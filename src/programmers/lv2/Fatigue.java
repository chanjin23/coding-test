package programmers.lv2;

public class Fatigue {
    static int[] check;
    static int answer=0;
    public static void main(String[] args) {
        Fatigue T = new Fatigue();
        int k=80;
        int[][] dungeons = {{80, 20}, {50, 40}, {30, 10}};
        System.out.println(T.solution(k, dungeons));

    }
    public int solution(int k, int[][] dungeons) {
        check=new int[dungeons.length];
        dfs(0,k,dungeons);
        return answer;
    }

    public void dfs(int level,int sum,int[][] dungeons){
        for(int i=0;i<dungeons.length;++i){
            int minNeedFatigue=dungeons[i][0];
            int consumeFatigue=dungeons[i][1];
            if(check[i]==1) continue;
            if(sum<minNeedFatigue) continue;
            check[i]=1;
            dfs(level+1,sum-consumeFatigue,dungeons);
            check[i]=0;
        }   //for
        answer=Math.max(answer,level);
    }   //dfs
}
