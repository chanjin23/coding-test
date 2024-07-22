package programmers.lv1;

import java.util.*;
public class HallOfFame1 {
    public static void main(String[] args) {
        HallOfFame1 T = new HallOfFame1();
        int k=3;
        int[] score = {10, 100, 20, 150, 1, 100, 200};
        System.out.println(Arrays.toString(T.solution(k, score)));
    }
    public int[] solution(int k, int[] score) {
        int[] answer=new int[score.length];
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<score.length;++i){
            list.add(score[i]);
            Collections.sort(list);
            while(list.size()> k){
                list.remove(0);
            }
            answer[i]=list.get(0);
        }

        return answer;
    }
}
