public class
Person {
    public String name;
    public String surname;
    public String email;
    public int age;
    public int salary;
    private final String emailRegex = "^(.+)@(.+)$";

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEmail(String email) {
        if (email.matches(emailRegex)) {
            this.email = email;
        }
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public int getSalary() {
        return salary;
    }

    public String getEmail() {
        return email;
    }
}
