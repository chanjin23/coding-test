package programmers.lv2;

import java.util.*;
public class ContinuousSubSequence {
    public static void main(String[] args) {
        ContinuousSubSequence T = new ContinuousSubSequence();
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(T.solution(elements));
    }
    public int solution(int[] elements){
        HashSet<Integer> set = new HashSet<>();
        int len = elements.length;
        for(int i=1;i<=len;++i){
            int sum=0;
            for(int j=0;j<i;++j){
                sum+=elements[j];
                set.add(sum);
            }
            for(int j=0;j<elements.length;++j){
                int lt = j;
                int rt = j + i;
                sum = sum - elements[lt % len] + elements[rt % len];
                set.add(sum);
            }
        }
        return set.size();
    }
}
