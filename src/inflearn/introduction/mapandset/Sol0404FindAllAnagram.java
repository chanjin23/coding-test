package inflearn.introduction.mapandset;

import java.util.*;
public class Sol0404FindAllAnagram {
//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String s=sc.nextLine();
//        String t=sc.nextLine();
//        HashMap<Character,Integer> map=new HashMap<>();
//        int len=s.length()-t.length()+1;
//        int answer=0;
//        for(int i = 0; i < len; ++i){
//            String str=s.substring(i,i+t.length());
//            boolean flag= true;
//            for(int j=0;j<str.length();++j){
//                char ch=str.charAt(j);
//                map.put(ch,map.getOrDefault(ch,0)+1);
//            }
//            for(int j=0;j<str.length();++j){
//                char ch2=t.charAt(j);
//                if(!map.containsKey(ch2)) {
//                    flag =false;
//                    break;
//                }
//                map.put(ch2,map.get(ch2)-1);
//                if(map.get(ch2)<0) {
//                    flag= false;
//                    break;
//                }
//            }
//            if(flag) answer++;
//            map.clear();
//        }
//        System.out.println(answer);
//    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for(int i=0;i<str2.length();++i){
            char ch2 = str2.charAt(i);
            char ch1= str1.charAt(i);
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
            map1.put(ch1,map1.getOrDefault(ch1,0)+1);
        }
        int answer=0;
        if(map1.equals(map2)) answer++;

        for(int i=1;i<str1.length()-str2.length()+1;++i){
            char ch=str1.charAt(i);
            char right = str1.charAt(i + str2.length() - 1);
            char left =str1.charAt(i-1);
            map1.put(right,map1.getOrDefault(right,0)+1);
            map1.put(left,map1.get(left)-1);
            if(map1.get(left)==0) map1.remove(left);
            if(map1.equals(map2)) answer++;
        }
        System.out.println(answer);

    }
}
