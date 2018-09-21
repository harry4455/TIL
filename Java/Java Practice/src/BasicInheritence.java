class Man{
    private String name;
    public Man(String name){
        this.name = name;
    }
    public void tellYouName(){
        System.out.println("My name is " + name);
    }
}

class BusinessMan extends Man{
    private String company;
    private String position;

    public BusinessMan(String name, String company, String position) {
        super(name);
        this.company = company;
        this.position = position;
    }

    public void tellYourInfo(){
        System.out.println("My company is " + company);
        System.out.println("My position is " + position);
        tellYouName();
    }
}
public class BasicInheritence {
    public static void main(String[] args) {
        BusinessMan man1 = new BusinessMan("Mr. Hong", "Apple", "Staff");
        BusinessMan man2 = new BusinessMan("Mr. Park", "Apple", "CEO");

        System.out.println("First man info ..........");
        man1.tellYouName();
        man1.tellYourInfo();
        System.out.println("Second man info ..........");
       // man2.tellYouName();
        man2.tellYourInfo();
    }
}
