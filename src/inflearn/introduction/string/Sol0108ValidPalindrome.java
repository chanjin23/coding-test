package inflearn.introduction.string;

import java.util.Scanner;

public class Sol0108ValidPalindrome {
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String str =sc.nextLine().toLowerCase();
//        int left=0;
//        int right=str.length()-1;
//        char[] ch=str.toCharArray();
//        while(left<right){
//            //왼쪽이 알파벳이아닐경우
//            if(!Character.isAlphabetic(ch[left])){
//                left++;
//            } else if (!Character.isAlphabetic(ch[right])) {     //오른쪽이 알파벳이 아닐경우
//                right--;
//            }else{  //둘다 알파벳일 경우
//                if(ch[left]!=ch[right]){
//                    System.out.println("NO");
//                    return;
//                }
//                right--;
//                left++;
//            }
//        }
//        System.out.println("YES");
//    }
    //replaceAll 정규식이용하기
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine().toUpperCase();
        str=str.replaceAll("[^A-Z]","");  //^는 부정의 의미, A~Z가 아닌것은 모두 빈문자열로 바꿔라라는 뜻
        String tmp=new StringBuilder(str).reverse().toString();
        if(str.equals(tmp)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
