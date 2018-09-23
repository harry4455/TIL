import java.util.Scanner;

class AgeInputException3 extends Exception{
    public AgeInputException3(){
        super("유효하지 않은 나이가 입력되었습니다.");
    }
}

class NameLengthException extends Exception{
    String wrongName;
    public NameLengthException(String name){
        super("잘못된 이름이 삽입되었습니다.");
        wrongName=name;
    }
    public void showWrongName(){
        System.out.println("잘못 입력된 이름 : " + wrongName);
    }
}

class PersonalInfo{
    String name;
    int age;
    
    public PersonalInfo(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void showPersonalInfo(){
        System.out.println("이름 : " + name);
        System.out.println("나이 : " + age);
    }
}
public class printStackTrace {
    public static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        try{
            PersonalInfo readInfo = readPersonalInfo();
            readInfo.showPersonalInfo();
        }
        catch (AgeInputException3 e){
            e.printStackTrace();
        }
        catch (NameLengthException e){
            e.showWrongName();
            e.printStackTrace();
        }
    }
    public static PersonalInfo readPersonalInfo() throws AgeInputException3, NameLengthException{
        String name = readName();
        int age = readAge();
        PersonalInfo pInfo = new PersonalInfo(name, age);
        return pInfo;
    }

    public static int readAge() throws AgeInputException3 {
        System.out.println("나이 입력 : ");
        int age = keyboard.nextInt();
        if(age<0)
            throw new AgeInputException3();
        return age;
    }

    public static String readName() throws NameLengthException {
        System.out.println("이름 입력 : ");
        String name = keyboard.nextLine();
        if(name.length()<2)
            throw new NameLengthException(name);
        return name;
    }

}
