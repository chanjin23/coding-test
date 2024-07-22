package baekjoon.factormultiple;

import java.util.Scanner;

public class Sol11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=2;
        while(n>=i){
            if(n%i!=0){
                ++i;
                continue;
            }
            System.out.println(i);
            n/=i;
        }
        sc.close();

    }
}
