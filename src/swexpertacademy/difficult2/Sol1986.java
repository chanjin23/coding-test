package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol1986 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            long sum=0;
            for (int j = 1; j <= n; ++j) {
                if (j % 2 == 0) {
                    sum-=j;
                }else {
                    sum+=j;
                }
            }
            System.out.println("#"+(i+1)+" "+sum);
        }

    }
}
