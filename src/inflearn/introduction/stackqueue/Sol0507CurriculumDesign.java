package inflearn.introduction.stackqueue;

import java.util.*;
public class Sol0507CurriculumDesign {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str1=sc.nextLine();
        String str2=sc.nextLine();
        Queue<Character> queue=new LinkedList<>();
        for(int i=0;i<str1.length();++i){
            queue.offer(str1.charAt(i));
        }
        for(char ch:str2.toCharArray()){
            if(queue.contains(ch)){
                if(queue.peek()==ch) queue.poll();
                else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        if(queue.isEmpty()) System.out.println("YES");
        else System.out.println("NO");
    }
}
