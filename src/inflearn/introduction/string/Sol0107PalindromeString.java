package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0107PalindromeString {

//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String input =sc.nextLine().toUpperCase();
//        boolean flag =true;
//        for(int i=0;i<input.length()/2;++i){
//            if(input.charAt(i)!=input.charAt(input.length()-1-i)){
//                flag=false;
//            }
//        }
//        if(flag){
//            System.out.println("YES");
//        }else{
//            System.out.println("NO");
//        }
//
//    }
    //
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String input =sc.nextLine().toUpperCase();
//        char[] ch=input.toCharArray();
//        int left=0;
//        int right =input.length()-1;
//        while(left<right){
//            if(ch[left]!= ch[right]){
//                System.out.println("NO");
//                return;
//            }
//            left++;
//            right--;
//        }
//        System.out.println("YES");
//    }

    //StringBuilder를 이용하는 방법
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.nextLine().toUpperCase();
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}
