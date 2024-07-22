
package programmers.lv1;


import java.util.Scanner;

public class RectangleStar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //2중for문이용
        for(int i=0;i<b;++i){
            for(int j=0;j<a;++j){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
