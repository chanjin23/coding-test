package baekjoon.math1;

import java.util.*;
import java.io.*;
public class Sol2869 {

        public static void main(String[] args)throws Exception{
            BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st =new StringTokenizer(br.readLine());
            long a=Long.parseLong(st.nextToken());
            long b=Long.parseLong(st.nextToken());
            long v=Long.parseLong(st.nextToken());
            long day =0;

            day =(v-b)/(a-b);

            if((v-b)%(a-b)!=0) day++;

            System.out.println(day);
            br.close();
        }

}
