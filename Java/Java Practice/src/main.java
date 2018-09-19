class Fruitseller{
    int numOfApple;
    int myMoney;
    int APPLE_PRICE;

    public Fruitseller(int money, int appleNum, int price){
        myMoney = money;
        numOfApple = appleNum;
        APPLE_PRICE = price;
    }

    public int saleApple(int money){
        int num = money/APPLE_PRICE;
        numOfApple-=num;
        myMoney+=money;
        return num;
    }
    public void showSaleResult(){
        System.out.println("Left Apples : " + numOfApple);
        System.out.println("Sales Profit : " + myMoney);
    }
}

class FruitBuyer{
    int myMoney;
    int numOfApple;

    public FruitBuyer(int money){
        myMoney = money;
        numOfApple = 0;
    }

    public void buyApple(Fruitseller fruitseller, int money){
        numOfApple += fruitseller.saleApple(money);
        myMoney -= money;
    }
    public void showBuyResult(){
        System.out.println("Money Left : " + myMoney);
        System.out.println("Number of Apples : " + numOfApple);
    }
}

class FruitSalesMain2{
    public static void main(String[] args){
        Fruitseller fruitseller1 = new Fruitseller(0,30,1500);
        Fruitseller fruitseller2 = new Fruitseller(0,20,1000);

        FruitBuyer buyer = new FruitBuyer(10000);
        buyer.buyApple(fruitseller1,4500);
        buyer.buyApple(fruitseller2,2000);

        System.out.println("Presence of Seller 1 : ");
        fruitseller1.showSaleResult();

        System.out.println("Presence of Seller 2 : ");
        fruitseller2.showSaleResult();

        System.out.println("Presence of buyer : ");
        buyer.showBuyResult();
    }
}