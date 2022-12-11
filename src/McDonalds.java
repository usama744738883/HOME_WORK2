public class McDonalds extends Fastfood {
    private int pointsAroundTheWorld;
    private double turnoverPerYear;

    public McDonalds(String name, String founder, int yearFoundation, int pointsAroundTheWorld, double turnoverPerYear) {
        super(name, founder, yearFoundation);
        this.pointsAroundTheWorld = pointsAroundTheWorld;
        this.turnoverPerYear = turnoverPerYear;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear foundation: " + getYearFoundation() +
                "\nPoints Around The World: " + pointsAroundTheWorld +
                "\nTurnover Per Year: " + turnoverPerYear + " billion $");


    }
}
