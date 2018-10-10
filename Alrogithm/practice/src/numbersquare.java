// 참고 : https://github.com/bactoria/BOJ/blob/master/_1051.java
// continue 제대로 모르고 이해못함 빡대가리야

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class numbersquare {
    private static char[][] map;
    private  static int maxLen;
    private static int n,m;

    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine(), " ");
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new char[n][m];
        maxLen = 1;

        for(int i=0; i<n; i++)
            map[i] = br.readLine().toCharArray();
        for(int i=0; i<n; i++) {
            for (int j = 0; j < m; j++) {
                findResult(i, j, map[i][j]);
            }
        }

        System.out.println(maxLen * maxLen);

    }

    private static void findResult(int i, int j, char value) {
        int change =0;

        while(true){
            change++;
            System.out.println("result 1 : " + change);
            int newI = i+change;
            int newJ = j+change;

            if(!inRange(newI,newJ)) break;
            if(value != map[newI][newJ]) continue;
            if(value != map[i][newJ]) continue;
            if(value != map[newI][j]) continue;

            maxLen = Math.max(maxLen, change +1);
            System.out.println("result 2 : " + change);
        }
    }

    private static boolean inRange(int i, int j) {
        return i>=0 && j>=0 && i<n && j<m;
    }
}
