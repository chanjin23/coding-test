package programmers.lv1;

public class NumberStringAndAlphabet {
    public static void main(String[] args) {
        String s="one4seveneight";
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for(int i=0;i<arr.length;++i){
            if(s.contains(arr[i])){
                s=s.replace(arr[i],String.valueOf(i));
            }
        }

        System.out.println(Integer.parseInt(s));
    }
}
