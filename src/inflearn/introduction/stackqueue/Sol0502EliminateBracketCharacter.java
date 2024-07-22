package inflearn.introduction.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Sol0502EliminateBracketCharacter {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine();
        StringBuilder sb=new StringBuilder();
        Stack<Character> stack=new Stack<>();
        for(char ch: str.toCharArray()){
            if(ch=='(') stack.push(ch);

            if(stack.isEmpty()){
                sb.append(ch);
            }

            if(ch==')') stack.pop();
        }
        System.out.println(sb);
    }
}
