package baekjoon.setandmap;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Sol1746 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        Set<String> noSpeakPerson = new HashSet<>();
        Set<String> noLookPerson = new HashSet<>();


        for (int i = 0; i < n; ++i) {
            noSpeakPerson.add(br.readLine());
        }

        for (int i = 0; i < m; ++i) {
            noLookPerson.add(br.readLine());
        }

        noLookPerson.retainAll(noSpeakPerson);
        ArrayList<String> list = new ArrayList<>(noLookPerson);
        Collections.sort(list);
        bw.write(String.valueOf(list.size())+"\n");
        for (String s : list) {
            bw.write(s+"\n");
        }
        bw.flush();
        bw.close();
    }
}
