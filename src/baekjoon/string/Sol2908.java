package baekjoon.string;

import java.util.*;
public class Sol2908 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        String newX="";
        String newY="";
        while (x > 0) {
            newX += String.valueOf(x % 10);
            x/=10;
        }
        while (y > 0) {
            newY += String.valueOf(y % 10);
            y/=10;
        }
        if (Integer.parseInt(newX) >= Integer.parseInt(newY)) {
            System.out.println(newX);
        }
        if (Integer.parseInt(newX) < Integer.parseInt(newY)) {
            System.out.println(newY);
        }
    }
}
