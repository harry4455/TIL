import java.util.Scanner;

public class ScanningMethods {

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("당신의 이름은?");
        String str = keyboard.nextLine();
        System.out.println("안녕하세요 "+str+'님');

        System.out.println("당신은 스파게티를 좋아한다는데, 진실입니까? ");
        boolean isTrue = keyboard.nextBoolean();
        if(isTrue==true)
            System.out.println("오! 좋아하는군요");
        else
            System.out.println("이런 아니었군요.");

        System.out.println("당신과 동생의 키는 어떻게 되나요? ");
        double num1 = keyboard.nextDouble();
        double num2 = keyboard.nextDouble();
        double diff = num1-num2;
        if(diff>0)
            System.out.println("당신이 " + diff + "만큼 크군요.");
        else
            System.out.println("당신이 " + (-diff) + "만큼 작군요.");
    }
}
