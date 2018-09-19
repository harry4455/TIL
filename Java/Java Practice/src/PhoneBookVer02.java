import java.util.Scanner;

class PhoneInfo2{
    String name;
    String phoneNumber;
    String birth;

    public PhoneInfo2(String name, String num, String birth){
        this.name = name;
        phoneNumber = num;
        this.birth = birth;
    }

    public PhoneInfo2(String name, String num){
        this.name = name;
        phoneNumber = num;
        this.birth = null;
    }

    public void showPhoneInfo(){
        System.out.println("name : " + name);
        System.out.println("phone : " + phoneNumber);
        if(birth != null){
            System.out.println("birth : " + birth);
            System.out.println(" ");
        }
    }
}

public class PhoneBookVer02 {

    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        while(true){
            showMenu();
            choice = keyboard.nextInt();
            keyboard.nextLine();

            switch (choice){
                case 1:
                    readData();
                    break;
                case 2:
                    System.out.println("프로그램을 종료합니다.");
                    return;
            }
        }
    }

    public static void showMenu() {
        System.out.println("선택하세요...");
        System.out.println("1. 데이터입력");
        System.out.println("2. 프로그램 종료");
        System.out.println("선택 : ");
    }

    public static void readData() {
        System.out.println("이름 : ");
        String name = keyboard.nextLine();
        System.out.println("전화번호 : ");
        String phone = keyboard.nextLine();
        System.out.println("생일 : ");
        String birth = keyboard.nextLine();

        PhoneInfo2 info = new PhoneInfo2(name,phone,birth);
        System.out.println("\n입력된 정보 출력...");
        info.showPhoneInfo();
    }
}

