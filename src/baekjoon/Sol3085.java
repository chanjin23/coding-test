package baekjoon;

import java.io.*;

public class Sol3085 {
    public static char[][] board;
    public static int num;
    public static int max = 0;
    public static void main(String[] args) throws IOException {
        //사탕게임

        //1. 값 입력받기
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        board = new char[num][num];

        String line = "";
        for (int i = 0; i < num; ++i) {
            line = br.readLine();
            board[i] = line.toCharArray();
        }

        //행 찾기(x값 바꾸기)
        for (int i = 0; i < num; ++i) {
            for (int j = 0; j < num - 1; ++j) { //열인덱스가 3까지면 2,3스왑
                char swap = board[i][j];
                board[i][j] = board[i][j+1];
                board[i][j+1] = swap;
                // max값 찾으러
                search();
                // 원상 복구
                board[i][j+1]=board[i][j];
                board[i][j] = swap;
            }
        }

        //열 찾기(y값 바꾸기)
        for (int i = 0; i < num; ++i) {
            for (int j = 0; j < num - 1; ++j) {
                char swap = board[j][i];
                board[j][i] = board[j+1][i];
                board[j+1][i] = swap;
                // max값 찾으러
                search();
                // 원상 복구
                board[j + 1][i] = board[j][i];
                board[j][i] = swap;
            }
        }

        System.out.println(max);

    }

    private static void search() {
        //가로x방향으로 하나씩 찾아가면서 count
        for (int i = 0; i < num; i++) {
            int cnt =1;
            for (int j = 0; j < num - 1; j++) {
                if (board[i][j] == board[i][j + 1]) {
                    cnt++;
                } else {
                    cnt =1; //연속되지 않으면 초기화
                }
                max = Math.max(max, cnt);
            }
        }

        //세로(y방향으로 하나씩 찾아가면서 count)
        for (int i = 0; i < num; i++) {
            int cnt = 1;
            for (int j = 0; j < num - 1; j++) {
                if (board[j][i] == board[j + 1][i]) {
                    cnt++;
                } else {
                    cnt = 1; //연속되지않으면 초기화
                }
                max = Math.max(max, cnt);
            }

        }

    }
}
