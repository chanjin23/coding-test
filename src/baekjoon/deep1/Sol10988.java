package baekjoon.deep1;

import java.util.*;
public class Sol10988 {
    public static void main(String[] args) {
        //팰린드롬인지 확인하기
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine();
        int len =input.length();
        for(int i=0;i<len;++i){
            if(input.charAt(i)==input.charAt(len-i-1)) continue;
            else {
                System.out.println("0");
                return;
            }
        }
        System.out.println("1");
    }
}
