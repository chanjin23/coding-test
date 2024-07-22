package programmers.lv1;

import java.util.Arrays;

public class Budget {
    public static void main(String[] args) {
        int[] d = {1, 3, 2, 5, 4};
        int budget =9;
        Arrays.sort(d); //오름차순정렬
        int i=0;
        for(;i<d.length;++i){
            budget-=d[i];
            if(budget<0) break;
        }
        System.out.println(i);
    }
}
