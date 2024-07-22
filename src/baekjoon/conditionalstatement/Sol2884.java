package baekjoon.conditionalstatement;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol2884 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine()," ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int totalMinute = hour * 60 + minute - 45;
        if (totalMinute <0) {
            totalMinute += 1440;
        }
        System.out.println(totalMinute / 60 + " " + totalMinute % 60);
    }
}
