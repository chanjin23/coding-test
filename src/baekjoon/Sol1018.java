package baekjoon;

import java.util.*;
import java.io.*;
public class Sol1018 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine()," "); //값을 받은다음에

        int column = Integer.parseInt(st.nextToken());  //값 추출
        int row = Integer.parseInt(st.nextToken());

        String[] board = {"BWBWBWBW", "WBWBWBWB"};
        String[] white = new String[8];
        String[] black = new String[8];
        int tmp1 = 0, tmp2 = 1, tmp3 = 0;
        for (int i = 0; i < 8; ++i) {
            white[i] = board[tmp2];
            black[i] = board[tmp1];
            tmp3=tmp1;
            tmp1=tmp2;
            tmp2=tmp3;
        }
//        System.out.println(Arrays.toString(white));
        String[] chess = new String[column];
        for (int i = 0; i < column; ++i) {
            chess[i] = br.readLine();
        }

        //column -8 >=0 일때 반복
        //substring을 이용
        //8*8체스판의 크기가 column*row안에 돌아야하므로 column-8+1 번 반복
        int whiteCount = 0;
        int blackCount = 0;
        int minCount=Integer.MAX_VALUE;
        for (int i = 0; i < column - 7; ++i) {
            for (int z = 0; z < row - 7; ++z) {
                int tmp11 =0;
                whiteCount=0;
                blackCount=0;
                for (int j = i; j < 8+i; ++j) { //검사로직
                    int tmp22=0;
                    for (int k = z; k < 8+z; ++k) {
                        if (chess[j].charAt(k) != white[tmp11].charAt(tmp22)) {
                            whiteCount++;
                        }
                        if (chess[j].charAt(k) != black[tmp11].charAt(tmp22)) {
                            blackCount++;
                        }
                        tmp22++;
                    }//k
                    tmp11++;
                }//j  검사로직
                if (minCount > blackCount) {
                    minCount = blackCount;
                }
                if (minCount > whiteCount) {
                    minCount = whiteCount;
                }
            }//z
        }//i
        System.out.println(minCount);

    }
}
