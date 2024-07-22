package programmers.lv1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class EliminateSmallNumber {
    public static void main(String[] args) {
//        int[] arr = {4, 3, 2, 1};
        int[] arr = {10};
        //for문을 통해서 arr 꺼내기
        //비교해서 새로운 answer만들기
        int small =arr[0];
        int count =0;
        if(arr.length==1){
            int[] answer = new int[]{-1};
            System.out.println(Arrays.toString(answer));
            System.exit(0);
        }
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=1;i<arr.length;++i){
            if(small>arr[i]){
                small =arr[i];
            }
        }
        int[] answer = new int[arr.length-1];
        for(int i=0;i<arr.length;++i){
            if(small==arr[i]){
                continue;
            }
            list.add(arr[i]);
        }
        for(int i=0;i<arr.length-1;++i){
            answer[i]=list.get(i);
        }

        System.out.println(Arrays.toString(answer));
    }
}
