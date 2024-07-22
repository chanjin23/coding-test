package inflearn.introduction.stackqueue;

import java.util.*;
import java.io.*;
public class Sol0503CatchDollInCrane {
    public static void main(String[] args) throws Exception{
        //입력
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] board = new int[n][n];
        for(int i=0;i<n;++i){
            st=new StringTokenizer(br.readLine());
            for(int j=0;j<n;++j){
                board[i][j]=Integer.parseInt(st.nextToken());
            }
        }
        int moves=Integer.parseInt(br.readLine());
        st=new StringTokenizer(br.readLine());
        int[] arr=new int[moves];
        for(int i=0;i<moves;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }

        //로직
        int answer=0;
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<moves;++i) {
            for (int j = 0; j < n; ++j) {
                if (board[j][arr[i] - 1] != 0) {
                    if(stack.isEmpty()) stack.push(board[j][arr[i] - 1]);
                    else if(stack.peek()==board[j][arr[i] - 1]){
                        stack.pop();
                        answer+=2;
                    }else{
                        stack.push(board[j][arr[i] - 1]);
                    }
                    board[j][arr[i] - 1] = 0;
                    break;
                }
            }
        }
        System.out.println(answer);


    }
}
