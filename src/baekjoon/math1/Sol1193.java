package baekjoon.math1;
import java.util.*;

public class Sol1193 {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        int n= sc.nextInt();
        int total =0;
        int i=1;
        while(true){
            total+=i;
            if(n<=total){
                n=n-total+i;
                break;
            }
            i++;
        }
        if(i%2==0){
            System.out.println(n+"/"+(i-n+1));
        }else{
            System.out.println((i-n+1)+"/"+n);
        }
    }
}
