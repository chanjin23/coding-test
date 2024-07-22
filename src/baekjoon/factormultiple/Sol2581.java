package baekjoon.factormultiple;

import java.util.Scanner;

public class Sol2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        long sum =0;
        int first=Integer.MAX_VALUE;
        for(int i=m;i<=n;++i){
            boolean flag =true;
            if(i==1){
                flag =false;
            }
            for(int j=2;j<i;++j){
                if(i%j==0){
                    flag =false;
                    break;
                }
            }
            if(flag){
                sum+=i;
                if(first>=i) first =i;
            }
        }
        if(sum==0){
            System.out.println("-1");
            System.exit(0);
        }
        System.out.println(sum);
        System.out.println(first);
    }
}
