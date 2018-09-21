class A{
    public int num= 2;
}

class B extends A{
    public int num = 5;
    public void showSuperNum(){
        System.out.println("A's num : " + super.num);
    }
}

class C extends B{
    public int num = 7;
    public void showAllNums(){
        showSuperNum();
        System.out.println("B's num : " + super.num);
        System.out.println("C's num : " + num);
    }
}

public class ShowAllReDecl {
    public static void main(String[] args) {
        C ref = new C();
        ref.showAllNums();
    }
}
