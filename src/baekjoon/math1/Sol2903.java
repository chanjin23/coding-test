package baekjoon.math1;

import java.util.Scanner;

public class Sol2903 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();
        int prev=2;
        int output =0;
        for(int i=0;i<input;++i){
            prev = (prev - 1) * 2 + 1;
            output =prev;
        }
        System.out.println(output*output);
    }
}
