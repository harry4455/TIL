import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class SevenDwarfs {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<Integer> input = new ArrayList<Integer>();
        for(int i=0; i<9; i++){
            input.add(scanner.nextInt());
        }

        //난쟁년들 키 정렬
        Collections.sort(input);

        int resulti = -1;
        int resultj = -1;
        int sum = 0;

        //제외될 첫 난쟁년
        for(int i=0; i<9; i++){
            //제외될 둘째 난쟁년
            for(int j=0; j<9;j++){
                if(i==j)
                    continue;
                // 선태된 두 난쟁년들 제외하고 나머지 난쟁년들 키 다 더하기
                for(int k=0;k<9;k++){
                    if(k==i || k==j){
                        continue;
                    }else {
                        sum = sum + input.get(k);
                    }
                }
                // 난쟁년들 키 합이 100이면 성공
                if(sum==100){
                    resulti = i;
                    resultj = j;
                    break;
                }
                else{
                    sum = 0;
                }
            }

            if(resulti >= 0){
                break;
            }
        }
        //선택된 난쟁년들 출력
        if(sum ==100){
            for(int i = 0; i<9;i++) {
                if (i != resulti && i != resultj) {
                    System.out.println(input.get(i));
                }
            }
        }
        else
            System.out.println("BULLSHIT!");

    }
}
