package programmers.lv2;

public class NLeastCommonMultiple {
    public static void main(String[] args) {
        NLeastCommonMultiple T = new NLeastCommonMultiple();
        int[] arr = {2, 6, 8, 14};
        System.out.println(T.solution(arr));
    }

    public int solution(int[] arr) {
        //유클리드 호제법을 이요해서 최대공약수를 구한다.
        //1. 최대공약수를 구한다.
        //2. 최소공배수를 구한다.
        if(arr.length==1) return arr[0];
        int max = gcd(arr[0],arr[1]);
        int answer=arr[0]*arr[1]/max;
        if(arr.length>2){
            for(int i=2;i<arr.length;++i){
                int tmp=gcd(answer,arr[i]);
                answer=answer*arr[i]/tmp;
            }
        }
        return answer;
    }
    public int gcd(int a,int b){
        int remain=a%b;
        if(remain==0) return b;
        else return gcd(b,remain);
    }
}
