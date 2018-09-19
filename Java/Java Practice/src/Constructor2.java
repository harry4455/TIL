class Number2 {
    int num;

    public Number2(int n){
        num=10;
        System.out.println("인자 전달 : " + n);
    }
    public int getNumber(){
        return num;
    }
}

public class Constructor2{
    public static void main(String[] args){
        Number2 num1 = new Number2(10);
        System.out.println("메소드 반환 값 : " + num1.getNumber());

        Number2 num2 = new Number2(20);
        System.out.println("메소드 반환 값 : " + num2.getNumber());

    }
}
