package baekjoon.bruteforce;
import java.util.*;

public class Sol2231 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=1;i<=n;++i){
            int total =0;
            int tmp=i;
            while(tmp>0){
                total+=tmp%10;
                tmp/=10;
            }
            if(total+i==n){
                System.out.println(i);
                return;
            }
        }
        System.out.println("0");
    }
}
