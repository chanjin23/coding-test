package inflearn.introduction.array;

import java.util.Scanner;

public class Sol0204Fibonacci {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int first=1;
        int second=1;
        System.out.print("1 1 ");
        for(int i=3;i<=n;++i){
            int tmp=first;
            first=second;
            second=tmp+second;
            System.out.print(second+" ");
        }
    }
}
