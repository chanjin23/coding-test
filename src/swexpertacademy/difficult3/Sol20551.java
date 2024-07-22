package swexpertacademy.difficult3;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Sol20551 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 1; i <= t; ++i) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int answer=0;
            while ((c - b) < 1) {
                b--;
                answer++;
            }
            while ((b - a) < 1) {
                a--;
                answer++;
            }
            if (a >= 1 && b >= 2 && c >= 3 && a < b && b < c) {
                System.out.println("#"+i+" "+answer);
            }else{
                System.out.println("#"+i+" -1");
            }
        }
    }
}
