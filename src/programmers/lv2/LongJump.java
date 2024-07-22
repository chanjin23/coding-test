package programmers.lv2;

public class LongJump {
    static int[][] memory;
    public long solution(int n) {
        long answer = 0;
        int i=0;
        memory=new int[n+1][n+1];
        while(true){
            if(n-i<i) break;
            answer+=dfs(n-i,i);
            i++;
        }
        return answer;
    }
    public int dfs(int a,int b){
        if(memory[a][b]>0) return memory[a][b];
        if(a==b||b==0) return memory[a][b] = 1;
        else return memory[a][b]=dfs(a-1,b-1)+dfs(a-1,b)%1234567;
    }
    public static void main(String[] args) {
        LongJump T = new LongJump();
        int n=1000;
        System.out.println(T.solution(n));
    }
}
