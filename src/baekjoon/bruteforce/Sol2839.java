package baekjoon.bruteforce;
import java.util.*;

public class Sol2839 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();

        //안되는 경우
        if(n==4||n==7){
            System.out.println("-1");
            System.exit(0);
        }

        //3kg 포대를 최소
        for(int i=0;i<=10;++i){
            for(int j=0;j<=1000;++j){
                int tmp=i*3+j*5;
                if(n<tmp) break;
                if(n==tmp){
                    System.out.println(i+j);
                    return;
                }
            }
        }
    }
}
