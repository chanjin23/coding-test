package baekjoon.math1;

import java.util.Scanner;

public class Sol2292 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input =sc.nextInt();
        int tmp=1;
        int count =1;
        int i=1;
        while(input>tmp){
            ++count;
            tmp=tmp+6*i;
            ++i;
        }
        System.out.println(count);
    }
}
