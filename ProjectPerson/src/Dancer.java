public class Dancer extends Person {
    private String groupName;
    private String danceType;


    /**
     * constructor for dancer
     * @param name
     * @param designation
     * @param groupName
     */
    protected Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }


    /**
     * returns the value of the groupName
     * @return
     */
    private String getGroupName() {
        return groupName;
    }


    /**
     * returns the name of the dance the dancer does
     * @return
     */
    private String getDanceType() {
        return danceType;
    }


    /**
     * sets a value for what kind of dance the dancer does
     * @param danceType
     */
    protected void setDanceType(String danceType) {
        this.danceType = danceType;
    }


    /**
     * prints what and where the dancer dances
     * @param danceType
     */
    private void dancing(String danceType) {
        System.out.println(getName() + " is a professional " + danceType + " dancer, at " + getGroupName());
    }


    /**
     * overrides the method learn() from person and prints the education of the person as a dancer
     */
    @Override
    protected void learn() {
        System.out.println(getName() + " has a dancing education");
    }


    /**
     * overrides the method eat from person, prints what this person eats
     */
    @Override
    protected void eat() {
        System.out.println(getName() + " is a vegetarian.");
    }


    /**
     * all the methods in one
     */
    @Override
    protected void all() {
        eat();
        learn();
        walk(getStep());
        dancing(getDanceType());
    }
}
