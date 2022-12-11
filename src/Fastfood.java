public abstract class Fastfood implements Printable{
    private String name;
    private String founder;
    private int yearFoundation;

    public Fastfood(String name, String founder, int yearFoundation) {
        this.name = name;
        this.founder = founder;
        this.yearFoundation = yearFoundation;
    }

    public String getName() {
        return name;
    }

    public String getFounder() {
        return founder;
    }

    public int getYearFoundation() {
        return yearFoundation;
    }
}
