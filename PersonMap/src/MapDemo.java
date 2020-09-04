import javax.xml.bind.ValidationException;
import java.util.Scanner;

public class MapDemo {
    public static void main(String[] args) throws ValidationException {
        Scanner scanner = new Scanner(System.in);
        PersonMap personMap = new PersonMap();

        System.out.println("to create a person enter 0. enter 1 to exit");
        String input = scanner.nextLine();
        while (!input.equals("1")) {
            if (!input.equals("0")) {
                throw new ValidationException("invalid input");
            } else {
                System.out.println("enter the name of the person");
                String name = scanner.nextLine();
                System.out.println("enter the surname of the person");
                String surname = scanner.nextLine();
                System.out.println("enter the age");
                int age = scanner.nextInt();
                System.out.println("enter the salary");
                int salary = scanner.nextInt();
                scanner.nextLine();
                System.out.println("enter the email");
                String email = scanner.nextLine();
                Person person = new Person(name, surname);
                person.setAge(age);
                person.setSalary(salary);
                person.setEmail(email);
                personMap.addByEmail(person.getName(), person.getEmail());
                personMap.addBySurname(person.getName(), person.getSurname());


                System.out.println("To create a person enter 0. enter 1 to exit");
                input = scanner.nextLine();
            }
        }


        personMap.nameAndEmails();
        personMap.nameAndSurnames();
        System.exit(0);



    }
}
