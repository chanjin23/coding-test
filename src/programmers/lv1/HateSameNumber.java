package programmers.lv1;

import java.util.ArrayList;
import java.util.Arrays;

public class HateSameNumber {
    public static void main(String[] args) {
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        //같은 숫자는 싫어
        ArrayList<Integer> list =new ArrayList<>();
        for(int i=0;i<arr.length;++i){
            if(i==0){
                list.add(arr[i]);
            }
            else if(arr[i]==arr[i-1]){
                continue;
            }else{
                list.add(arr[i]);
            }
        }
        int[] answer = new int[list.size()];
        for(int i=0;i<list.size();++i){
            answer[i]=list.get(i);
        }

        System.out.println(Arrays.toString(answer));

    }
}
