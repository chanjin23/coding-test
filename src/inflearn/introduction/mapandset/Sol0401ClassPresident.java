package inflearn.introduction.mapandset;

import java.util.*;
public class Sol0401ClassPresident {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        HashMap<Character,Integer> map =new HashMap<>();
        int n=sc.nextInt();
        sc.nextLine();
        String str=sc.nextLine();
//        for(int i=0;i<str.length();++i){
//            char ch=str.charAt(i);
//            if(!map.containsKey(ch)){
//                map.put(ch,1);
//            }else{
//                int count =map.get(ch);
//                map.put(ch,++count);
//            }
//        }
        for(int i=0;i<str.length();++i){
            char ch =str.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
//        map.remove('A');  //해당 key를 삭제해준다.
//        map.size();   //map의 key의 개수
        int max=0;
        String answer="";
        for(char c:map.keySet()){
            if(map.get(c)>max){
                max=map.get(c);
                answer=String.valueOf(c);
            }
        }
        System.out.println(answer);

    }
}
