package programmers.lv1;

import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        //정수 내림차순 배치하기
        long n=493192L;
        String[] list =String.valueOf(n).split("");
        Arrays.sort(list, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder(); //객체를 append할때마다 새로 생성시키지 x
        for (String s : list) {
            sb.append(s);   //배열 합치기
        }
        Long answer = Long.parseLong(sb.toString());
        System.out.println("answer = " + answer);

    }
}
