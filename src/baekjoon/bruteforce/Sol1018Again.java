package baekjoon.bruteforce;
import java.util.*;
import java.io.*;
public class Sol1018Again {
    public static void main(String[] args) throws Exception{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine());
        int n=Integer.parseInt(st.nextToken());
        int m=Integer.parseInt(st.nextToken());
        String[] board=new String[n];
        for(int i=0;i<n;++i){
            board[i]=br.readLine();
        }
        String[] BW={"BWBWBWBW","WBWBWBWB"};
        String[] white=new String[8];
        String[] black=new String[8];

        for(int i=0;i<8;++i){
            if(i%2==0){
                black[i]=BW[0];
                white[i]=BW[1];
            }else{
                black[i]=BW[1];
                white[i]=BW[0];
            }
        }

        int min =10000;
        for(int i=0;i<n-7;++i){
            for(int j=0;j<m-7;++j){
                int whiteCount =0;
                int blackCount = 0;
                for(int k=0;k<8;++k){
                    for(int h=0;h<8;++h){
                        if (white[k].charAt(h) != board[i + k].charAt(h + j)) {
                            whiteCount++;
                        }
                        if (black[k].charAt(h) != board[i + k].charAt(h + j)) {
                            blackCount++;
                        }

                    }
                }
                if (min> blackCount) {
                    min = blackCount;
                } if(min> whiteCount){
                    min =whiteCount;
                }
            } //j
        } //i
        System.out.println(min);
    }
}
