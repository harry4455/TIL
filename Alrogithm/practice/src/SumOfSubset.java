// 출처 : http://stack07142.tistory.com/153

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class SumOfSubset {
    static int n,s;
    static int cnt;
    static int [] arr = new int[21];
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        solve(0,0);

        if(s==0){
           cnt -=1; // 공집합 제외를 위해 카운트 하나를 뺌
        }
        System.out.println(cnt);
/*   모든 경우의 수를 비트로 나누어 연산한 경우

출처: http://zoonvivor.tistory.com/11

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        s = sc.nextInt();
        arr = new int[n];
        int result = 0;
        int sum = 0;
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();

        // i는 0000~1111 의 범위
        for(int i=1;i<1<<n;i++){
            int bit =i;
            for(int j=0; bit !=0; j++, bit >>=1){

            }
        }
*/
    }

    private static void solve(int sum, int step) {
        if (step == n){
            if(sum == s) cnt++;
            return;
        }

        solve(sum+arr[step], step+1);
        solve(sum, step+1);
    }
}
