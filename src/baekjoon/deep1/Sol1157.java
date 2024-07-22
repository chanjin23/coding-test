package baekjoon.deep1;

import java.util.*;
public class Sol1157 {
    public static void main(String[] args) {
        //단어 공부
        Scanner sc =new Scanner(System.in);
        String input =sc.nextLine().toUpperCase();  //소문자로 바꾼다.
        int len =input.length();
        //알파벳은 총 26개
        int[] alphabet=new int[26];     //0 : a , 1: b ... 25: z
        for(int i=0;i<len;++i){
            int index=input.charAt(i)-65;  //a: 65,  b:67..
            alphabet[index]++;
        }

        int max =Integer.MIN_VALUE;
        int alphabetIndex=0;
        for(int i=0;i<26;++i){
            if(alphabet[i]>max){
                max=alphabet[i];
                alphabetIndex=i;
            }
        }
        int count =0;
        for(int i=0;i<26;++i){
            if(max==alphabet[i]){
                count++;
            }
        }

        if(count==1){
            System.out.println((char)(alphabetIndex + 65));
        }else{
            System.out.println("?");
        }

    }
}
