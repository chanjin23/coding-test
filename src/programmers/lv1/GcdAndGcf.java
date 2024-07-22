package programmers.lv1;

import java.util.Arrays;

public class GcdAndGcf {
    public static void main(String[] args) {
        int n=3;
        int m=12;
        //유클리드 호제법
        //최대공약수 : 큰수%작은수==0일때 까지 무한 루프 조건을 만족하면 작은수가 최대공약수
        //최소공배수 : 두개의 수 * 최대공약수
        int large =0;
        int small =0;
        if(n>m){
            large =n;
            small =m;
        }else{
            large =m;
            small =n;
        }
        int remain =-1;
        while(remain!=0){
            remain=large%small;
            large=small;
            small =remain;
        }
        int max=large;
        int min=m*n/large;
        int[] answer = {max,min};
        System.out.println(Arrays.toString(answer));
    }
}
