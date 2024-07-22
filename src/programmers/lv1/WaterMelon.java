package programmers.lv1;

import java.util.Scanner;

public class WaterMelon {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        StringBuilder answer = new StringBuilder();
        //홀수면 수 짝수면 박
        for(int i=0;i<n;++i){
            if(i%2==0){
                answer.append("수");
            }else{
                answer.append("박");
            }

        }

        System.out.println(answer.toString());
    }
}
