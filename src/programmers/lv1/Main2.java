package programmers.lv1;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        //하샤드 수
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        boolean answer = true;
        //x의 자리 수 확인 및 합 더하기
        int tmp =x;
        int tmp2=0;
        int sum=0;
        while(tmp>0){
            tmp2=tmp%10;
            tmp/=10;
            sum+=tmp2;
        }
        //x 나누기 sum
        if(x%sum==0){
            answer =true;
        }else{
            answer =false;
        }
        System.out.println("answer = " + answer);
    }
}
