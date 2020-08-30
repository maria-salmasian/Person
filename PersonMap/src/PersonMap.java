import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.Multimap;

public class PersonMap {

    Multimap<String, String> mapNameEmail = ArrayListMultimap.create();
    Multimap<String, String> mapNameSurname = ArrayListMultimap.create();

    public void addByEmail(String name, String email) {
        mapNameEmail.put(name, email);
    }

    public void addBySurname(String name, String surname) {
        mapNameSurname.put(name, surname);
    }

    public void nameAndEmails() {
        for (String key : mapNameEmail.keySet()) {
            System.out.println(key + ": " + mapNameEmail.get(key));
        }
    }


    public void nameAndSurnames() {
        for (String key : mapNameSurname.keySet()) {
            System.out.println(key + ": " + mapNameSurname.get(key));
        }
    }

}
