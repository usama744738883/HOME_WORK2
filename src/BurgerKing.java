public class BurgerKing extends Fastfood {
    private int number0fWorkers;
    private int establishments;

    public BurgerKing(String name, String founder, int yearFoundation, int number0fWorkers, int establishments) {
        super(name, founder, yearFoundation);
        this.number0fWorkers = number0fWorkers;
        this.establishments = establishments;
    }

    @Override
    public void print() {
        System.out.println("Company name: " + getName() +
                "\nFounder: " + getFounder() +
                "\nYear Foundation: " + getYearFoundation() +
                "\n number of workers: " + number0fWorkers +
                "\n establishments: " + establishments);

    }
}
