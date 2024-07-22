package inflearn.introduction.utilizingdfsbfs;

import java.util.*;
import java.io.*;
public class Sol0801SubsetWithSameSum {
    static int n,total=0;
    static boolean flag=false;
    static String answer;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n=Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[n];
        for (int i = 0; i < n; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
            total+=arr[i];
        }

        //로직
        answer = "NO";
        dfs(0,0,arr);
        System.out.println(answer);
    }

    public static void dfs(int level,int sum,int[] arr) {
        if(flag) return;
        if (sum > (total - sum)) {
            return;
        }
        if(level==n){
            if (sum == (total -sum)) {
                answer = "YES";
                flag = true;
            }
        } else{
            dfs(level + 1, sum, arr);    //포함 안시킬때
            dfs(level + 1, sum+arr[level], arr);    //포함시킬때
        }
    }
}
