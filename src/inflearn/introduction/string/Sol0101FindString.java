package inflearn.introduction.string;


import java.util.Scanner;

public class Sol0101FindString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();
        char strOne =sc.nextLine().charAt(0);
        int count =0;
        for(int i=0;i<str.length();++i){
            if(str.charAt(i)==Character.toUpperCase(strOne)){
                ++count;
            }
        }
        System.out.println(count);

    }
}
