package baekjoon.math1;
import java.util.*;
public class Sol2745 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String num =sc.next();
        int n=sc.nextInt();
        long sum=0;
        for(int i=0;i<num.length();++i) {
            int ascii=num.charAt(i);
            int realNum=0;
            if (ascii >= 'A') {  //문자인경우
                realNum=ascii-'A'+10;
            }else if( ascii <='9'){ //숫자인경우
                realNum=ascii-'0';
            }
            sum+=(long)Math.pow(n,num.length()-1-i)*realNum;
            //9 -> 57 ,A ->65

        }
        System.out.println(sum);
    }
}
