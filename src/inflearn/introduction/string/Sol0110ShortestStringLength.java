package inflearn.introduction.string;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class Sol0110ShortestStringLength {
    //내풀이
//    public static void main(String[] args) {
//        Scanner sc =new Scanner(System.in);
//        String str =sc.next();
//        char one = sc.next().charAt(0);
//        char[] ch=str.toCharArray();
//        int[] count=new int[100];
//        int tmp=0;
//        for(int i=0;i<str.length();++i){
//            if(ch[i]==one){
//                count[tmp]=i;   //인덱스번호 저장
//                tmp++;
//            }
//        }
//        int[] output =new int[str.length()];
//        Arrays.fill(output, Integer.MAX_VALUE);
//        for(int i=0;i<tmp;++i){
//            for(int j=0;j<str.length();++j){
//                int num=Math.abs(count[i]-j);
//                if(num <output[j]){
//                    output[j]=num;
//                }
//            }
//        }
//        for(int i=0;i<output.length;++i){
//            System.out.print(output[i]+" ");
//        }
//    }
    //다른풀이
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str =sc.next();
        char point =sc.next().charAt(0);
        char[] ch=str.toCharArray();
        int min=100000;
        int[] output = new int[str.length()];
        //왼쪽에서 오른쪽방향으로 카운트
        for(int i=0;i<str.length();++i){
            if(ch[i]==point){
                min=0;
                output[i]=min;
            }else{
                min++;
                output[i]=min;
            }
        }

        //오른쪽에서 왼쪽으로 카운트
        for(int i=str.length()-1;i>=0;--i){
            if(ch[i]==point){
                min=0;
            }else{
                min++;
                output[i]=Math.min(output[i],min);  //작은 값을 반환
            }
        }
        System.out.println(Arrays.toString(output));
    }
}
