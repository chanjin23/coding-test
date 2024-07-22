package baekjoon.conditionalstatement;

import java.io.*;
import java.util.*;
public class Sol2525 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st =new StringTokenizer(br.readLine()," ");

        int hour = Integer.parseInt(st.nextToken());
        int minute = Integer.parseInt(st.nextToken());

        int plus = Integer.parseInt(br.readLine());

        int totalMinute = hour * 60 + minute + plus;
        if (totalMinute >= 1440) {
            totalMinute -= 1440;
        }
        System.out.println(totalMinute / 60 + " " + totalMinute % 60);
    }
}
