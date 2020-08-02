abstract class Person {
    private String name;
    private String designation;
    private int steps;

    /**
     * methods that will be overriden in child classes
     */
    protected abstract void eat();
    protected abstract void learn();
    protected abstract void all();


    /**
     * constructor for person
     * @param name
     * @param designation
     */
    protected Person(String name, String designation) {
        setName(name);
        setDesignation(designation);
    }


    /**
     * returning the value of steps
     * @return
     */
    protected int getStep() {
        return steps;
    }


    /**
     * for giving the steps a value
     * @param steps
     */
    protected void setStep(int steps) {
        this.steps = steps;
    }


    /**
     * returning the name of person
     * @return
     */
    protected String getName() {
        return name;
    }


    /**
     * returning the value of designation
     * @return
     */
    private String getDesignation() {
        return designation;
    }


    /**
     * giving name a value
     * @param name
     */
    private void setName(String name) {
        this.name = name;
    }


    /**
     * giving designation a value
     * @param designation
     */
    private void setDesignation(String designation) {
        this.designation = designation;
    }


    /**
     * prints how many steps a person walks daily
     * @param steps
     */
    protected void walk(int steps){
        setStep(steps);
        System.out.println(getName() + " walks " + steps + " steps a day");
    }
}
