package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol1859 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int j = 0; j < n; ++j) {
                arr[j] = sc.nextInt();
            }
            int max=-1;
            long sum=0;
            int lt=0;
            int rt=0;

            for (int j = 0; j < n; ++j) {
                if (arr[j] > max) {
                    max=arr[j];
                    rt = j;
                }
            }

            while (lt <=rt) {
                for (int j = lt; j < rt; ++j) {
                    sum+=max-arr[j];
                }
                max=-1;  //max 0초기화
                lt=rt+1;
                for (int j = rt+1; j < n; ++j) {
                    if (max < arr[j]) {
                        max = arr[j];
                        rt=j;
                    }
                }
            }
            System.out.println("#"+(i+1)+" "+sum);

        }
    }
}

