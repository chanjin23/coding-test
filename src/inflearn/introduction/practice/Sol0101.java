package inflearn.introduction.practice;

import java.util.Scanner;

public class Sol0101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char alphabet = sc.nextLine().toUpperCase().charAt(0);
        int count = 0;

        for (char c : str.toUpperCase().toCharArray()) {
            if(c==alphabet) count++;
        }

        System.out.println(count);
    }
}
