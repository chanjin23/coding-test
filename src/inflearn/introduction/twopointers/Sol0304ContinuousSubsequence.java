package inflearn.introduction.twopointers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sol0304ContinuousSubsequence {
    public static void main(String[] args) throws IOException {
        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        int[] arr =new int[n];
        for(int i=0;i<n;++i){
            arr[i]=Integer.parseInt(st.nextToken());
        }
        //로직
        int left=0;
        int right=0;
        int sum=0;
        int answer=0;
        for(;right<n;++right){
            sum+=arr[right];
            while(sum >m){
                sum-=arr[left++];
            }
            if(sum==m){
                answer++;
            }
        }
        System.out.println(answer);

    }

}
