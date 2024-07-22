package programmers.lv1;

import java.util.Scanner;

public class Collatz {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int answer = 0;
        long n =num;
        while(n!=1){
            if(n%2==0){
                n/=2;
            }
            else{
                n=n*3+1;
            }
            ++answer;

            if(answer>=500){
                System.out.println("-1");
            }
        }
        System.out.println("answer = " + answer);
    }
}
