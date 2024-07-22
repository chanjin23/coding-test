package programmers.lv2;

import java.util.*;
public class RemoveInPairs {
    public static void main(String[] args) {
        String s = "baabaa";
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();++i){
            char c=s.charAt(i);
            if(stack.isEmpty()) stack.push(c);
            else{
                if(stack.peek()==c){
                    stack.pop();
                }else{
                    stack.push(c);
                }
            }
        }
        if(stack.isEmpty()) System.out.println("1");
        else System.out.println("0");
    }
}
