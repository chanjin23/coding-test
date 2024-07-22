package programmers.lv1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ReceiveReport {
    public static void main(String[] args) {
        String[] id_list = {"muzi", "frodo", "apeach", "neo"};
        String[] report = {"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"};
        int k=2;

        int[] answer = new int[id_list.length];
        HashMap<String, HashSet<String>> map = new HashMap<>();
        HashMap<String, Integer> idxMap = new HashMap<>();

        //id_list의 이름을 name 변수에 저장하여 map과 idxMap에 저장
        for (int i = 0; i < id_list.length; i++) {
            String name = id_list[i];
            map.put(name, new HashSet<>());
            idxMap.put(name, i);
        }

        //report 배열의 인덱스를 split으로 쪼개고, map의 신고당한 유저(to)에 선언된
        //Set에 신고한 유저(from) 추가
        for (String s : report) {
            String[] str = s.split(" ");	//"muzi frodo"
            String from = str[0];			//str[0] = "muzi"
            String to = str[1];				//str[1] = "frodo"
            map.get(to).add(from);
        }

        //map에서 id_list 배열의 값을 키로 하여 값을 가져와
        //send Set에 담아주고, 2회 이상 등록된 유저의 인덱스를
        //idxMap에서 가져와 answer 배열의 값을 +!
        for (int i = 0; i < id_list.length; i++) {
            HashSet<String> send = map.get(id_list[i]);
            if (send.size() >= k) {
                for (String name : send) {
                    answer[idxMap.get(name)]++;
                }
            }
        }

        System.out.println(Arrays.toString(answer));

    }
}
