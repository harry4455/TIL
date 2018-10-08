// 해설 참고: https://whereisusb.tistory.com/158

import java.util.Scanner;

public class RecolorChessBoard {
    static int n,m;
    static int [][] arr;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        arr = new int[n][m];
        for(int i=0;i<n;i++){
            String t = sc.next();
            for(int j=0; j<m; j++){
                arr[i][j] = t.charAt(j);
            }
        }
        // 8*8 살펴보기
        // 8*8 로 단위 설정하여 자리 번갈아가며 모든 경우 테스트 가능해짐
        int result = Integer.MAX_VALUE;
        for(int i=0; i<=n-8; i++){
            for(int j=0; j<=m-8; j++){
                result = Math.min(result,solve(i,j));
            }
        }
        System.out.println(result);
    }

    private static int solve(int x, int y) {
        // 1. 시작이 검은색
        int result = 0;
        int temp = 'B';
        for (int i = x; i < x + 8; i++) {
            if (arr[i][y] != temp) result++;
            for (int j = y + 1; j < y + 8; j++) {
                if (arr[i][j] == temp) {
                    result++;
                    // 중복 카운트를 막기 위해 잘못된 자리 표는 바꿔준다.
                    if (temp == 'B') temp = 'W';
                    else temp = 'B';
                } else temp = arr[i][j];
            }
        }

        // 2. 시작이 흰색
        int result2 = 0;
        temp = 'W';
        for(int i=x;i<x+8;i++){
            if(arr[i][y]!=temp) result2++;
            for(int j=y+1;j<y+8; j++){
                if(arr[i][j]==temp){
                    result2++;
                    if(temp=='B') temp = 'W';
                    else temp = 'B';
                }else temp = arr[i][j];
            }
        }

        return result>result2?result2:result;
    }
}
