// 아직 안풀림

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CandyGame {

    static int ans;
    static char[][] map;
    static int input;
    
    private void solve(){
        input = sc.nextInt();
        map = new char[input][input];
        
        for(int i=0; i<input; i++){
            map[i] = sc.readLine().toCharArray();
        }

        for(int i=0; i<input; i++){
            for(int j=0; j<input; j++){
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

    private void check() {
        for (int i=0;i<input;i++){
            int cnt = 1;
            for(int j=0;j<input;j++){
                if(map[i][j] == map[i][j-1]){
                    ++cnt;
                }else{
                    ans = max(ans,cnt);
                    cnt = 1;
                }
            }
            ans = max(ans,cnt);
        }

        for(int i=0; i<input; i++){
            int cnt=1;
            for(int j=0;j<input;j++){
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

    public int max(int x, int y) {
        return x > y ? x: y;
    }

    public static void main(String[] args) {

        sc.init();

        new CandyGame().solve();

        /*Scanner scanner = new Scanner(System.in);
        Scanner reader = new Scanner(System.in);
        int input = scanner.nextInt();

        if(input <3 || input>50){
            return;
        }

        System.out.println("input number : " + input);

        char[][] arr = new char[input][input];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){

            }
        }*/
    }

    static class sc{
        private static BufferedReader br;
        private static StringTokenizer st;

        static void init(){
            br = new BufferedReader(new InputStreamReader(System.in));
            st = new StringTokenizer("");
        }

        static String readLine(){
            try{
                return br.readLine();
            }catch (IOException e){
            }
            return null;
        }

        static String readLineReplace(){
            try {
                return br.readLine().replaceAll("\\s+","");
            }catch (IOException e){

            }
            return null;
        }

        static boolean hasNext(){
            return st.hasMoreTokens();
        }

        static String next(){
            while(!st.hasMoreTokens()){
                try{
                    st = new StringTokenizer(br.readLine());
                } catch (IOException e) {
                }
            }
            return st.nextToken();
        }

        static long nextLong(){
            return Long.parseLong(next());
        }

        static int nextInt(){
            return Integer.parseInt(next());
        }

        static double nextDouble(){
            return Double.parseDouble(next());
        }
    }
}
