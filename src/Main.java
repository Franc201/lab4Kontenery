import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new LinkedList<>();
        //Dodawanie do listy
        personList.add(new Person(
                "Maksym", "Lurie",
                LocalDate.of(2004, 11, 15)
        ));
        //pobieranie elementu
        System.out.println(personList.get(0));
        personList.add(new Person(
                "Andrzej", "Krajka",
                LocalDate.of(2024, 12, 12)
        ));
        personList.add(new Person(
                "Anna", "Kowalska",
                LocalDate.of(1800, 9, 15)
        ));
        personList.add(new Person(
                "Adam", "Krucz",
                LocalDate.of(2020, 2, 14)
        ));
        System.out.println(personList.get(0).adopt((Person) personList.get(1)));
        System.out.println(personList.get(0).adopt((Person) personList.get(1)));
        System.out.println(personList.get(0).adopt((Person) personList.get(2)));
        System.out.println(personList.get(0).adopt((Person) personList.get(0)));
        personList.get(0).adopt((personList.get(3)));

        //wyswatlania elementow listy
        System.out.println("Rozmiar Listy: "+personList.size());
        for (Person p: personList) {
            System.out.println(p);
        }

        System.out.println(personList.get(2).getYoungestChild());
        System.out.println(personList.get(0).getYoungestChild());
        System.out.println(personList.get(0).getChildren());


    }
}