package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol1926 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            int tmp=i;
            int remain=-1;
            int sum=0;
            while (tmp > 0) {
                remain =tmp%10;
                if (remain % 3 == 0 && remain!=0) {
                    ++sum;
                }
                tmp/=10;
            }
            if (sum == 0) {
                System.out.print(i+" ");
            }else{
                for (int j = 0; j < sum; ++j) {
                    System.out.print("-");
                }
                System.out.print(" ");
            }
        }
    }
}
