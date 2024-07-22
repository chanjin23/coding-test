package swexpertacademy.difficult2;

import java.util.*;

public class Sol1983 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] str = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};
        for (int i = 0; i < t; ++i) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            Integer[] arr = new Integer[n];
            int idx=-1;
            int tmp=0;
            for (int j = 0; j < n; ++j) {
                int midTest = sc.nextInt();
                int finalTest = sc.nextInt();
                int homework = sc.nextInt();
                arr[j] = midTest * 35 + finalTest * 45 + homework * 20;
                if (j +1== m) {
                    tmp=arr[j];
                }
            }
            Arrays.sort(arr, Collections.reverseOrder());
            for (int j = 0; j < n; ++j) {
                if (arr[j] == tmp) {
                    idx=j;
                    break;
                }
            }
            System.out.println("#"+(i+1)+" "+str[(idx)/(n/10)]);
        }
    }
}
