public class Singer extends Person {
    private String bandName;

    /**
     * constructor for Singer
     * @param name
     * @param designation
     * @param bandName
     */
    protected Singer(String name, String designation, String bandName) {
        super(name, designation);
        this.bandName = bandName;
    }


    /**
     * returns the name of the band
     * @return
     */
    private String getBandName() {
        return bandName;
    }


    /**
     * prints where the person sings
     */
    private void singing() {
        System.out.println(getName() + " is a lead singer , at " + getBandName());
    }


    /**
     * overrides the method eat from person, prints what this person eats
     */
    @Override
    protected void eat() {
        System.out.println(getName() + " has a special diet, she follows that");
    }


    /**
     * overrides the method learn() from person and prints the education of the person as a singer
     */
    @Override
    protected void learn() {
        System.out.println(getName() + " has a degree from Conservatory");
    }


    /**
     * all the methods in one
     */
    @Override
    protected void all() {
        eat();
        learn();
        walk(getStep());
        singing();
    }

}
