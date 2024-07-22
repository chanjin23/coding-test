package programmers.lv2;

import java.util.*;
public class NumberOfConsecutiveSubsequenceSums {
    public static void main(String[] args) {
        NumberOfConsecutiveSubsequenceSums T = new NumberOfConsecutiveSubsequenceSums();
        int[] elements = {7, 9, 1, 1, 4};
        System.out.println(T.solution(elements));
    }
    public int solution(int[] elements) {
        int len=elements.length;
        HashSet<Integer> set=new HashSet<>();
        for(int i=1;i<=len;++i){
            int sum=0;
            for(int j=0;j<i;++j){
                sum+=elements[j];
            }
            set.add(sum);
            int lt=1,rt=i+lt-1;
            for(int j=0;j<=len;++j){
                sum=sum-elements[lt%len]+elements[rt%len];
                set.add(sum);
                lt++;
                rt++;
            }
        }
        return set.size();
    }
}
