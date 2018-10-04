// 아직 안풀림

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CandyGame1 {

    static int ans;
    static int n;
    static char[][] map;

    public static void main(String[] args){
        solve();
    }

    private static void solve(){
        Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        map = new char[n][n];
        n = sc.nextInt();

        if(n <3 || n>50) {
            return;
        }

        for (int i = 0; i< n ; i++){
            try {
                map[i] = br.readLine().toCharArray();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        for(int i=0; i<n;i++){
            for(int j=0;j<n;j++){
                char temp = map[i][j];
                map[i][j] = map[i][j+1];
                map[i][j+1] = temp;
                check();
                temp = map[i][j+1];
                map[i][j+1] = map[i][j];
                map[i][j] = temp;

                temp = map[j][i];
                map[j][i] = map[j+1][i];
                map[j+1][i] = temp;
                check();
                temp = map[j+1][i];
                map[j+1][i] = map[j][i];
                map[j][i]=temp;
            }
        }
        System.out.println(ans);
    }

    private static void check() {
        for (int i=0;i<n;i++){
            int cnt = 1;
            for(int j=0;j<n;j++){
                if(map[i][j] == map[i][j-1]){
                    ++cnt;
                }else{
                    ans = max(ans,cnt);
                    cnt = 1;
                }
            }
            ans = max(ans,cnt);
        }

        for(int i=0; i<n; i++){
            int cnt=1;
            for(int j=0;j<n;j++){
                if(map[j][i] == map[j-1][i]){
                    ++cnt;
                }else {
                    ans = max(ans,cnt);
                    cnt = 1;
                }
            }
            ans = max(ans,cnt);
        }
    }

    private static int max(int x, int y) {
        return x > y ? x: y;
    }
}
