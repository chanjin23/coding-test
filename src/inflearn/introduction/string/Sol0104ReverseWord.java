package inflearn.introduction.string;

import java.util.*;
import java.io.*;
public class Sol0104ReverseWord {
    //1.StringBuilder reverse 이용하는방법
//    public static void main(String[] args) throws Exception{
//        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
//        int n =Integer.parseInt(br.readLine());
//        for(int i=0;i<n;++i){
//            StringBuilder sb=new StringBuilder();
//            sb.append(br.readLine()).reverse();
//            System.out.println(sb);
//        }
//    }

    //2. 직접 구현하는방법 (중요)
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;++i){
            String str=sc.nextLine();
            char[] ch=str.toCharArray();
            //뒤집는 알고리즘(중요)
            int first =0;
            int last =str.length()-1;
            while (first < last) {
                char tmp =ch[first];
                ch[first] =ch[last];
                ch[last] =tmp;
                first++;
                last--;
            }
            System.out.println(String.valueOf(ch));
        }
    }
}
