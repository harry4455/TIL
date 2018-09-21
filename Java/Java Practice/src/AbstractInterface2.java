interface PersonalNumberStorage2{
    void addPersonalInfo(String name, String perNum);
    String searchName(String perNum);
}

class PersonalNumInfo2{
    String name;
    String number;

    PersonalNumInfo2(String name, String number){
        this.name=name;
        this.number=number;
    }
    String getName(){return name;}
    String getNumber(){return number;}
}

class PersonalNumberStorageImpl2 implements PersonalNumberStorage2{
    PersonalNumInfo2[] perArr;
    int numOfPerInfo;

    PersonalNumberStorageImpl2(int sz){
        perArr = new PersonalNumInfo2[sz];
        numOfPerInfo=0;
    }

    @Override
    public void addPersonalInfo(String name, String perNum) {
        perArr[numOfPerInfo] = new PersonalNumInfo2(name, perNum);
        numOfPerInfo++;
    }

    @Override
    public String searchName(String perNum) {
        for(int i=0;i<numOfPerInfo; i++){
            if(perNum.compareTo(perArr[i].getNumber())==0)
                return perArr[i].getName();
        }
        return null;
    }
}

public class AbstractInterface2 {
    public static void main(String[] args) {
        PersonalNumberStorage2 storage2 = new PersonalNumberStorageImpl2(100);
        storage2.addPersonalInfo("김기동","950000-1122333");
        storage2.addPersonalInfo("장산길","970000-1122334");
        System.out.println(storage2.searchName("950000-1122333"));
        System.out.println(storage2.searchName("970000-1122334"));
    }
}
