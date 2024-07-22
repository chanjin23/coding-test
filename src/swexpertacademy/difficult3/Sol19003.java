package swexpertacademy.difficult3;

import java.util.*;
import java.io.*;

public class Sol19003 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 1; i <= t; ++i) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());

            ArrayList<String> list = new ArrayList<>();
            for (int j = 0; j < n; ++j) {
                list.add(br.readLine());
            }

            int answer1=0;
            int answer2=0;
            for(String str:list){
                if (list.contains(new StringBuilder(str).reverse().toString())&&
                        !str.equals(new StringBuilder(str).reverse().toString())) {
                    answer1 += m;
                } else if (str.equals(new StringBuilder(str).reverse().toString())) {
                    answer2=m;
                }
            }
            int answer = answer1 + answer2;
            System.out.println("#"+i+" "+answer);
        }

    }
}
