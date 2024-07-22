package programmers.lv1;

import java.util.*;
public class CardBundle {
    public static void main(String[] args) {
        CardBundle T = new CardBundle();
        String[] cards1 = {"i", "drink", "water"};
        String[] cards2 = {"want", "to"};
        String[] goal = {"i", "want", "to", "drink", "water"};
        System.out.println(T.solution(cards1, cards2, goal));

    }
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        Queue<String> c1=new LinkedList<>();
        Queue<String> c2=new LinkedList<>();

        for(int i=0;i<cards1.length;++i) c1.offer(cards1[i]);
        for(int i=0;i<cards2.length;++i) c2.offer(cards2[i]);

        for(String str:goal){
            if(!c1.isEmpty() &&c1.peek().equals(str)) c1.poll();
            else if(!c2.isEmpty()&&c2.peek().equals(str)) c2.poll();
            else return "No";
        }
        return "Yes";
    }
}
