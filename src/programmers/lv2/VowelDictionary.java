package programmers.lv2;

import java.util.*;
public class VowelDictionary {
    public static void main(String[] args) {
        VowelDictionary T = new VowelDictionary();
        String word = "AAAAE";
        System.out.println(T.solution(word));
    }

//    public int solution(String word) {
//        ArrayList<String> dictionary=new ArrayList<>();
//        String[] str={"A","E","I","O","U"};
//        for(int i=0;i<5;++i){
//            dictionary.add(str[i]);
//            for(int j=0;j<5;++j){
//                dictionary.add(str[i]+str[j]);
//                for(int k=0;k<5;++k){
//                    dictionary.add(str[i]+str[j]+str[k]);
//                    for(int l=0;l<5;++l){
//                        dictionary.add(str[i]+str[j]+str[k]+str[l]);
//                        for(int m=0;m<5;++m){
//                            dictionary.add(str[i]+str[j]+str[k]+str[l]+str[m]);
//                        }
//                    }
//                }
//            }
//        }
//        Collections.sort(dictionary);
//        for(int i=0;i<dictionary.size();++i){
//            if(word.equals(dictionary.get(i))){
//                return i+1;
//            }
//        }
//        return 1;
//    }

    ArrayList<String> list;
    String[] alphabet={"A","E","I","O","U"};
    public int solution(String word) {
        list=new ArrayList<>();
        dfs("",0);
        for(int i=0;i<list.size();++i){
            if(list.get(i).equals(word)) return i;
        }
        return 0;
    }
    public void dfs(String str,int len){
        list.add(str);
        if(len>=5) {
        }
        else{
            for(int i=0;i<5;++i){
                dfs(str+alphabet[i],len+1);
            }
        }
    }
}
