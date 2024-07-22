package inflearn.introduction.utilizingdfsbfs;


import java.util.Scanner;

public class Sol0808GuessSequence {
    static int n,m;
    static int[] arr,cb,checkDfs;
    static int[][] check;
    static boolean flag;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n];
        checkDfs = new int[n+1];
        cb = new int[n];
        check = new int[n][n];
        for (int i = 0; i < n; ++i) {
            cb[i]=combination(n - 1, i);
        }
        dfs(0, 0);
    }

    public static void dfs(int level, int sum) {
        if(flag) return;
        if(m <sum) return;
        if (level == n) {
            if (m == sum) {
                for (int i : arr) {
                    System.out.print(i+" ");
                    flag=true;
                }
            }
        } else {
            for (int i = 0; i < n; ++i) {
                if(checkDfs[i+1]==1) continue;
                arr[level] = i + 1;
                checkDfs[i+1]=1;
                int tmp = arr[level] * cb[level];
                dfs(level + 1, sum + tmp);
                checkDfs[i+1]=0;
            }
        }
    }

    public static int combination(int a, int b) {
        if (check[a][b] > 0) {
            return check[a][b];
        }
        if (a == b || b == 0) {
            return 1;
        } else return check[a][b]=combination(a - 1, b - 1) + combination(a - 1, b);
    }
}
