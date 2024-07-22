package programmers.lv1;

public class SumOfPlusMinus {
    public static void main(String[] args) {
        int[] absolutes = {4, 7, 12};
        boolean[] signs = {true, false, true};
        //값을 받아와서 signs가 양수면 + 음수면 -
        int sum =0;
        int len =absolutes.length;
        for(int i=0;i<len;++i){
            if(signs[i]){
                sum+=absolutes[i];
            }else{
                sum-=absolutes[i];
            }
        }
        int answer = sum;
        System.out.println("answer = " + answer);
    }
}
