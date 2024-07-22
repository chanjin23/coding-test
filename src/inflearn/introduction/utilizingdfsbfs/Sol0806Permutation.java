package inflearn.introduction.utilizingdfsbfs;

import java.util.Scanner;

public class Sol0806Permutation {
    //10이하의 n개의 자연수가 주어지면 이 중 m개를 뽑아 일렬로 나열하는 방법을 모두 출력한다.
    static int n,m;
    static int[] arr,answer;
    static boolean[] flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        flag=new boolean[n];
        answer=new int[m];

        for (int i = 0; i < n; ++i) {
            arr[i] = sc.nextInt();
        }

        dfs(0);
    }

    public static void dfs(int level) {
        if (level == m) {
            for(int i:answer) {
                System.out.print(i + " ");
            }
            System.out.println();
        }else{
            for (int i = 0; i < n; ++i) {
                if(flag[i]) continue;   //예외처리

                answer[level]=arr[i];
                flag[i]=true;
                dfs(level + 1);
                flag[i]=false;
            }
        }
    }
}
