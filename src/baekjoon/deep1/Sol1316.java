package baekjoon.deep1;

import java.util.*;
import java.io.*;
public class Sol1316 {
    static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception{
        //그룹 단어 체커
        int count =0;
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; ++i) {
            if (check() == true) {
                count++;
            }
        }
        System.out.println(count);
    }
    private static boolean check() throws IOException{
        boolean[] check = new boolean[26];
        int prev =0;
        String input = br.readLine();
        for (int i = 0; i < input.length(); ++i) {
            int now = input.charAt(i);  //문자를 숫자로 바꿈

            //이전 문자가 중복되지않을경우
            if (prev != now) {

                //처음 나오는 경우
                if (check[now - 'a'] == false) {
                    check[now - 'a'] = true;
                    prev =now;
                }
                //true인경우
                else{
                    return false;   //그룹단어가 아니므로
                }

            }
            //중복될경우
            else{
                continue;
            }
        }
        return true;
    }
}
