package programmers.lv1;

public class DotProduct {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int[] b = {-3, -1, 0, 2};
        int answer = 0;
        //a,b랑 곱하고 더하기
        int len =a.length;
        for(int i=0;i<len;++i){
            answer+=a[i]*b[i];
        }
        System.out.println("answer = " + answer);
    }
}
