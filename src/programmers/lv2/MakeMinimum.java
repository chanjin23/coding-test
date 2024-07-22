package programmers.lv2;

import java.util.Arrays;

public class MakeMinimum {
    public static void main(String[] args) {
        //최솟값 만들기
        int[] A = {1, 4, 2};
        int[] B = {5, 4, 4};

        int answer = 0;
        Arrays.sort(A);
        Arrays.sort(B);
        int len =A.length;
        for(int i=0;i<len;++i){
            answer+=A[i]*B[len-1-i];
        }

        System.out.println(answer);
    }
}
