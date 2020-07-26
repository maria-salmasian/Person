public class Programmer extends Person {
    private String companyName;

    /**
     * constructor for programmer
     * @param name
     * @param designation
     * @param companyName
     */
    protected Programmer(String name, String designation, String companyName) {
        super(name, designation);
        this.companyName = companyName;
    }


    /**
     * returns the value of companyName
     * @return
     */
    private String getCompanyName() {
        return companyName;
    }


    /**
     * prints the name of the person and where he is working as a developer
     */
    private void coding() {
        System.out.println(getName() + " is a senior developer , at " + getCompanyName());
    }


    /**
     * overrides the method eat from person, prints what this person eats
     */
    @Override
    protected void eat() {
        System.out.println(getName() + " eats everything, but hates breakfasts");
    }


    /**
     * overrides the method learn() from person and prints the education of the person as a programmer
     */
    @Override
    protected void learn() {
        System.out.println(getName() + " has an education in computer sciences");
    }


    /**
     * all the methods in one
     */
    @Override
    protected void all() {
        eat();
        learn();
        walk(getStep());
        coding();
    }
}
