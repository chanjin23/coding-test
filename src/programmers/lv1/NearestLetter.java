package programmers.lv1;

import java.util.*;
public class NearestLetter {
    public static void main(String[] args) {
        String s = "banana";
        int[] answer = new int[s.length()];
        HashMap<Character,Integer> map =new HashMap<>();
        for(int i=0;i<s.length();++i){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
                answer[i]=-1;
            }else{
                answer[i]=i-map.get(s.charAt(i));
                map.put(s.charAt(i),i);
            }
        }

        System.out.println(Arrays.toString(answer));
    }
}
