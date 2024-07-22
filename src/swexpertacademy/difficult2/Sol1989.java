package swexpertacademy.difficult2;

import java.util.Scanner;

public class Sol1989 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; ++i) {
            String str = sc.nextLine();
            char[] ch = str.toCharArray();
            int lt=0;
            int rt = ch.length - 1;
            boolean flag=false;
            while (lt <= rt) {
                if(ch[lt]!=ch[rt]){
                    flag=true;
                    break;
                }
                lt++;
                rt--;
            }
            if(flag) System.out.println("#"+(i+1)+" 0");
            else System.out.println("#"+(i+1)+" 1");
        }
    }
}
