package programmers.lv1;

import java.util.Arrays;

public class SecretMap {
    public static void main(String[] args) {
        int n=5;
        int[] arr1 = {9, 20, 28, 18, 11};
        int[] arr2 = {30, 1, 21, 17, 28};
        String[] answer = new String[n];
        String[] arrStr1=new String[n];
        String[] arrStr2=new String[n];

        for(int i=0;i<n;++i){
            arrStr1[i]=Integer.toBinaryString(arr1[i]);
            arrStr2[i]=Integer.toBinaryString(arr2[i]);

            arrStr1[i]=validation(arrStr1[i],n);
            arrStr2[i]=validation(arrStr2[i],n);


            for(int j=0;j<n;++j){
                if(arrStr1[i].charAt(j)=='0'&&arrStr2[i].charAt(j)=='0') answer[i]+=" ";
                else answer[i]+="#";
            }
        }
        System.out.println(Arrays.toString(answer));
    }
    public static String validation(String s,int n){
        if(s.length()!=n){
            String zero="";
            for(int i=0;i<n-s.length();++i){
                zero+="0";
            }
            s=zero+s;
        }
        return s;
    }

}
