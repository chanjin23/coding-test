package programmers.lv2;

import java.util.*;

public class Tuple {
    public static void main(String[] args) {
        String s = "{{20,111},{111}}";

        System.out.println(Arrays.toString(solution(s)));
    }

    public static int[] solution(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; ++i) {
            if (Character.isDigit(ch[i]) && !Character.isDigit(ch[i - 1]) && !Character.isDigit(ch[i + 1])) {
                map.put(ch[i] - '0', map.getOrDefault(ch[i] - '0', 0) + 1);
            } else if (Character.isDigit(ch[i])) {
                int tmp = 0;
                while (Character.isDigit(ch[i])) {
                    tmp =tmp*10 + ch[i] - '0';
                    i++;
                }
                map.put(tmp, map.getOrDefault(tmp, 0) + 1);
            }
        }

        int len=map.size();
        int[] answer=new int[len];
        for (int i : map.keySet()) {
            answer[len-map.get(i)]=i;
        }

        return answer;
    }
}
