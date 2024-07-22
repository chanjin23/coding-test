package baekjoon.factormultiple;

import java.util.Scanner;

public class Sol1978 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        int count =0;
        for (int i = 0; i < n; ++i) {
            int num =sc.nextInt();
            boolean flag =true;
            if(num==1){
                flag =false;
            }
            for(int j=2;j<num;++j){
                if(num%j==0){
                    flag=false;
                    break;
                }
            }
            if(flag){
                ++count;
            }
        }
        System.out.println(count);
    }
}
