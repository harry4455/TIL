import java.util.Scanner;

public class SplitSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        int result=0;

        for(int i=input;i>0;i--){
            int sum=0;
            String inputstream = String.valueOf(i);

            for (int j=0; j<inputstream.length();j++){
                sum += inputstream.charAt(j)-48;
            }
            if(i+sum==input){
                result=i;
            }
        }
        if(result==0){
            System.out.println(0);
        }else
            System.out.println(result);
    }
}

