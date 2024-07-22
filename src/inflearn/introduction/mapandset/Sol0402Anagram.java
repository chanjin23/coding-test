package inflearn.introduction.mapandset;

import java.util.*;
public class Sol0402Anagram {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        HashMap<Character,Integer> map =new HashMap<>();
        if(str1.length()!=str2.length()) {
            System.out.println("No");
            System.exit(0);
        }
        for(int i=0;i<str1.length();++i){
            char ch=str1.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for(int i=0;i<str2.length();++i){
            char ch=str2.charAt(i);
            if(!map.containsKey(ch)) {
                System.out.println("NO");
                return;
            }
            map.put(ch,map.get(ch)-1);
            if(map.get(ch)<0){
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");

    }

//    public static void main(String[] args) {
//        Scanner sc=new Scanner(System.in);
//        String str1 = sc.nextLine();
//        String str2 = sc.nextLine();
//        char[] ch1 = str1.toCharArray();
//        char[] ch2 = str2.toCharArray();
//        Arrays.sort(ch1);
//        Arrays.sort(ch2);
//        for(int i=0;i<str1.length();++i){
//            if(ch1[i]!=ch2[i]){
//                System.out.print("NO");
//                return;
//            }
//        }
//        System.out.println("YES");
//    }
}
