import java.time.LocalDate;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Person implements Comparable<Person> {
    private final String name, surname;
    private final LocalDate birth;
    private final Set<Person> children;

    public Person(String name, String surname, LocalDate birth) {
        this.name = name;
        this.surname = surname;
        this.birth = birth;
        this.children = new HashSet<>();
    }


    public boolean adopt(Person child) {
        if (child == this)
            return false;
        return children.add(child);
    }

    public Person getYoungestChild() {
        if (children.isEmpty())
            return null;

//        return children.stream().max(Person::compareTo).get();
          return Collections.max(children);

//        Person youngest = null;
//        for(Person child: children) {
//            if(youngest == null || child.birth.isAfter(youngest.birth)) {
//                youngest = child;
//            }
//        }
//        return youngest;
    }

        public List<Person> getChildren() {
        return children.stream().sorted().toList();

        }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", birth=" + birth +
                ", children=" + children +
                '}';
    }


    @Override
    public int compareTo(Person o) {
        int diff = this.birth.getYear() - o.birth.getYear();
        if(diff == 0) {
            diff = this.birth.getMonthValue() - o.birth.getMonthValue();
            if(diff == 0) {

            }
        }
        return diff;
    }

}
