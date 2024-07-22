package baekjoon.loop;

import java.io.*;
import java.util.*;
public class Sol25314 {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        BufferedWriter br = new BufferedWriter(new OutputStreamWriter(System.out));
        int input = sc.nextInt();
        for (int i = 1; i <= input; i += 4) {
            br.write("long ");
        }
        br.flush();
        br.write("int");
        br.flush();

        br.close();

    }
}
