package programmers.lv2;

import java.util.Stack;

public class CorrectParentheses  {
    public static void main(String[] args) {
        String s = "()()";
        Stack<Character> stack =new Stack<>();
        for(int i=0;i<s.length();++i){
            if(s.charAt(i)=='('){
                stack.push('(');
            }else if(s.charAt(i)==')'){
                if(stack.isEmpty()){
                    System.out.println(false);
                    System.exit(0);
                }
                stack.pop();
            }
        }
        if(stack.isEmpty()){
            System.out.println(false);
            System.exit(0);
        }
        System.out.println(false);
        System.exit(0);
    }
}
