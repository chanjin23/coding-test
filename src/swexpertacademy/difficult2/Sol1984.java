package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol1984 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int[] arr = new int[10];
            int max=-1;
            int min = 100001;
            long sum=0;
            for (int j = 0; j < 10; ++j) {
                arr[j] = sc.nextInt();
                max = Math.max(max, arr[j]);
                min = Math.min(min, arr[j]);
                sum+=arr[j];
            }
            sum -=(min + max);
            System.out.println("#" + (i + 1) + " " + Math.round((double)sum/8));
        }
    }
}
