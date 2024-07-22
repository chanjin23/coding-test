package inflearn.introduction.stackqueue;

import java.util.*;
public class Sol0504Postfix {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Stack<Double> stack=new Stack<>();
        for(int i=0;i<str.length();++i){
            char ch=str.charAt(i);
            if(Character.isDigit(ch)) stack.push((double)(ch-'0'));
            else{
                double right=stack.pop();
                double left=stack.pop();
                if(ch=='+') stack.push(left + right);
                else if(ch=='-') stack.push(left - right);
                else if(ch=='*') stack.push(left * right);
                else if(ch=='/') stack.push(left / right);
            }
        }
        System.out.println(Math.round(stack.get(0)));
    }
}
