package programmers.lv1;

import java.util.Arrays;

public class SumOfMatrix {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2}, {2, 3}};
        int[][] arr2 = {{3, 4}, {5, 6}};

        int x=arr1[0].length;
        int y=arr1.length;
        int[][] answer = new int[y][x];
        //2중 for문을 이용해서 덧셈 하기
        for(int i=0;i<y;++i){
            for(int j=0;j<x;++j){
                answer[i][j]=arr1[i][j] +arr2[i][j];
            }
        }

        System.out.println(Arrays.deepToString(answer));
    }
}
