public class KFC extends Fastfood {
    private String opened;
    private double turnoverPerYear;

    public KFC(String name, String founder, int yearFoundation, String opened, double turnoverPerYear) {
        super(name, founder, yearFoundation);
        this.opened = opened;
        this.turnoverPerYear = turnoverPerYear;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear Foundation: " + getYearFoundation() +
                "\nOpened the first: " + opened +
                "\nturnover Per Year: " + turnoverPerYear + " billion $");

    }
}
