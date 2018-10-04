import java.util.StringTokenizer;

public class StringTokenProg {
    public static void main(String[] args) {
        StringTokenizer str = new StringTokenizer("2018/10/04", "/");
        int count;

        count = str.countTokens();
        System.out.println("파싱할 문자열의 수는 총" + count + "개");

        while(str.hasMoreTokens()){
            System.out.println(str.nextToken());
        }
    }
}
