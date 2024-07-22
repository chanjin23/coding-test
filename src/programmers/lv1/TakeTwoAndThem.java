package programmers.lv1;

import java.util.*;
public class TakeTwoAndThem {
    //두개 뽑아서 더하기
    public static void main(String[] args) {
        int[] numbers = new int[]{2, 1, 3, 4, 1};
        boolean[] check=new boolean[200];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<numbers.length;++i){
            for(int j=i+1;j<numbers.length;++j){
                int tmp=numbers[i]+numbers[j];
                if(check[tmp]) continue;
                list.add(tmp);
                check[tmp]=true;
            }
        }
        Collections.sort(list);
        int[] answer=new int[list.size()];
        for(int i=0;i<list.size();++i){
            answer[i]=list.get(i);
        }
        System.out.println(Arrays.toString(answer));
    }
}
