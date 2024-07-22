package inflearn.introduction.utilizingdfsbfs;

import java.util.Scanner;

public class Sol0802BadukiRiding {
    static int c,n;
    static int max=-1;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        c=sc.nextInt();
        n=sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;++i) arr[i]=sc.nextInt();

        dfs(0, 0, arr);
        System.out.println(max);
    }

    public static void dfs(int level, int sum, int[] arr) {
        if(sum >c) return;
        if(level==n){
            max = Math.max(max, sum);
        }else{
            dfs(level + 1, sum + arr[level], arr);
            dfs(level + 1, sum , arr);
        }
    }
}
