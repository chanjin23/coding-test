package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class SortStringByDescending {
    public static void main(String[] args) {
        //문자열 내림차순으로 배치하기
        String s = "Zbcdefg";
        String answer = "";
        char[] sChar =s.toCharArray();
        Arrays.sort(sChar);
        StringBuilder s1=new StringBuilder(new String(sChar));
        answer =s1.reverse().toString();

        System.out.println("answer = " + answer);
    }
}
