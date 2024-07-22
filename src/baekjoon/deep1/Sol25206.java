package baekjoon.deep1;

import java.util.*;
import java.io.*;
public class Sol25206 {
    public static void main(String[] args) throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String[] object = new String[20];
        double[] score = new double[20];
        String[] grade = new String[20];
        for (int i = 0; i < 20; ++i) {
            st = new StringTokenizer(br.readLine());
            object[i] = st.nextToken();
            score[i] = Double.parseDouble(st.nextToken());
            grade[i] = st.nextToken();
        }
        double objectCount =0;
        double total =0;
        for (int i = 0; i < 20; ++i) {
            if (grade[i].equals("A+")) {
                total += 4.5 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("A0")) {
                total += 4.0 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("B+")) {
                total += 3.5 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("B0")) {
                total += 3.0 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("C+")) {
                total += 2.5 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("C0")) {
                total += 2.0 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("D+")) {
                total += 1.5 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("D0")) {
                total += 1.0 * score[i];
                objectCount += score[i];
            }else if (grade[i].equals("F")) {
                total += 0 * score[i];
                objectCount += score[i];
            }
        }
        System.out.println(total/(objectCount));
    }
}
