public class Programmer extends Person {
    private String companyName;

    protected Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }

    private String getCompanyName() {
        return companyName;
    }

    private void coding() {
        System.out.println(getName() + " is a senior developer , at " + getCompanyName());
    }

    @Override
    protected void walk(int steps) {
        setStep(steps);
        System.out.println(getName() + " walks " + steps + " steps a day");
    }

    @Override
    protected void eat() {
        System.out.println(getName() + " eats everything, but hates breakfasts");
    }

    @Override
    protected void learn() {
        System.out.println(getName() + " has an education in computer sciences");
    }

    @Override
    protected void all() {
        eat();
        learn();
        walk(getStep());
        coding();
    }
}
