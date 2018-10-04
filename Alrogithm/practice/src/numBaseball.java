/*
예를 들어서
스트라이크 볼
        1 1	//123
        1 0	//356
        2 0	//327
        0 1	//489


        324
        328

        이렇게 해서 2가지 경우가 있을 수 있음

 해설은 이곳을 참고: http://blog.naver.com/PostView.nhn?blogId=occidere&logNo=220999810669&categoryNo=49&parentCategoryNo=0&viewDate=&currentPage=1&postListTopCurrentPage=1&from=postView

 */

import java.io.*;
import java.util.Scanner;

public class numBaseball {

    public static int n;
    public static Baseball baseball[];
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        //StringBuffer stringBuffer = new StringBuffer();
        //String line;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        //int k = sc.nextInt();
        int i;
        n = Integer.parseInt(in.readLine());
        baseball = new Baseball[n];
        
        for(i=0; i<n; i++)
            baseball[i] = new Baseball(in.readLine().split(" "));

            out.write(String.valueOf(getCandidate()));
            out.close();
            in.close();
    }

    private static int getCandidate() {
        int i, res =0;
        for(i=123;i<987;i++)
            if(isPossible(String.valueOf(i)))
                res++;
        return res;
    }

    private static boolean isPossible(String candidate){
        char c[] = candidate.toCharArray();
        if(!((c[0] != c[1] && c[1] != c[2] && c[2] != c[0]) && (c[0]>'0' && c[1]>'0' && c[2]>'0')))
            return false;
        int i, SB[];
        for(i=0; i<n;i++) {
            SB = getStrikeAndBall(baseball[i].num, c);
            if (!(baseball[i].strike == SB[0] && baseball[i].ball == SB[1]))
                return false;
        }
        return true;
    }

    private static int[] getStrikeAndBall(String num, char c[]) {
        int i, j, SB[] = {0, 0};
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 3; j++) {
                if (num.charAt(i) == c[j]) {
                    if (i == j)
                        SB[0]++;
                    else
                        SB[1]++;
                }
            }
        } return SB;
    }

    static class Baseball {
        String num;
        int strike, ball;
        public Baseball(String line[]) {
            num = line[0];
            strike = Integer.parseInt(line[1]);
            ball = Integer.parseInt(line[2]);
        }
    }
}
