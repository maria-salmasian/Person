public class Singer extends Person {
    private String bandName;

    protected Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }

    private String getBandName() {
        return bandName;
    }

    private void singing() {
        System.out.println(getName() + " is a lead singer , at " + getBandName());
    }

    @Override
    protected void walk(int steps) {
        setStep(steps);
        System.out.println(getName() + " walks " + steps + " steps a day");
    }

    @Override
    protected void eat() {
        System.out.println(getName() + " has a special diet, she follows that");
    }

    @Override
    protected void learn() {
        System.out.println(getName() + " has a degree from Conservatory");
    }

    @Override
    protected void all() {
        eat();
        learn();
        walk(getStep());
        singing();
    }

}
