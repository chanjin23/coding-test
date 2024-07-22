package swexpertacademy.difficult3;

import java.util.Scanner;

public class Sol20019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        for (int i = 0; i < t; ++i) {
            String str = sc.nextLine();
            int lt=0;
            int rt=str.length()-1;
            boolean flag=false;
            char[] ch = str.toCharArray();
            //조건 1
            while (lt <= rt) {
                if (ch[lt] != ch[rt]) {
                    flag=true;
                    break;
                }
                lt++;
                rt--;
            }
            lt=0;
            rt=(str.length()-2)/2;
            while (lt <= rt) {
                if (ch[lt] != ch[rt]) {
                    flag=true;
                    break;
                }
                lt++;
                rt--;
            }
            rt=str.length()-1;
            lt = rt - ((str.length() - 2) / 2);
            while (lt <= rt) {
                if (ch[lt] != ch[rt]) {
                    flag=true;
                    break;
                }
                lt++;
                rt--;
            }
            if(flag) System.out.println("#"+(i+1)+" NO");
            else System.out.println("#"+(i+1)+" YES");
        }
    }
}
