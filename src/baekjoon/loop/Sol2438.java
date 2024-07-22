package baekjoon.loop;

import java.io.*;
import java.util.*;
public class Sol2438 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = sc.nextInt();

        //2중for문
        for (int i = 1; i <= input; ++i) {
            for (int j = input-i; j < input;++j ) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
