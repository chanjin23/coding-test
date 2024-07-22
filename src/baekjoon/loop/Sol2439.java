package baekjoon.loop;

import java.io.*;
import java.util.*;
public class Sol2439 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = sc.nextInt();

        for (int i = 1; i <= input; ++i) {
            for (int j = i; j < input; ++j) {
                bw.write(" ");
            }
            for (int k=input-i; k < input; ++k) {
                bw.write("*");
            }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
