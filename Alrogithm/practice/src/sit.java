import java.text.DecimalFormat;
import java.util.Scanner;

public class sit {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        solve(a,b);
    }

    private static void solve(int a, int b) {
        DecimalFormat df = new DecimalFormat("0.000");
        int cnt = 0;
        int target = (a+b)%10;

        if(a == b){
         cnt = 153 - (10-a);
            System.out.println(df.format(cnt/(153*1.0)));
        }

        else{
            for(int i=1; i<=10; i++){
                for(int j=i+1; j<=10; j++) { // j=i+1로써 i와 j가 다름을 표현
                    int sum = i+j;
                    if(sum % 10 < target){
                        if(i == a || j == a || i == b || j == b){
                            cnt += 2;
                        }else{
                            cnt += 4;
                        }
                    }
                }
            }
            System.out.println(df.format(cnt / (153 *1.0)));
        }
    }
}
