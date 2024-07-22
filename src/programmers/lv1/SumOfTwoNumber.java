package programmers.lv1;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        //두 정수 사이의 합
        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        long answer = 0;
        int count =0;
        long sum=0;
        if(a>b){
            count =a-b+1;
            for(int i=0;i<count;++i){
                sum+=b;
                ++b;
            }

        }else{
            count =b-a+1;
            for(int i=0;i<count;++i){
                sum+=a;
                ++a;
            }
        }

        answer =sum;
        System.out.println("answer = " + answer);
    }
}
