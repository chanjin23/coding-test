package programmers.lv1;

import java.util.*;
public class SortStringsWish {
    public static void main(String[] args) {
        String[] strings ={"abce","abcd","cdx"};
        int n=1;

        Word[] arr =new Word[strings.length];
        for(int i=0;i<strings.length;++i){
            arr[i]=new Word(strings[i].charAt(n),strings[i]);
        }

        Arrays.sort(arr);
        String[] answer=new String[strings.length];
        for(int i=0;i<strings.length;++i){
            answer[i]=arr[i].s;
            System.out.print(answer[i]+" ");
        }


    }
    public static class Word implements Comparable<Word>{
        char c;
        String s;

        public Word(char c,String s){
            this.c= c;
            this.s =s;
        }

        public int compareTo(Word o){
            if (c==o.c) return s.compareTo(o.s);
            return this.c-o.c;
        }
    }
}
