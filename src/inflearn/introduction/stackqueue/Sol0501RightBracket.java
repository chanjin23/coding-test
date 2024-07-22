package inflearn.introduction.stackqueue;

import java.util.Scanner;
import java.util.Stack;

public class Sol0501RightBracket {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<str.length();++i){
            char ch=str.charAt(i);
            if(ch=='(') stack.push(ch);
            else if(ch==')') {
//                if(stack.isEmpty()){
//                    System.out.println("NO");
//                    return;
//                }
                try{
                    stack.pop();
                }catch(Exception e){
                    System.out.println("NO");
                    return;

                }
            }
        }
        if(stack.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
