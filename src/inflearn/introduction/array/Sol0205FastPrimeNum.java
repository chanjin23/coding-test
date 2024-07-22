package inflearn.introduction.array;

import java.util.*;
public class Sol0205FastPrimeNum {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n =sc.nextInt();
        boolean[] flag= new boolean[n+1];
        int count =0;
        for(int i=2;i<=n;++i){
            if(!flag[i]){
                count++;
                for(int j=i;j<=n;j=j+i){
                    flag[j]=true;
                }
            }
        }
        System.out.println(count);
    }
}
