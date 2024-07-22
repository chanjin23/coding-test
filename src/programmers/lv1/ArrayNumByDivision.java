package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayNumByDivision {
    public static void main(String[] args) {
        int[] arr = {5, 9, 7, 10};
        int divisor =5;
        ArrayList<Integer> list =new ArrayList<>();
        //for문돌려서 값 받기
        int len =arr.length;
        for(int i=0;i<len;++i){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        int lenListSize=list.size();

        if(lenListSize==0){
            int[] answer={-1};
            System.out.println("answer = " + Arrays.toString(answer));
        }
        int[] answer = new int[lenListSize];

        for(int i=0;i<lenListSize;++i){
            answer[i]=list.get(i);
        }

        Arrays.sort(answer);

        System.out.println("answer = " + Arrays.toString(answer));
        int[] sd = Arrays.stream(arr).filter(n -> n % divisor == 0).toArray();
        System.out.println("sd = " + Arrays.toString(sd));
    }
}
