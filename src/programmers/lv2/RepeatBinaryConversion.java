package programmers.lv2;

import java.util.Arrays;

public class RepeatBinaryConversion {
    public static void main(String[] args) {
        //이진 변환 반복하기
        String s = "110010101001";
        int[] answer =new int[2];

        while(s.length()>1){
            int cntOne =0;
            for(int i=0;i<s.length();++i){
                if(s.charAt(i)=='0') answer[1]++;   //0이나오면 ++
                else cntOne++;  //길이의 개수 ++
            }

            s=Integer.toBinaryString(cntOne); //이진법으로 변환
            answer[0]++;
        }
        System.out.println(Arrays.toString(answer));

    }
}
