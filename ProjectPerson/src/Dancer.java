public class Dancer extends Person {
    private String groupName;
    private String danceType;

    protected Dancer(String name, String designation, String groupName) {
        super(name, designation);
        this.groupName = groupName;
    }

    private String getGroupName() {
        return groupName;
    }

    private String getDanceType() {
        return danceType;
    }

    protected void setDanceType(String danceType) {
        this.danceType = danceType;
    }
    private void dancing(String danceType) {
        System.out.println(getName() + " is a professional " + danceType + " dancer, at " + getGroupName());
    }

    @Override
    protected void walk(int steps) {
        setStep(steps);
        System.out.println(getName() + " walks " + steps + " steps a day");
    }

    @Override
    protected void learn() {
        System.out.println(getName() + " has a dancing education");
    }

    @Override
    protected void eat() {
        System.out.println(getName() + " is a vegetarian.");
    }

    @Override
    protected void all() {
        eat();
        learn();
        walk(getStep());
        dancing(getDanceType());
    }
}
