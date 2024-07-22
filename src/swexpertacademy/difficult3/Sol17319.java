package swexpertacademy.difficult3;

import java.util.*;
import java.io.*;

public class Sol17319 {
    public static void main(String[] args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; ++i) {
            boolean flag=true;
            int n = sc.nextInt();
            sc.nextLine();
            String str = sc.nextLine();
            if(n%2==1){
                System.out.println("#"+(i+1)+" No");
            }else{
//                String tmp1 = str.substring(0, n / 2);
//                String tmp2 = str.substring(n / 2, n);
//                if (tmp1.equals(tmp2)) {
//                    System.out.println("#"+(i+1)+" YES");
//                }else{
//                    System.out.println("#"+(i+1)+" NO");
//                }
                for(int j=0;j<str.length()/2;j++) {
                    if(str.charAt(j)!=str.charAt(str.length()/2+j)) {
                        flag=false;
                    }
                }
                if(flag) System.out.println("#"+(i+1)+" Yes");
                else System.out.println("#"+(i+1)+" No");
            }
        }
    }
}
