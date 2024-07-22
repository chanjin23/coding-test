package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0112Password {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
        for(int i=0;i<n;++i){
            String tmp =str.substring(0,7).replace('#','1').replace('*','0');
            int num=Integer.parseInt(tmp,2);    //이진수를 10진수로바꿔준다.
            System.out.print((char)num);
            str=str.substring(7);
        }
    }
}
