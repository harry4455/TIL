interface Readable3{
    public void read();
}

class OuterClass4{
    private String myName;

    OuterClass4(String name){
        myName = name;
    }

    public Readable3 createLocalClassInst(final int instID){
        return new Readable3(){
            public void read(){
                System.out.println("Outer inst name : " + myName);
                System.out.println("Local inst ID : " + instID);
            }
        };
    }
}

public class LocalParamAnonymous {
    public static void main(String[] args) {
        OuterClass4 out = new OuterClass4("My Outer Class");
        Readable3 localInst1 = out.createLocalClassInst(111);
        localInst1.read();
        Readable3 localInst2 = out.createLocalClassInst(222);
        localInst2.read();
    }
}
