package inflearn.introduction.utilizingdfsbfs;

import java.util.Scanner;

public class Sol0804RedundantPermutation {
    //1부터 n까지 번호가 적힌 구슬이 있다. 이 중 중복을 허락하여 m번을 뽑아 일렬로 나열하는 방법을 모두 출력하세요.
    static int n,m;
    static int[] arr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        m=sc.nextInt();
        arr = new int[m];
        dfs(0);
    }

    public static void dfs(int level) {
        if (level == m) {
            for(int i:arr) System.out.print(i + " ");
            System.out.println();
        }else{
            for (int i = 1; i <= n; ++i) {
                arr[level]=i;
                dfs(level + 1);
            }
        }
    }
}
