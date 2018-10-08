/*아직 안풀림
해설 참고 : http://dbdobi.tistory.com/2*/

import java.util.Scanner;

public class Eureka_Theory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k,l,m,n = 0;

        k = sc.nextInt();
        l = sc.nextInt();
        m = sc.nextInt();
        n = sc.nextInt();

        solve(k);
        solve(l);
        solve(m);
        solve(n);
    }
    private static void solve(int num) {
        boolean flag = false;
        for(int a=0; a < num; a++){
            int[] aArray = new int[50];

            for(int b=1; b<50; b++){
                int bData = (b*(b+1))/2;
                aArray[b-1] = bData;
            }

            for(int i=1; i<49; i++){
                for(int j=1; j<49; j++){
                    for(int k=1; k<49; k++){
                        if((aArray[i] + aArray[j] + aArray[k]) == num){
                                flag = true;
                        }
                    }
                }
            }
        }
        if(flag)
            System.out.println("\n1");
        else
            System.out.println("\n0");
    }
}
