package baekjoon.conditionalstatement;

import java.io.*;
import java.util.*;
public class Sol2480 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] dice = new int[3];
        for (int i = 0; i < 3; ++i) {
            dice[i] = sc.nextInt();
        }
        int prize =0;
        int large =0;
        if (dice[0] == dice[1] && dice[1] == dice[2]) {
            prize = 10000 + (dice[0]) * 1000;
        } else if (dice[0] == dice[1] || dice[1] == dice[2] || dice[0] == dice[2]) {
            if (dice[0] == dice[1]) {
                prize = 1000 + dice[0] * 100;
            }
            if (dice[1] == dice[2]) {
                prize = 1000 + dice[1] * 100;
            }
            if (dice[0] == dice[2]) {
                prize = 1000 + dice[0] * 100;
            }
        } else {
            if (large <= dice[0]) {
                large = dice[0];
            }
            if (large <= dice[1]) {
                large = dice[1];
            }
            if (large <= dice[2]) {
                large = dice[2];
            }
            prize = large * 100;
        }
        System.out.println(prize);
    }   //main
}
