package inflearn.introduction.stackqueue;

import java.util.*;
public class Sol0505IronBar {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        int answer=0;
        for(int i=0;i<str.length();++i) {
            char ch=str.charAt(i);
            if(ch=='(') stack.push(ch);
            else if(ch==')'){
                if('('==str.charAt(i-1)){
                    stack.pop();
                    answer+=stack.size();
                }else if(')'==str.charAt(i-1)){
                    stack.pop();
                    answer+=1;
                }
            }
        }
        System.out.println(answer);
    }
}
