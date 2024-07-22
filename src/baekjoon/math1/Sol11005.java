package baekjoon.math1;

import java.util.*;
public class Sol11005 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int input=sc.nextInt();
        int n=sc.nextInt();
        int remain =0;
        StringBuilder sb =new StringBuilder();
        while(input>0){
            remain =input%n;
            sb.append(changeNum(remain));
            input/=n;
        }
        System.out.println(sb.reverse());

    }
    private static char changeNum(int num){
        int changeNum=0;
        if(num>=10){
            changeNum='A'+(num-10);
        }else{
            changeNum=num+'0';
        }
        return (char)changeNum;
    }
}
