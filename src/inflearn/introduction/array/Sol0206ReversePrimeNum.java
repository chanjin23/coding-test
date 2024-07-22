package inflearn.introduction.array;

import java.util.Scanner;

public class Sol0206ReversePrimeNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n =sc.nextInt();
        for(int i=0;i<n;++i){
            int num =sc.nextInt();
            int tmp=0;
            int remain =0;
            while(num>0){
                remain=num%10;
                num/=10;
                tmp=tmp*10+remain;
            }
            boolean flag =true;
            if(tmp==1) flag=false;
            for(int j=2;j<tmp;++j){
                if(tmp%j==0) {
                    flag =false;
                    break;
                }
            }
            if(flag) System.out.print(tmp+ " ");
        }
    }
}
