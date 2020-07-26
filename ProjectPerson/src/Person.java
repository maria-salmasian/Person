abstract class Person {
    private String name;
    private String designation;
    private int steps;

    protected abstract void walk(int steps);
    protected abstract void eat();
    protected abstract void learn();
    protected abstract void all();

    protected Person(String name, String designation) {
        setName(name);
        setDesignation(designation);
    }

    protected int getStep() {
        return steps;
    }

    protected void setStep(int steps) {
        this.steps = steps;
    }


    protected String getName() {
        return name;
    }

    private String getDesignation() {
        return designation;
    }

    private void setName(String name) {
        this.name = name;
    }

    private void setDesignation(String designation) {
        this.designation = designation;
    }
}
