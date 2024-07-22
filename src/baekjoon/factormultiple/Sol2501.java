package baekjoon.factormultiple;

import java.util.Scanner;

public class Sol2501 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num =sc.nextInt();
        int k =sc.nextInt();
        int count =0;
        for(int i=1;i<=num;++i){
            if(num%i==0){
                ++count;
            }
            if(k==count){
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
