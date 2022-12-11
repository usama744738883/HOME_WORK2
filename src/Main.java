public class Main {
    public static void main(String[] args) {
        createObject("McDonalds");
        createObject("KFC");
        createObject("BURGER KING");


    }
    private  static Fastfood createObject (String TitleName){
        switch (TitleName){
            case "McDonalds":
                McDonalds mcDonalds = new McDonalds("McDonalds","Ray Rock",1955,37855,19.2);
                mcDonalds.print();
                break;
            case "KFC":
                KFC kfc= new KFC("KFC","Pete Harman",1952,"Kentucky",38.0);
                kfc.print();
                break;
            case "BURGER KING":
                BurgerKing burgerKing= new BurgerKing("Burger King","James McLamore",1954,34248,655);
                burgerKing.print();
                break;
        }
        return null;
    }
}